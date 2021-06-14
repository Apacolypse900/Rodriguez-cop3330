package oop.assignment2.ex30.base;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Jesus Rodriguez
 */
import java.util.Scanner;

public class Solution30 {
    private static int i;
    private static int j;

    public static void main(String[] args) {

        for( int i=1; i<=12; i++){
            for(int j=1; j<=12; j++) {
                if(i*j < 10 )
                    System.out.print("   " + i*j+" ");
                else if(i*j > 99)
                    System.out.print(" " + i*j + " ");
                else
                    System.out.print("  " + i*j+ " ");
            }
            System.out.println("");
        }
    }
}


