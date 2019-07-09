package com.company.nonstaticdemo;

import java.lang.reflect.MalformedParameterizedTypeException;
import java.util.HashMap;
import java.util.Map;

public class SimpleInstanceVariable {

    public static void main(String[] args) {
        NonStaticVariable nonStaticVariable = new NonStaticVariable();
        nonStaticVariable.age=20;
        nonStaticVariable.name="Kuldeep";
        Map<Integer,String>names = new HashMap<>();
        names.put(1,"A");

        System.out.println(names.get(2));

        System.out.println(nonStaticVariable.age);
        System.out.println(nonStaticVariable.name);
        NonStaticVariable nonStaticVariable1 = new NonStaticVariable();
        nonStaticVariable1.age=30;
        nonStaticVariable1.name="Pardeep";

        System.out.println(nonStaticVariable1.age);
        System.out.println(nonStaticVariable1.name);
    }
}
