package oop.assignment2.ex33.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution33Test {
    @Test
    void randomnumbers(){
        int x;

        for(int i = 0; i<10; i++) {
            x = (int) (Math.random() * ((4 - 1) + 1)) + 1;
            System.out.println(x);
        }

    }

}
