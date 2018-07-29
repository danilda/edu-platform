package com.online.school.started.entites.events;

import com.online.school.started.entites.User;

import javax.persistence.*;

public class Event {

    @Id
    @GeneratedValue
    Long id;

    @MapsId
    @ManyToOne
    @JoinColumn(name = "user_id")
    User user;

//    @MapsId
//    @OneToOne
//    @Column(name = "image_link_id")
//    ImageLink photo;

    String description;
}
