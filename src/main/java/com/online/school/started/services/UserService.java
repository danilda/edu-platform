package com.online.school.started.services;

import com.online.school.started.entites.User;
import com.online.school.started.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import reactor.core.scheduler.Scheduler;

@Service
public class UserService extends BasicEntityService<UserRepository, User> {

    @Autowired
    public UserService(UserRepository repository, @Qualifier("jdbcScheduler") Scheduler scheduler) {
        super(repository, scheduler);
    }
}
