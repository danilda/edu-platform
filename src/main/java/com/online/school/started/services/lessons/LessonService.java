package com.online.school.started.services.lessons;

import com.online.school.started.entites.lessons.Lesson;
import com.online.school.started.repositories.lessons.LessonRepository;
import com.online.school.started.services.BasicEntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import reactor.core.scheduler.Scheduler;

@Service
public class LessonService extends BasicEntityService<LessonRepository, Lesson> {

//    @Autowired
    public LessonService(LessonRepository repository, @Qualifier("jdbcScheduler") Scheduler scheduler) {
        super(repository, scheduler);
    }
}
