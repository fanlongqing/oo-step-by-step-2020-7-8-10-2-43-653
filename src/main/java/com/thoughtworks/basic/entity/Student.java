package com.thoughtworks.basic.entity;

public class Student extends Person {
    private String classNumber;

    public String introduce(String name, String age,String classNumber) {
        String person =super.introduce(name, age);
        return person+" I am a Student of Class "+classNumber+"." ;

    }
}
