package com.online.school.started.handlers.api.v0.lessons;

import com.online.school.started.entites.Clazz;
import com.online.school.started.handlers.api.v0.BasicEntityApiHandler;
import com.online.school.started.repositories.ClazzRepository;
import com.online.school.started.services.ClazzService;
import org.springframework.stereotype.Component;

@Component
public class LessonApiHandler extends BasicEntityApiHandler<ClazzService, ClazzRepository, Clazz> {

    public LessonApiHandler(ClazzService service) {
        super(service, Clazz.class);
    }
}
