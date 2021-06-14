package oop.assignment2.ex29.base;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Jesus Rodriguez
 */
import java.util.Scanner;

public class Solution29 {
    private static final Scanner myObj = new Scanner(System.in);

    private static String rate;
    private static int years;

    public static void main(String[] args) {
        readUserInput();


        System.out.println("It will take " + years + " years to double you r initial investment");

    }

    public static void readUserInput(){
        System.out.println("What is the rate of return? ");
            rate = myObj.next();

        int rateparse = Integer.parseInt(rate);

        Character.isLetter(rate);

        while((Character.isLetter(rate) || rateparse < 0)){
            System.out.println("Sorry. That's not a valid input");
            System.out.println("What is the rate of return? ");
        }
        double rateint = Integer.parseInt(rate);
        years = (int) (72.0 / rateparse);
    }
}
