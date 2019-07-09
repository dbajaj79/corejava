package com.company.typecasting.typecastingbeyondrange;
/*
* Type Casting beyond Range
* if the value range is beyond the converted data type range then
* JVM First check positive values
* Then Move to Negative values
* value is more than it will work like cycle
* Assign the according to cycle
* Example :
* int a =130;
* byte b = (byte)a;
* print(b); //-126
* Lets  check By b is -126
* Total Range value of byte 0->127 -128-0
* mean 130 is beyond 127 then -128 equalant to 128,-127 equalvant to 129 and -126 equalvant to 130
*
* Example 2:
* int a = 612;
* byte b = (byte)a;
* char c = (char)b; print d
*
* Lets check by  c is d
* Range of byte is 0-256
* mean 2 Cycles in Clockwise 2*256 = 512
* 612 - 512 = 100
* unicode char of 100 is d
* */


public class TypeCastingBeyondRange {

    public static void main(String[] args) {
        int a = 130;
        byte result = (byte)a;
        System.out.println("Result="+result);

        int b = 612;
        byte bbyte = (byte)b;
        char c = (char)bbyte;
        System.out.println(c);
    }
}
