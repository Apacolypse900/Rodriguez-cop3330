package oop.assignment2.ex35.base;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Jesus Rodriguez
 */
import java.util.Scanner;

public class Solution35 {
    private static final Scanner myObj = new Scanner(System.in);

    private static int random;
    private static String name;
    private static int i;
    private static String[] array;
    public static void main(String[] args) {

        readUserInput();
    }

    public static void readUserInput(){

        System.out.println("Enter a name: ");
            name = myObj.next();

        while(!name.equals(" ")){
            System.out.println("Enter a name: ");
            i
        }

    }

    public static int getRandom (int min, int max){
        int x = (int)(Math.random() * ((max - min) + 1)) + min;
        return x;
    }
}