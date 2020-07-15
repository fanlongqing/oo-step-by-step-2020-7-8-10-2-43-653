package com.thoughtworks.basic;

import com.thoughtworks.basic.entity.KClass;
import com.thoughtworks.basic.entity.Person;
import com.thoughtworks.basic.entity.Student;
import com.thoughtworks.basic.entity.Teacher;
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

}
