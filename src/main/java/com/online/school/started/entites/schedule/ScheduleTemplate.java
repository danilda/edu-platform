package com.online.school.started.entites.schedule;

import org.hibernate.validator.constraints.UniqueElements;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
public class ScheduleTemplate {

    @Id
    @GeneratedValue
    Long id;

    @UniqueElements
    @NotNull
    String name;

    Date repeatedPeriod;
}
