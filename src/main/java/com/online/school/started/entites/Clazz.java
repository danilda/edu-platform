package com.online.school.started.entites;


import javax.persistence.*;

@Entity
@Table(name = "clazz")
public class Clazz {

    @Id
    @GeneratedValue
    private Long id;

    @MapsId
    @OneToOne
    @JoinColumn(name = "class_teacher_id")
    private User classTeacher;

    @Column(name = "education_year")
    private byte educationYear;

    @Column(name = "literal_identifier")
    private char literalIdentifier;

    private String specialization;

    @Column(name = "start_education_year")
    private short startEducationYear;

    public Long getId() {
        return id;
    }

    public User getClassTeacher() {
        return classTeacher;
    }

    public Clazz setClassTeacher(User classTeacher) {
        this.classTeacher = classTeacher;
        return this;
    }

    public byte getEducationYear() {
        return educationYear;
    }

    public Clazz setEducationYear(byte educationYear) {
        this.educationYear = educationYear;
        return this;
    }

    public char getLiteralIdentifier() {
        return literalIdentifier;
    }

    public Clazz setLiteralIdentifier(char literalIdentifier) {
        this.literalIdentifier = literalIdentifier;
        return this;
    }

    public String getSpecialization() {
        return specialization;
    }

    public Clazz setSpecialization(String specialization) {
        this.specialization = specialization;
        return this;
    }

    public short getStartEducationYear() {
        return startEducationYear;
    }

    public Clazz setStartEducationYear(short startEducationYear) {
        this.startEducationYear = startEducationYear;
        return this;
    }
}
