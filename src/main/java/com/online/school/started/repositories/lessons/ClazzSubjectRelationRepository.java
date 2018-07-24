package com.online.school.started.repositories.lessons;

import com.online.school.started.entites.lessons.ClazzSubjectRelation;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClazzSubjectRelationRepository extends CrudRepository<ClazzSubjectRelation, Long> {
}
