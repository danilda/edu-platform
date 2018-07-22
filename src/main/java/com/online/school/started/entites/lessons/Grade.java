package com.online.school.started.entites.lessons;

import com.online.school.started.entites.User;
import com.online.school.started.util.grade.ApproveStatus;

import javax.persistence.*;

public class Grade {

    @Id
    @GeneratedValue
    Long id;

    @MapsId
    @ManyToOne
    @JoinColumn(name = "lesson_id")
    Lesson lesson;

    @MapsId
    @ManyToOne
    @JoinColumn(name = "user_id")
    User user;

    ApproveStatus approveStatus;

    String comment;
}
