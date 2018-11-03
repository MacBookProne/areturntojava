package com.justino;

public class Main {

    public static void main(String[] args) {
        //int has a width of 32
        int myMinValue = -214748368;
        int myMaxValue = 214748368;
        int myTotal = (myMinValue/2);
        System.out.println("myTotal = " + myTotal);
        //byte has a width of 8.
        byte myByteValue = -128;

        //short has a width of 16

        short myShortValue = 32767;

        //long value has a width of 64
        long myLongValue = 100L;

        byte byteValue = 10;
        short shortValue = 20;
        int intValue = 50;
        long longTotal = 50000L + 10L * ( byteValue + shortValue + intValue);

        System.out.println("longTotal = " + longTotal);
    }
}
