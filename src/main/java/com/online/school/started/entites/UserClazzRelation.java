package com.online.school.started.entites;

import javax.persistence.*;

//@Entity
public class UserClazzRelation {

    @Id
    @GeneratedValue
    Long id;

    @MapsId
    @OneToOne
    @Column(name = "user_id")
    User user;

    @MapsId
    @OneToOne
    @Column(name = "clazz_id")
    Clazz clazz;
}
