package com.company.nonstaticdemo;

/*
* Non static block is load before constructor of class
* it is specific to class object
* Every time when new object is created it non static block is called
* It is also called instance block
*
* */

public class SimpleNonStaticBlock {

    {
        System.out.println("I am Non Static Block and Call Before Any Object Creation");
    }
    public SimpleNonStaticBlock()
    {
        System.out.println("I am in Default Contructor");
    }

}
