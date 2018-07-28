package com.online.school.started.handlers.api.v0.lessons;

import com.online.school.started.entites.lessons.Subject;
import com.online.school.started.handlers.api.v0.BasicEntityApiHandler;
import com.online.school.started.repositories.lessons.SubjectRepository;
import com.online.school.started.services.lessons.SubjectService;
import org.springframework.stereotype.Component;

@Component
public class SubjectApiHandler extends BasicEntityApiHandler<SubjectService, SubjectRepository, Subject> {

    public SubjectApiHandler(SubjectService service) {
        super(service, Subject.class);
    }
}
