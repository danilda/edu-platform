package com.online.school.started.repositories.lessons;

import com.online.school.started.entites.lessons.Subject;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubjectRepository extends CrudRepository<Subject, Long> {

    Subject findByName(String name);
}
