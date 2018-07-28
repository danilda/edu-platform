package com.online.school.started.handlers.api.v0;

import com.online.school.started.entites.User;
import com.online.school.started.repositories.UserRepository;
import com.online.school.started.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserApiHandler extends BasicEntityApiHandler<UserService, UserRepository, User> {

    @Autowired
    public UserApiHandler(UserService service) {
        super(service, User.class);
    }

}
