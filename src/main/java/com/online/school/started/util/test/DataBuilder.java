package com.online.school.started.util.test;

import com.online.school.started.entites.Clazz;
import com.online.school.started.entites.User;
import com.online.school.started.entites.lessons.ClazzSubjectRelation;
import com.online.school.started.entites.lessons.Lesson;
import com.online.school.started.entites.lessons.Subject;
import com.online.school.started.util.security.UserRoleEnum;

import java.util.Date;

public class DataBuilder {
    public static User getUser() {
        return new User().setFirstName("Name")
                .setLastName("Last")
                .setMiddleName("Middle")
                .setRole(UserRoleEnum.SUPER_ADMIN)
                .setEmail("da@da.com")
                .setPassword("secure_pass")
                .setPhone("+380660077995")
                .setAddress("Sume Zalyvna st. 39");
    }

    public static User getTeacher() {
        return new User().setFirstName("Teacher")
                .setLastName("Alex")
                .setMiddleName("Alexovich")
                .setRole(UserRoleEnum.TEACHER)
                .setEmail("da@net.com")
                .setPassword("secure_pass")
                .setPhone("+380660077995")
                .setAddress("Sume Zalyvna st. 39");
    }

    public static Clazz getClazz() {
        return getClazz(getTeacher());
    }

    public static Clazz getClazz(User teacher) {
        return new Clazz().setClassTeacher(teacher)
                .setEducationYear((byte) 11)
                .setLiteralIdentifier('a')
                .setSpecialization("Math")
                .setStartEducationYear((short) 1997);
    }

    public static Lesson getLesson() {
        return getLesson(getClazzSubjectRelation(), getTeacher());
    }

    public static Lesson getLesson(ClazzSubjectRelation subjectRelation, User teacher) {
        return new Lesson().setRoom("Room 1")
                .setSubjectRelation(subjectRelation)
                .setDate(new Date())
                .setLessonNumber((byte) 1)
                .setTemplate(null)
                .setTeacher(teacher);
    }

    public static ClazzSubjectRelation getClazzSubjectRelation() {
        return getClazzSubjectRelation(getClazz(), getTeacher(), getSubject("Subject " + Math.random() * 100));
    }

    public static ClazzSubjectRelation getClazzSubjectRelation(Clazz clazz, User teacher, Subject subject) {
        return new ClazzSubjectRelation().setClazz(getClazz())
                .setTeacher(getTeacher())
                .setSubject(subject);
    }

    public static Subject getSubject(String name) {
        return new Subject(name);
    }
}
