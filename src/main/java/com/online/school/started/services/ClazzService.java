package com.online.school.started.services;

import com.online.school.started.entites.Clazz;
import com.online.school.started.repositories.ClazzRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import reactor.core.scheduler.Scheduler;

@Service
public class ClazzService extends BasicEntityService<ClazzRepository, Clazz> {

    public ClazzService(ClazzRepository repository, @Qualifier("jdbcScheduler") Scheduler scheduler) {
        super(repository, scheduler);
    }
}
