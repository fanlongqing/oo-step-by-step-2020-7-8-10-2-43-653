package com.thoughtworks.basic;

import com.thoughtworks.basic.entity.Person;
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

}
