package com.thoughtworks.basic.entity;

public class Person {
    private String name;
    private String age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String introduce(String name,String age){
        String c= "test";
        return "My name is " +name+". I am "+ age+" years old." ;

    }
}
