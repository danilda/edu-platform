package com.online.school.started.entites.schedule;

import com.online.school.started.entites.Subject;

import javax.persistence.*;

@Entity
public class TemplateItem {

    @Id
    @GeneratedValue
    Long id;

    @MapsId
    @ManyToOne
    @JoinColumn(name = "template_id")
    ScheduleTemplate template;

    /**
     * Index number of day of template
     */
    short dayNumber;

    /**
     * Index number of lesson of day
     */
    byte lessonNumber;

    @MapsId
    @ManyToOne
    @JoinColumn(name = "subject_id")
    Subject subject;
}
