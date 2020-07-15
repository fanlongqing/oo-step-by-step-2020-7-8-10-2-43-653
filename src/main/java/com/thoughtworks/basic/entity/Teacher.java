package com.thoughtworks.basic.entity;

public class Teacher extends Person {
    private String job;

    public Teacher(String name, String age, String job) {
        super(name, age);
        this.job = job;
    }

    public String introduce() {
        String person =super.introduce();
        return person+" I am a "+job+"." ;

    }

}
