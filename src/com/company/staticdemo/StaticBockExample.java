package com.company.staticdemo;

/*
* Static Block execute while class is loading
* It is called one while class is loading first time
* It is execute before main method
* If multiply block in class then jvm execute according to order used in Program
* Use case:
* When we initialize something before execution of program is starts you use static block
* like create a dataconnection before executing start of application
*
* How to Use Static Block please go through the following example:-
* */
public class StaticBockExample {
    public static void main(String[] args) {
        System.out.println("I am in Main Method");

    }
    static {

        System.out.println(" I am Static Block 1");;
    }
    static
    {
        System.out.println("I am Static Block 2");
    }
}
