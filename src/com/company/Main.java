package com.company;

import java.util.Scanner;

public class Main {

    private static Object keyboard;

    public static void main(String[] args) {
        // testOddness


        int positiveNumber;
        Scanner keyboard;
        keyboard = new Scanner(System.in);
        int number = 17;
        System.out.println("positive number");
        positiveNumber = keyboard.nextInt();
        System.out.println("Number is even: "+(number % 2 ==0));
        System.out.println("Number is odd: "+(number % 2 !=0));

        //Keep Contained
        keyboard = new Scanner(System.in);


        System.out.println("give a positive number");
        positiveNumber = keyboard.nextInt();
        System.out.println("The number contained is"+((positiveNumber%8)+5));

        //Last Digit
        keyboard = new Scanner(System.in);

        System.out.println("Give a number that is 4 digits long");
        positiveNumber = keyboard.nextInt();
        System.out.println("The last digit of the number is "+((positiveNumber%10)+0));










        ;

    }

}

