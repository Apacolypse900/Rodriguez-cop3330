package oop.assignment2.ex26.base;

import static java.lang.Math.log;

public class PaymentCalculator {
    public static double calculateMonthUntilPaidOff (double balance, int APR, double monthPayment){

        double apr1= (APR/100.0)/365.0;
        double months;

        double a = (1 + apr1);
        double b = Math.pow(a,30);
        double c = (1 + balance / monthPayment * (1 - b));
        double d = log(c);
        double e = log(a);

        months = -(1.0/30.0) * (d/e);
        double rounded = Math.ceil(months);
        return rounded;

    }
}
