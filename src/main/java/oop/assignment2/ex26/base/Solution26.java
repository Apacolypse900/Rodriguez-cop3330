package oop.assignment2.ex26.base;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Jesus Rodriguez
 */
import java.util.Scanner;

public class Solution26 {
    private static final Scanner myObj = new Scanner(System.in);

    private static double balance;
    private static int APR;
    private static double monthPayment;

    public static void main(String[] args) {
        readUserInput();

        System.out.println("It will take you " + PaymentCalculator.calculateMonthUntilPaidOff(balance,APR,monthPayment) + " months to pay off this card");
    }

    public static void readUserInput(){
        System.out.print("What is your balance? ");
            balance = myObj.nextDouble();

        System.out.print("What is the APR on the card (as a percent)? ");
            APR = myObj.nextInt();

        System.out.print("What is the monthly payments you can make? ");
            monthPayment = myObj.nextDouble();
    }
}
