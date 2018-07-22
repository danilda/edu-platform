package com.online.school.started.handlers;

import com.online.school.started.entites.User;
import com.online.school.started.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Optional;

@Component
public class UserApiHandler {

    private final UserService service;

    @Autowired
    public UserApiHandler(UserService service) {
        this.service = service;
    }

    public Mono<ServerResponse> get(ServerRequest request) {
        long id = Long.parseLong(request.pathVariable("id"));
        Mono<User> user = service.get(id);
        return user.flatMap(this::packUser).switchIfEmpty(notFound());
    }

    private Mono<ServerResponse> packUser(User user) {
        if(user != null) {
            return ServerResponse.ok().contentType(MediaType.APPLICATION_JSON).body(BodyInserters.fromObject(user));
        }
        return null;
    }

    public Mono<ServerResponse> getAll(ServerRequest request) {
        Flux<User> allUsers = this.service.getAll();

        return ServerResponse.ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body(allUsers, User.class);
    }

    private Mono<ServerResponse> notFound() {
        return ServerResponse.notFound().build();
    }


}
