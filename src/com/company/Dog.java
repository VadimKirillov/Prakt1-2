package com.company;

public class Dog {
    public String name;
    int age;

    Dog() {
    }

    Dog(String name) {
        this.name = name;
    }

    Dog(int age) {
        this.age = age;
    }

    Dog(String name, int age) {
        this.age = age;
        this.name = name;
    }

    void setAge(int age) {
        this.age = age;
    }

    void setName(String name) {
        this.name = name;
    }

    int getAge() {
        return this.age;
    }

    String getName() {
        return this.name;
    }

}
