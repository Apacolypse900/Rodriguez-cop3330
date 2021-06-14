package oop.assignment2.ex33.base;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Jesus Rodriguez
 */
import java.util.Scanner;

public class Solution33 {
    private static final Scanner myObj = new Scanner(System.in);

    private static String Question;
    private static int random;
    private static int min = 1;
    private static int max = 4;

    public static void main(String[] args) {

        readUserInput();

    }

    public static void readUserInput(){
        int x = getRandomIntegerBetweenRange(min, max);

        System.out.println("Whats your question? ");
            Question = myObj.next();

        if(x == 1){
            System.out.println("Yes");
        }
        else if(x == 2){
            System.out.println("No");
        }
        else if(x == 3){
            System.out.println("Maybe");
        }
        else
            System.out.println("Ask again later");
    }

    public static int getRandomIntegerBetweenRange(int min, int max){
        int x = (int)(Math.random() * ((max - min) + 1)) + min;
        return x;
    }
}