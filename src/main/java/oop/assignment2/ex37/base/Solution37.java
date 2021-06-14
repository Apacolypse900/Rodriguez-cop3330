package oop.assignment2.ex37.base;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Jesus Rodriguez
 */
import java.util.Random;
import java.util.Scanner;

public class Solution37 {
    private static final Scanner myObj = new Scanner(System.in);

    private static int minlength;
    private static int special;
    private static int numbers;
    private static String password;
    private static String[] specialchar = {"~", "`", "!", "@","#","$","%","^","&","*","(",")","-","+","=","{","}","[","]","|", "/",":",";","'","<",">",",",".","?"};
    private static int min = 0;
    private static int max = 32;
    private static int minNum = 0;
    private static int maxNum = 9;

    public static void main(String[] args) {
        readUserInput();

    }

    public static void readUserInput() {


        System.out.println("What's the minimum length? ");
            minlength = myObj.nextInt();

        System.out.println("How many special characters? ");
            special = myObj.nextInt();

        System.out.println("How many numbers");
            numbers = myObj.nextInt();

        Random r = new Random();

        int letterlength = minlength - special - numbers;


        for (int i = 1; i <= letterlength; i++) {
            char c = (char) (r.nextInt(26) + 'a');
            System.out.print(c);
        }

        for (int i = 1; i <= special; i++) {
            int x = getRandomForspecial(min, max);
            System.out.print(specialchar[x]);
        }

        for (int i = 1; i <= numbers; i++) {
            int y = getRandomNumber(minNum, maxNum);
            System.out.print(y);

        }
    }
    public static int getRandomForspecial(int min, int max){
        int x = (int)(Math.random() * ((max - min) + 1)) + min;
        return x;
    }

    public static int getRandomNumber(int min, int max){
        int y = (int)(Math.random() * ((max - min) + 1)) + min;
        return y;
    }
}
