package com.online.school.started.handlers;

import com.online.school.started.entites.User;
import com.online.school.started.services.BasicEntityService;
import org.springframework.data.repository.CrudRepository;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public abstract class BasicEntityApiHandler<S extends BasicEntityService<R, E>, R extends CrudRepository<E, Long>, E> {

    protected final S service;

    protected final Class<E> entityType;

    protected BasicEntityApiHandler(S service, Class<E> entityType) {
        this.service = service;
        this.entityType = entityType;
    }

    public Mono<ServerResponse> get(ServerRequest request) {
        long id = Long.parseLong(request.pathVariable("id"));
        Mono<E> entity = service.get(id);
        return entity.flatMap(this::packEntity).switchIfEmpty(notFound());
    }

    public Mono<ServerResponse> getAll(ServerRequest request) {
        Flux<E> allUsers = this.service.getAll();

        return ServerResponse.ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body(allUsers, entityType);
    }

    protected Mono<ServerResponse> packEntity(E entity) {
        if (entity != null) {
            return ServerResponse.ok().contentType(MediaType.APPLICATION_JSON).body(BodyInserters.fromObject(entity));
        }
        return null;
    }

    protected Mono<ServerResponse> notFound() {
        return ServerResponse.notFound().build();
    }
}
