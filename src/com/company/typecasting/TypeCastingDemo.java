package com.company.typecasting;
/*
* TypeCasting is the process of converting one Data types into another
* Types of Type Casting
* Implicitly
* explicitly
*
* Implicitly Type Casting in Primitive
* lower -> higher
* Explicitly Type Casting in Primitive
* higher -> lower
*
*
 * Implicitly Type Casting in Reference
 * child->parent
 * Explicitly Type Casting in Reference
 * parent->child
* Internal of Explicitly Type Casting
* datatype varaible name = (datatype)anoterdatatype;
* Casting Data check against positive range of converting data type range it will in range val is assigned to new variable
* else if check in negative range and convert the as per cycle
* if value is beybond the range and according to cycle we get value
* See Following examples
*
*
* */

public class TypeCastingDemo {

    public static void main(String[] args) {
        //Implicityly Type Casting
        byte b = 10;
        short s = b;
        int a = s;
        long l=a;
        char c= 'A';
        int unicodeofA = (int)c;
        float f = 10.00f;
        double d = f;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(f);
        System.out.println(l);
        System.out.println(s);
        System.out.println(unicodeofA);

        //Explicitly Type Casting in Primitive
        byte exbyte = (byte)s;
        short extshort=(short) a;
        int extint =  (int)l;
        int extfromfloat = (int)f;//Data after . is discard
        float extdouble =(float) d;
        System.out.println(exbyte);
        System.out.println(extshort);
        System.out.println(extint);
        System.out.println(extfromfloat);
        System.out.println(extdouble);
    }
}
/**/