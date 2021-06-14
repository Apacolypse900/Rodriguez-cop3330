package oop.assignment2.ex36.base;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Jesus Rodriguez
 */
import java.util.Arrays;
import java.util.Scanner;

public class Solution36 {
    private static final Scanner myObj = new Scanner(System.in);

    private static String number;
    private static int addition;
    private static String min;
    private static String max;
    private static double Standard;
    private static int x;
    private static String[] array;

    public static void main(String[] args) {
        //make a loop to ask for number
        //send values to another class for analysis
        //prints out numbers
        //prints out average
        //prints out min and max
        //prints out standard deviation

        readUserInput();

        System.out.println("Numbers: " + Arrays.toString(array));

    }

    public static void readUserInput(){
        System.out.println("Enter a number: ");
            number = myObj.next();

        while(!number.equals("done")){
            System.out.println("Enter a number: ");
                number = myObj.next();
            x++;
            String[] array = new String[x];

        }
    }
}
