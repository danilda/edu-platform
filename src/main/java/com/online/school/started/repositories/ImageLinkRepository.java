package com.online.school.started.repositories;

import com.online.school.started.entites.ImageLink;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface ImageLinkRepository extends CrudRepository<ImageLink, Long> {
}
