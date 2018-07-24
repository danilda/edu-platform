package com.online.school.started.entites.lessons;

import com.online.school.started.entites.User;
import com.online.school.started.entites.schedule.ScheduleTemplate;

import javax.persistence.*;
import java.util.Date;

@Entity
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

//    @MapsId
//    @ManyToOne
//    @JoinColumn(name = "subject_id")
//    Subject subject;

    @MapsId
    @ManyToOne
    @JoinColumn(name = "templat_id")
    ScheduleTemplate template;

    public Long getId() {
        return id;
    }

    public ClazzSubjectRelation getSubjectRelation() {
        return subjectRelation;
    }

    public Date getDate() {
        return date;
    }

    public byte getLessonNumber() {
        return lessonNumber;
    }

    public User getTeacher() {
        return teacher;
    }

    public String getRoom() {
        return room;
    }

//    public Subject getSubject() {
//        return subject;
//    }

    public ScheduleTemplate getTemplate() {
        return template;
    }

    public Lesson setId(Long id) {
        this.id = id;
        return this;
    }

    public Lesson setSubjectRelation(ClazzSubjectRelation subjectRelation) {
        this.subjectRelation = subjectRelation;
        return this;
    }

    public Lesson setDate(Date date) {
        this.date = date;
        return this;
    }

    public Lesson setLessonNumber(byte lessonNumber) {
        this.lessonNumber = lessonNumber;
        return this;
    }

    public Lesson setTeacher(User teacher) {
        this.teacher = teacher;
        return this;
    }

    public Lesson setRoom(String room) {
        this.room = room;
        return this;
    }

//    public Lesson setSubject(Subject subject) {
//        this.subject = subject;
//        return this;
//    }

    public Lesson setTemplate(ScheduleTemplate template) {
        this.template = template;
        return this;
    }
}
