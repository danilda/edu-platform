package com.online.school.started;

import com.online.school.started.handlers.ClazzApiHandler;
import com.online.school.started.handlers.lessons.LessonApiHandler;
import com.online.school.started.handlers.UserApiHandler;
import com.online.school.started.handlers.lessons.SubjectApiHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.GET;

@Configuration
public class RouterConfig {

    @Autowired
    UserApiHandler userHandler;

    @Autowired
    ClazzApiHandler clazzHandler;

    @Autowired
    LessonApiHandler lessonHandler;

    @Autowired
    SubjectApiHandler subjectHandler;


    @Bean
    public RouterFunction<ServerResponse> userRouting() {
        return RouterFunctions
                .route(GET("/user"), userHandler::getAll)
                .andRoute(GET("/user/{id}"), userHandler::get)
                .andRoute(GET("/clazz"), clazzHandler::getAll)
                .andRoute(GET("/clazz/{id}"), clazzHandler::get)
                .andRoute(GET("/lesson"), lessonHandler::getAll)
                .andRoute(GET("/lesson/{id}"), lessonHandler::get)
                .andRoute(GET("/subject"), subjectHandler::getAll)
                .andRoute(GET("/subject/{id}"), subjectHandler::get);
    }
}
