package oop.assignment2.ex27.base;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Jesus Rodriguez
 */
import java.util.Scanner;

public class Solution27 {
    private static final Scanner myObj = new Scanner(System.in);

    private static String FirstName;
    private static String LastName;
    private static String zip;
    private static String eID;

    public static void main(String[] args) {
        readUserInput();
        validateInput ad = new validateInput();

        String resultF = ad.Fname(FirstName);
        String resultL = ad.Lname(LastName);
        String resultZ = ad.validzip(zip);
        String resultE = ad.EmployeeID(eID);

        if(resultF == resultE && resultL == resultZ && resultE == resultL && resultF == resultZ)
            System.out.println("There were no errors found");

        if(!resultF.equals('1'))
            System.out.print("");
        else
            System.out.println(resultF);

        if(!resultL.equals('1'))
            System.out.print("");
        else
            System.out.println(resultL);

        if(!resultZ.equals('1'))
            System.out.print("");
        else
            System.out.println(resultZ);

        if(!resultE.equals('1'))
            System.out.print("");
        else
            System.out.println(resultE);
    }

    public static void readUserInput() {
        System.out.print("Enter the first name: ");
            FirstName = myObj.next();

        System.out.print("Enter the last name: ");
            LastName = myObj.next();

        System.out.print("Enter the ZIP code: ");
            zip = myObj.next();

        System.out.print("Enter the employee ID: ");
            eID = myObj.next();
    }


}
