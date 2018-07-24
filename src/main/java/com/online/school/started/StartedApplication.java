package com.online.school.started;

import com.online.school.started.services.ClazzService;
import com.online.school.started.services.lessons.LessonService;
import com.online.school.started.services.lessons.SubjectService;
import com.online.school.started.services.UserService;
import com.online.school.started.util.test.DataBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.config.EnableWebFlux;
import reactor.core.publisher.Mono;

@SpringBootApplication
@EnableWebFlux
public class StartedApplication {

    @Autowired
    UserService userService;

    @Autowired
    ClazzService clazzService;

    @Autowired
    LessonService lessonService;

    @Autowired
    SubjectService subjectService;

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(StartedApplication.class);
        app.setWebApplicationType(WebApplicationType.REACTIVE);

        app.run(args);
    }

    @Bean
    public CommandLineRunner demo() {
        return (args) -> {
            userService.save(Mono.fromSupplier(DataBuilder::getUser)).subscribe();
            userService.save(Mono.fromSupplier(DataBuilder::getUser)).subscribe();
            userService.save(Mono.fromSupplier(DataBuilder::getUser)).subscribe();
            userService.save(Mono.fromSupplier(DataBuilder::getTeacher)).subscribe();

            clazzService.save(Mono.just(DataBuilder.getClazz(DataBuilder.getUser()))).subscribe();

            subjectService.save(Mono.just(DataBuilder.getSubject("Математика"))).subscribe();
            subjectService.save(Mono.just(DataBuilder.getSubject("English"))).subscribe();
            subjectService.save(Mono.just(DataBuilder.getSubject("Информатика"))).subscribe();
            subjectService.save(Mono.just(DataBuilder.getSubject("Физика"))).subscribe();

            lessonService.save(Mono.just(DataBuilder.getLesson()));
            lessonService.save(Mono.just(DataBuilder.getLesson()));
            lessonService.save(Mono.just(DataBuilder.getLesson()));
            lessonService.save(Mono.just(DataBuilder.getLesson()));
        };
    }
}
