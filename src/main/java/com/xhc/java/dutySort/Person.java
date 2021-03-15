package com.xhc.java.dutySort;

public class Person {

    public Person(String name, String duty) {
        this.name = name;
        this.duty = duty;
    }

    public String name = "";

    public String duty = "";

    @Override
    public String toString() {
        return "name:" + name + ", duty:" + duty;
    }
}
