package com.online.school.started;

import com.online.school.started.handlers.UserApiHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.GET;

@Configuration
public class RouterConfig {

    @Bean
    public RouterFunction<ServerResponse> userRouting(UserApiHandler handler) {
        return RouterFunctions
                .route(GET("/user"), handler::getAll)
                .andRoute(GET("/user/{id}"), handler::get);
//                .andRoute(POS)
    }
}
