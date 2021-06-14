package oop.assignment2.ex34.base;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Jesus Rodriguez
 */
import java.util.Scanner;

public class Solution34 {
    private static final Scanner myObj = new Scanner(System.in);

    private static String JSmith;
    private static String JJackson;
    private static String CJones;
    private static String ACullen;
    private static String JGoodwin;
    private static int numberofemployee;
    private static String removal;

    public static void main(String[] args) {

        System.out.println("There are 5 employees");
        System.out.println("John Smith");
        System.out.println("Jackie Jackson");
        System.out.println("Chris Jones");
        System.out.println("Amanda Cullen");
        System.out.println("Jeremy Goodwin");

        readUserInput();

    }

    public static void readUserInput(){
        System.out.println("Enter an employee name to remove: ");
            removal = myObj.next();

        if(!removal.equals("John Smith"))
            System.out.println("");
    }
}

