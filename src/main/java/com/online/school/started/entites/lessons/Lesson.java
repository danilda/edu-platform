package com.online.school.started.entites.lessons;

import com.online.school.started.entites.Subject;
import com.online.school.started.entites.User;
import com.online.school.started.entites.schedule.ScheduleTemplate;

import javax.persistence.*;
import java.util.Date;

public class Lesson {

    @Id
    @GeneratedValue
    Long id;

    @MapsId
    @ManyToOne
    @JoinColumn(name = "clazz_subject_relation_id")
    ClazzSubjectRelation subjectRelation;

    Date date;

    @Column(name = "lesson_number")
    byte lessonNumber;

    @MapsId
    @ManyToOne
    @JoinColumn(name = "teacher_id")
    User teacher;

    String room;

    @MapsId
    @ManyToOne
    @JoinColumn(name = "subject_id")
    Subject subject;

    @MapsId
    @Column(name = "template_id")
    ScheduleTemplate template;
}
