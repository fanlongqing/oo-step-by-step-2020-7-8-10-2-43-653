package com.thoughtworks.basic.entity;

public class Student extends Person {
    private KClass kClass;

    public Student(String name,String age) {
        super(name, age);
    }
    public Student(String name, String age, KClass kClass) {
        super(name, age);
        this.kClass = kClass;
    }

    public String introduce() {
        String person =super.introduce();
        return person+" I am a Student of Class "+kClass.getClassNumber()+"." ;

    }

    public KClass getClassNumber() {
        return kClass;
    }

    public void setClassNumber(KClass classNumber) {
        this.kClass = classNumber;
    }
}
