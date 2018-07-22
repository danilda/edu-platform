package com.online.school.started.repositories.events;

import com.online.school.started.entites.events.EventConsumer;
import org.springframework.data.repository.CrudRepository;

public interface EventConsumerRepository extends CrudRepository<EventConsumer, Long> {
}
