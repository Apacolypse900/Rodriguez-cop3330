package oop.assignment2.ex32.base;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Jesus Rodriguez
 */
import java.util.Random;
import java.util.Scanner;

public class Solution32 {
    public static final Scanner myObj = new Scanner(System.in);

    private static int difficulty;
    private static String playagain;
    private static int guess;
    private static int random;
    private static int numberguess;

    public static void main(String[] args) {

        System.out.println("Let's play Guess that Number!");

        readUserInput();

        System.out.println("Do you wish to play again (Y/N)? ");
            playagain = myObj.next();
    }

    public static void readUserInput(){
        System.out.println("Enter the difficulty level (1, 2, or 3): ");
            difficulty = myObj.nextInt();

        Random rand = new Random();

        if(difficulty == 1){
            int rand_easy = rand.nextInt();
        }

        System.out.println("I have my number. What's your guess? ");
            guess = myObj.nextInt();

        System.out.println("You got it in " + " guesses!");
            numberguess = myObj.nextInt();

    }

}