package com.online.school.started.services;

import com.online.school.started.entites.User;
import com.online.school.started.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.core.scheduler.Scheduler;

@Service
public class UserService {

    private final UserRepository repository;
    private final Scheduler scheduler;

    public UserService(UserRepository repository, @Qualifier("jdbcScheduler") Scheduler scheduler) {
        this.repository = repository;
        this.scheduler = scheduler;
    }

    public Mono<User> get(Long id) {
        return Mono.justOrEmpty(repository.findById(id)).publishOn(scheduler);
    }

    public Flux<User> getAll() {
        return Flux.fromIterable(repository.findAll()).publishOn(scheduler);
    }

    public Mono<Void> save(Mono<User> user) {
        return user.flatMap(this::save);
    }

    public Mono<Void> save(User user) {
        return Mono.fromCallable(() -> repository.save(user)).publishOn(scheduler).then();
    }


}
