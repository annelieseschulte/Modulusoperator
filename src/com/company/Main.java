package com.company;

import java.util.Scanner;

public class Main {

    private static Object keyboard;

    public static void main(String[] args) {
        // testOddness


        String positiveNumber;
        Scanner keyboard;
        keyboard = new Scanner(System.in);
        int number = 17;
        System.out.println("positive number");
        positiveNumber = keyboard.nextLine();
        System.out.println("Number is even: "+(number % 2 ==0));
        System.out.println("Number is odd: "+(number % 2 !=0));


;

    }

}

