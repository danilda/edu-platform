package com.online.school.started.repositories;

import com.online.school.started.entites.TeacherSpecialization;
import com.online.school.started.entites.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TeacherSpecializationRepository extends CrudRepository<TeacherSpecialization, Long> {

    List<TeacherSpecialization> findAllByTeacher(User teacher);

    List<TeacherSpecialization> findAllBySpecializationEquals(String Specialization);

}
