package com.thoughtworks.basic.entity;

import java.util.List;

public class KClass {
    private String classNumber;
    private List<Student> students;
    private Teacher teacher;

    public KClass(String classNumber, List<Student> students) {
        this.classNumber = classNumber;
        this.students = students;

    }
    public KClass(String classNumber, List<Student> students, Teacher teacher) {
        this.classNumber = classNumber;
        this.students = students;
        this.teacher = teacher;
    }

    public String getClassNumber() {
        return classNumber;
    }

    public void setClassNumber(String classNumber) {
        this.classNumber = classNumber;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
}
