package oop.assignment2.ex25.base;

import org.junit.platform.engine.support.discovery.SelectorResolver;


public class PasswordChecker {
    public static int passwordValidator(String Password, int length){

        for (int i = 0; i < length; i++){
            if(Character.isDigit(Password.charAt(i)) == true && length < 8)
                return 1;

            else if (i == 2)
                return 2;

            else if (i == 3)
                return 3;

            else if (i == 4)
                return 4;
        }
        return 0;
    }
}
