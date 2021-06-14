package oop.assignment2.ex24.base;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Jesus Rodriguez
 */
import java.util.Scanner;

public class Solution24 {
    private static final Scanner myObj = new Scanner(System.in);

    private static String First;
    private static String Second;

    public static void main(String[] args) {

        System.out.println("Enter two strings and I'll tell you if they are anagrams");

        readUserInput();

        AnagramDetector ad = new AnagramDetector();
        boolean result = ad.isAnagram(First,Second);

        String output = generateOutput(result);

        System.out.print("'" + First + "' and '" + Second + "' ");
        System.out.println(output);
        Scanner myObj = new Scanner(System.in);

    }

    public static void readUserInput(){
        System.out.print("Enter the first string: ");
        First = myObj.next();

        System.out.print("Enter the Second string: ");
        Second = myObj.next();
    }

    public static String generateOutput(boolean isAnagram){
        if(isAnagram)
            return "are anagram";
        else
            return "are not anagram";
    }
}
