package oop.assignment2.ex37.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution37Test {

    @Test
    void getRandomForspecial() {
        int i;

        for (i = 0; i < 10; i++) {
            int x = (int) (Math.random() * ((32 - 0) + 1)) + 0;
            System.out.println(x);
        }
    }
    @Test
    void getRandomNumber() {
        int i;

        for(i=0; i<10; i++){
            int y = (int) (Math.random() * ((9 - 0) + 1)) + 0;
            System.out.println(y);
        }
    }
}