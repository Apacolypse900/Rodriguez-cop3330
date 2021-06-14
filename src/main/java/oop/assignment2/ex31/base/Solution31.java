package oop.assignment2.ex31.base;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Jesus Rodriguez
 */
import java.util.Scanner;

public class Solution31 {
    private static final Scanner myObj = new Scanner(System.in);

    private static double TargetHeartRate;
    private static double age;
    private static double RestingPulse;
    private static double intensity;
    private static double percentage;
    private static double i;
    private static double j;

    public static void main(String[] args) {

        readUserInput();

        System.out.print("Intensity\t");
        System.out.println("\t\tRate");


        for (int i = 55; i <= 95; i += 5) {
            TargetHeartRate = (((((220 - age) - RestingPulse) * intensity) + RestingPulse) * (i / 100));

            System.out.print("%" + i + "\t\t\t|");
            System.out.println(" " + TargetHeartRate + " bpm");

        }
    }

    public static void readUserInput() {
        System.out.print("Resting Pulse: ");
        RestingPulse = myObj.nextDouble();

        System.out.print("Age: ");
        age = myObj.nextDouble();
    }
}