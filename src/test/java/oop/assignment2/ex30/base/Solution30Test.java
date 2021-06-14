package oop.assignment2.ex30.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution30Test {
    @Test
    void make_table(){
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