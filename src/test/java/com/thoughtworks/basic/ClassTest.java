package com.thoughtworks.basic;

import com.thoughtworks.basic.entity.KClass;
import com.thoughtworks.basic.entity.Person;
import com.thoughtworks.basic.entity.Student;
import com.thoughtworks.basic.entity.Teacher;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class ClassTest {
    @Test
    public void person_test() {
        //given
        Person person=new Person("Tome","21");

        //when
        String actual =   person.introduce();

        //then
        assertEquals(actual,"My name is Tome. I am 21 years old.");
    }
    @Test
    public void student_test() {
        //given
        List<Student> students=new ArrayList<>();
        KClass kClass=new KClass("2",students);
        Student student=new Student("Tom","21",kClass);
        //when
        String actual =student.introduce();
        //then
        assertEquals(actual,"My name is Tom. I am 21 years old. I am a Student of Class 2.");
    }

    @Test
    public void teacher_test() {
        //given
        Teacher teacher=new Teacher("Matt","30","Teacher");

        //when
        String actual =teacher.introduce();

        //then
        assertEquals(actual,"My name is Matt. I am 30 years old. I am a Teacher.");
    }


    @Test
    public void class_test() {
        //given
        List<Student> students = new ArrayList<>();
        Student student1 = new Student("张山","23");
        Student student2 = new Student("李四","20");
        Student student3 = new Student("刘能","18");
        students.add(student1);
        students.add(student2);
        students.add(student3);
        Teacher teacher = new Teacher("Matt","30","Teacher");
        KClass myclass = new KClass("2",students,teacher);
        student1.setKClass(myclass);
        student2.setKClass(myclass);
        student3.setKClass(myclass);



        //when
        List<Student> studentsResult = myclass.getStudents();
        //then
        Assert.assertEquals(studentsResult.size(),3);

    }


}
