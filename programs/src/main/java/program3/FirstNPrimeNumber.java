package program3;

public class FirstNPrimeNumber {

    public static void main(String[] args) {
        for (int i = 0; i < 30; i++) {
            if (firstNPrimeNo(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean firstNPrimeNo(int num) {

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
