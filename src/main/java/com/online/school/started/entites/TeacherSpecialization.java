package com.online.school.started.entites;

import javax.persistence.*;

@Entity
public class TeacherSpecialization {

    @Id
    @GeneratedValue
    private Long id;

    @MapsId
    @ManyToOne
    @JoinColumn(name = "child_id")
    private User teacher;

    private String specialization;

    public TeacherSpecialization(User teacher, String specialization) {
        this.teacher = teacher;
        this.specialization = specialization;
    }

    public Long getId() {
        return id;
    }

    public TeacherSpecialization setId(Long id) {
        this.id = id;
        return this;
    }

    public User getTeacher() {
        return teacher;
    }

    public TeacherSpecialization setTeacher(User teacher) {
        this.teacher = teacher;
        return this;
    }

    public String getSpecialization() {
        return specialization;
    }

    public TeacherSpecialization setSpecialization(String specialization) {
        this.specialization = specialization;
        return this;
    }
}
