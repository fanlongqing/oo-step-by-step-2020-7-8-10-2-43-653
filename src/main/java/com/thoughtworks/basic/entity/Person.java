package com.thoughtworks.basic.entity;

public class Person {
    private String name;
    private String age;
    private  String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Person(String name, String age) {
        this.name = name;
        this.age = age;
    }

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

    public String introduce(){
        return "My name is " +name+". I am "+ age+" years old." ;

    }
}
