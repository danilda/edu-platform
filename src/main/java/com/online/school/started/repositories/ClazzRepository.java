package com.online.school.started.repositories;

import com.online.school.started.entites.Clazz;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClazzRepository extends CrudRepository<Clazz, Long> {
}
