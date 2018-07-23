package com.online.school.started.handlers;

import com.online.school.started.entites.Clazz;
import com.online.school.started.repositories.ClazzRepository;
import com.online.school.started.services.ClazzService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ClazzApiHandler extends BasicEntityApiHandler<ClazzService, ClazzRepository, Clazz> {

    @Autowired
    public ClazzApiHandler(ClazzService service) {
        super(service, Clazz.class);
    }
}
