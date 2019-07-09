package com.company.nonstaticdemo;

public class InstanceVariable {

    public static void main(String[] args) {
        NonStaticMethod nonStaticMethod = new NonStaticMethod();
        nonStaticMethod.greeting();
    }
}
