package com.online.school.started.entites.lessons;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Subject {

    @Id
    @GeneratedValue
    Long id;

    @NotNull
    String name;
}
