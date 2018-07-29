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

    public Subject() {
    }

    public Subject(@NotNull String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public Subject setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Subject setName(String name) {
        this.name = name;
        return this;
    }
}
