package com.company.datatypesinjava;

/*
* DataTypes is type of which is going to store in our program
* In java we can divide data types into two categories
* Primitive  Reference
* Further we can Primitive types into Three Categories
* Number -
* Decimal Number
* Number with points
* Character "A'
* Boolean true /false
*
* Primitive Data Types
* byte     1 byte
* short    2 byte
* int      4 byte
* long     8 byte
* float    4 byte
* double   8 byte
* boolean  true/false
*
* Reference DataType:-
* Array
* String
* class
* etc
*
* Points need to be remember
* datatype identifier = value; //Use Data Type in Java
* int       a          = 10;
* Every Data type has it's own range
* ByDefault Number Value with . is consider as Double in java
* To tell the compiler value . is float you need to write f with value
*
* */

public class DataTypesExmpleinJava {

    public static void main(String[] args) {
        byte b=30;
        short s = 60;
        int a=10;
        long l= 500000;
        char c = 'A';
        float f = 60.0f;
        double d = 566.9101000;
        boolean bool =true;

        System.out.println("Byte DataType:"+b);
        System.out.println("Short DataType:"+s);
        System.out.println("Int Data Type:"+a);
        System.out.println("long Data Type:"+l);
        System.out.println("Char DataType"+c);

        System.out.println("Float DataType:"+f);
        System.out.println("Double DataType:"+d);
        System.out.println("Boolean Type:"+bool);


    }
}
