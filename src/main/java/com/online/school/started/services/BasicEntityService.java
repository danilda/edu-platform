package com.online.school.started.services;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.repository.CrudRepository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.core.scheduler.Scheduler;

public abstract class BasicEntityService<R extends CrudRepository<E, Long>, E> {

    protected final R repository;

    protected final Scheduler scheduler;

    protected BasicEntityService(R repository, @Qualifier("jdbcScheduler") Scheduler scheduler) {
        this.repository = repository;
        this.scheduler = scheduler;
    }

    public Mono<E> get(Long id) {
        return Mono.justOrEmpty(repository.findById(id)).publishOn(scheduler);
    }

    public Flux<E> getAll() {
        return Flux.fromIterable(repository.findAll()).publishOn(scheduler);
    }

    public Mono<Void> save(Mono<E> entity) {
        return entity.flatMap(this::save);
    }

    public Mono<Void> save(E entity) {
        return Mono.fromCallable(() -> repository.save(entity)).publishOn(scheduler).then();
    }
}
