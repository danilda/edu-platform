package com.online.school.started;

import com.online.school.started.handlers.ClazzApiHandler;
import com.online.school.started.handlers.UserApiHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.GET;

@Configuration
public class RouterConfig {

    private final UserApiHandler userHandler;

    private final ClazzApiHandler clazzHandler;

    @Autowired
    public RouterConfig(UserApiHandler userHandler, ClazzApiHandler clazzHandler) {
        this.userHandler = userHandler;
        this.clazzHandler = clazzHandler;
    }

    @Bean
    public RouterFunction<ServerResponse> userRouting() {
        return RouterFunctions
                .route(GET("/user"), userHandler::getAll)
                .andRoute(GET("/user/{id}"), userHandler::get)
                .andRoute(GET("/clazz"), clazzHandler::getAll)
                .andRoute(GET("/clazz/{id}"), clazzHandler::get);
    }
}
