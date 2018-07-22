package com.online.school.started.entites.events;

import com.online.school.started.entites.User;

import javax.persistence.*;

public class EventConsumer {

    @Id
    @GeneratedValue
    Long id;

    @MapsId
    @ManyToOne
    @JoinColumn(name = "user_id")
    User user;

    @MapsId
    @ManyToOne
    @JoinColumn(name = "event_id")
    Event event;
}
