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
}
