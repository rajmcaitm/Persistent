package com.intuit.program;

public class Swap {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        swapWithoutThirdVariable(a, b);
        swapWithThirdVariable(a, b);
        String test = "DELETE from pdms.metric_data WHERE last_executed_on < NOW() - INTERVAL "+"'"+"1 DAY"+"'";
        System.err.println(test);

    }

    int a, b;

    public static void swapWithoutThirdVariable(int a, int b) {

        a = a +b;
        b = a - b;
        a = a - b;

        System.err.println("value of a = " + a + "\nvalue of b = " + b);
    }

    public static void swapWithThirdVariable(int a, int b) {

        int c;
        c = a;
        a = b;
        b = c;

        System.err.println("value of a = " + a + "\nvalue of b = " + b);
    }
}
