package com.thoughtworks.basic;

import com.thoughtworks.basic.entity.Person;
import com.thoughtworks.basic.entity.Student;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClassTest {
    @Test
    public void person_test() {
        //given
        Person person=new Person();

        //when
        String actual =   person.introduce("Tome","21");

        //then
        assertEquals(actual,"My name is Tome. I am 21 years old.");
    }
    @Test
    public void student_test() {
        //given
        Student student=new Student();

        //when
        String actual =student.introduce("Tom","21","2");

        //then
        assertEquals(actual,"My name is Tom. I am 21 years old. I am a Student of Class 2.");
    }
}
