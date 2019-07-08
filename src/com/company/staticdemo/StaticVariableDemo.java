package com.company.staticdemo;

public class StaticVariableDemo {
    public static void main(String[] args) {
        StaticVariableClass.age = 10;
        StaticVariableClass.name="Test";
        System.out.println("Age:"+StaticVariableClass.age);
        System.out.println("Name:"+StaticVariableClass.name);
    }
}
