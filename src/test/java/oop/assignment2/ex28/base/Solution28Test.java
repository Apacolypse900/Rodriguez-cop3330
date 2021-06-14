package oop.assignment2.ex28.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution28Test {

    @Test
    void calculate_correct_Numbers() {
        int num1 = 1;
        int num2 = 2;
        int num3 = 3;
        int num4 = 4;
        int num5 = 5;
        int addition = 0;

        addition = num1 + num2 + num3 + num4 + num5;
        System.out.println(addition);
    }

    @Test
    void calucalate_big_numbers(){
        int num1 = 100;
        int num2 = 200;
        int num3 = 300;
        int num4 = 400;
        int num5 = 500;
        int addition = 0;

        addition = num1 + num2 + num3 + num4 + num5;
        System.out.println(addition);
    }

    @Test
    void Calculate_different_numbers(){
        int num1 = 1;
        int num2 = 1;
        int num3 = 0;
        int num4 = 14;
        int num5 = 4;
        int addition = 0;

        addition = num1 + num2 + num3 + num4 + num5;
        System.out.println(addition);
    }

}