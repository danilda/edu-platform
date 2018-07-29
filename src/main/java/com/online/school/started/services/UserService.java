package com.online.school.started.services;

import com.online.school.started.entites.TeacherSpecialization;
import com.online.school.started.entites.User;
import com.online.school.started.repositories.TeacherSpecializationRepository;
import com.online.school.started.repositories.UserRepository;
import com.online.school.started.util.security.UserRoleEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import reactor.core.scheduler.Scheduler;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class UserService extends BasicEntityService<UserRepository, User> {

    private final TeacherSpecializationRepository teacherSpecRepository;

    @Autowired
    public UserService(UserRepository repository, @Qualifier("jdbcScheduler") Scheduler scheduler,
                       TeacherSpecializationRepository teacherSpecRepository) {
        super(repository, scheduler);
        this.teacherSpecRepository = teacherSpecRepository;
    }

    public List<Object> findUsersBySpecialization(String specialization) {
        List<TeacherSpecialization> specializations = teacherSpecRepository.findAllBySpecializationEquals(specialization);
        return specializations.stream()
                .map(TeacherSpecialization::getTeacher)
                .distinct()
                .collect(Collectors.toList());
    }

    public List<TeacherSpecialization> getTeacherSpecialization(User teacher) throws IllegalAccessException {
        if (!teacher.getRole().equals(UserRoleEnum.TEACHER)) {
            throw new IllegalAccessException("Current user isn't teacher!");
        }
        return teacherSpecRepository.findAllByTeacher(teacher);
    }

}
