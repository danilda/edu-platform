package com.online.school.started.entites.lessons;

import com.online.school.started.entites.Clazz;
import com.online.school.started.entites.Subject;
import com.online.school.started.entites.User;

import javax.persistence.*;

@Entity
public class ClazzSubjectRelation {

    @Id
    @GeneratedValue
    private Long id;

    @MapsId
    @ManyToOne
    private Clazz clazz;

    @MapsId
    @ManyToOne
    @JoinColumn(name = "teacher_id")
    private User teacher;

    @MapsId
    @ManyToOne
    @JoinColumn(name = "subject_id")
    private Subject subject;

    public Long getId() {
        return id;
    }

    public ClazzSubjectRelation setId(Long id) {
        this.id = id;
        return this;
    }

    public Clazz getClazz() {
        return clazz;
    }

    public ClazzSubjectRelation setClazz(Clazz clazz) {
        this.clazz = clazz;
        return this;
    }

    public User getTeacher() {
        return teacher;
    }

    public ClazzSubjectRelation setTeacher(User teacher) {
        this.teacher = teacher;
        return this;
    }

    public Subject getSubject() {
        return subject;
    }

    public ClazzSubjectRelation setSubject(Subject subject) {
        this.subject = subject;
        return this;
    }
}
