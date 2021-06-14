package oop.assignment2.ex28.base;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Jesus Rodriguez
 */
import java.util.Scanner;

public class Solution28 {
    private static final Scanner myObj = new Scanner(System.in);

    private static int i;
    private static int addition = 0;
    private static int num;

    public static void main(String[] args) {
        for (i = 0; i < 5; i++) {
            System.out.print("Enter a number:");
                num = myObj.nextInt();
            addition += num;
        }
        System.out.println("The total is " + addition);
    }
}