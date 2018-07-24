package com.online.school.started.repositories;

import com.online.school.started.entites.util.ImageLink;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImageLinkRepository extends CrudRepository<ImageLink, Long> {
}
