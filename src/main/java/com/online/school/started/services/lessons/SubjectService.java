package com.online.school.started.services.lessons;

import com.online.school.started.entites.lessons.Subject;
import com.online.school.started.repositories.lessons.SubjectRepository;
import com.online.school.started.services.BasicEntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import reactor.core.scheduler.Scheduler;

@Service
public class SubjectService extends BasicEntityService<SubjectRepository, Subject> {

    @Autowired
    public SubjectService(SubjectRepository repository, @Qualifier("jdbcScheduler") Scheduler scheduler) {
        super(repository, scheduler);
    }
}
