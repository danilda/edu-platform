package com.online.school.started.handlers;

import com.online.school.started.entites.User;
import com.online.school.started.repositories.UserRepository;
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
public class UserApiHandler extends BasicEntityApiHandler<UserService, UserRepository, User> {

    @Autowired
    public UserApiHandler(UserService service) {
        super(service, User.class);
    }

}
