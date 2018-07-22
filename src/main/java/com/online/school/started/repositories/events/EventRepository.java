package com.online.school.started.repositories.events;

import com.online.school.started.entites.events.Event;
import org.springframework.data.repository.CrudRepository;

public interface EventRepository extends CrudRepository<Event, Long> {
}
