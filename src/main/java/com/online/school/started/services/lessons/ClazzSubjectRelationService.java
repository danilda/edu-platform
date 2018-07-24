package com.online.school.started.services.lessons;

import com.online.school.started.entites.lessons.ClazzSubjectRelation;
import com.online.school.started.repositories.lessons.ClazzSubjectRelationRepository;
import com.online.school.started.services.BasicEntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import reactor.core.scheduler.Scheduler;

@Service
public class ClazzSubjectRelationService extends BasicEntityService<ClazzSubjectRelationRepository, ClazzSubjectRelation> {

    @Autowired
    public ClazzSubjectRelationService(ClazzSubjectRelationRepository repository, @Qualifier("jdbcScheduler") Scheduler scheduler) {
        super(repository, scheduler);
    }
}
