package com.online.school.started.repositories.lessons;

import com.online.school.started.entites.lessons.Lesson;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

//@Repository
public interface LessonRepository extends CrudRepository<Lesson, Long> {
}
