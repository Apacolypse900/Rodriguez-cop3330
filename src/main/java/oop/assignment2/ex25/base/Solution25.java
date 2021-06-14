package oop.assignment2.ex25.base;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Jesus Rodriguez
 */
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Solution25 {
    private static final Scanner myObj = new Scanner(System.in);

    private static String Password;
    private static int length = Password.length();

    public static void main(String[] args) {

        //ask for password
        //send it to other class for analysis
        //give response of very weak, weak, strong or very strong
        readuserinput();
        PasswordChecker ad = new PasswordChecker();
        int result = ad.passwordValidator(Password,length);

        String output = generateOutput(result);
        System.out.println("is a ");
        System.out.println(output);
        Scanner myObj = new Scanner(System.in);

    }

    public static void readuserinput(){
        System.out.println("Enter your password: ");
            Password = myObj.next();
    }

    public static String generateOutput(int passwordValidator){
        if(passwordValidator == 1)
            return "very weak password";
        else if(passwordValidator == 2)
            return "weak password";
        else if(passwordValidator == 3)
            return "strong password";
        else if(passwordValidator == 4)
            return "very strong password";
        else
            return " ";
    }

}
