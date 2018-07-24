package com.online.school.started.handlers.lessons;

import com.online.school.started.entites.lessons.ClazzSubjectRelation;
import com.online.school.started.handlers.BasicEntityApiHandler;
import com.online.school.started.repositories.lessons.ClazzSubjectRelationRepository;
import com.online.school.started.services.lessons.ClazzSubjectRelationService;
import org.springframework.stereotype.Component;

@Component
public class ClazzSubjectRelationApiHandler extends BasicEntityApiHandler<ClazzSubjectRelationService, ClazzSubjectRelationRepository, ClazzSubjectRelation> {

    public ClazzSubjectRelationApiHandler(ClazzSubjectRelationService service) {
        super(service, ClazzSubjectRelation.class);
    }
}
