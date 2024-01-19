package program3;

import java.util.Scanner;

public class PrimeNumberProgram  {

    public static void main(String[] args) {
        System.out.println("Enter the number to the prime ?");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(checkPrimeNumber(num));
    }

    static boolean checkPrimeNumber(int num) {
        boolean isItPrime = true;
        if (num <= 1) {
            isItPrime = false;

            return isItPrime;
        } else {
            for (int i = 2; i <= num / 2; i++) {
                if ((num % i) == 0) {
                    isItPrime = false;
                }
            }
            return isItPrime;
        }
    }
}
