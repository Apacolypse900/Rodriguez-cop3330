package oop.assignment2.ex26.base;

import org.junit.jupiter.api.Test;

import static java.lang.Math.log;
import static org.junit.jupiter.api.Assertions.*;

class PaymentCalculatorTest {


    @Test
    void calculate_small_numbers() {
        PaymentCalculator detector = new PaymentCalculator();

        double apr1= (50.0/100)/365;
        double months;

        double a = (1 + apr1);
        double b = Math.pow(a,30);
        double c = (1 + 20.0/50 * (1 - b));
        double d = log(c);
        double e = log(a);

        months = -(1/30.0) * (d/e);
        double rounded = Math.ceil(months);
        System.out.println(rounded);
    }

    @Test
    void calculate_decimals() {
        PaymentCalculator detector = new PaymentCalculator();

        double apr1= (15.5/100)/365;
        double months;

        double a = (1 + apr1);
        double b = Math.pow(a,30);
        double c = (1 + 100.0 / 72 * (1 - b));
        double d = log(c);
        double e = log(a);

        months = -(1/30.0) * (d/e);
        double rounded = Math.ceil(months);
        System.out.println(rounded);
    }
    @Test
    void calculate_number_from_answer() {
        PaymentCalculator detector = new PaymentCalculator();

        double apr1= (12.0/100)/365;
        double months;

        double a = (1 + apr1);
        double b = Math.pow(a,30);
        double c = (1 + 5000.0/100 * (1 - b));
        double d = log(c);
        double e = log(a);

        months = -(1/30.0) * (d/e);
        double rounded = Math.ceil(months);
        System.out.println(rounded);
    }
}

