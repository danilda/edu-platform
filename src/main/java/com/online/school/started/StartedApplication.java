package com.online.school.started;

import com.online.school.started.entites.Clazz;
import com.online.school.started.entites.User;
import com.online.school.started.services.UserService;
import com.online.school.started.util.security.UserRoleEnum;
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

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(StartedApplication.class);
        app.setWebApplicationType(WebApplicationType.REACTIVE);

        app.run(args);
    }

    @Bean
    public CommandLineRunner demo(UserService service) {
        return (args) -> {
            service.save(Mono.fromSupplier(this::getUser)).subscribe();
            service.save(Mono.fromSupplier(this::getUser)).subscribe();
            service.save(Mono.fromSupplier(this::getUser)).subscribe();
            service.save(Mono.fromSupplier(this::getTeacher)).subscribe();
        };
    }

    private User getUser() {
        return new User().setFirstName("Name")
                .setLastName("Last")
                .setMiddleName("Middle")
                .setRole(UserRoleEnum.SUPER_ADMIN)
                .setEmail("da@da.com")
                .setPassword("secure_pass")
                .setPhone("+380660077995")
                .setAddress("Sume Zalyvna st. 39");
    }

    private User getTeacher() {
        return new User().setFirstName("Teacher")
                .setLastName("Alex")
                .setMiddleName("Alexovich")
                .setRole(UserRoleEnum.TEACHER)
                .setEmail("da@net.com")
                .setPassword("secure_pass")
                .setPhone("+380660077995")
                .setAddress("Sume Zalyvna st. 39");
    }

    private Clazz getClazz(User user) {
        return new Clazz().setClassTeacher(user)
                .setEducationYear((byte) 11)
                .setLiteralIdentifier('a')
                .setSpecialization("Math")
                .setStartEducationYear((short) 1997);
    }
}
