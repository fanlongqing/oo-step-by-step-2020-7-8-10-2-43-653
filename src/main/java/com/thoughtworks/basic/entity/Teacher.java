package com.thoughtworks.basic.entity;

public class Teacher extends Person {
    private String job;
    public String introduce(String name, String age,String job) {
        String person =super.introduce(name, age);
        return person+" I am a "+job+"." ;

    }

}
