package programs2;

public class SumOfAllDigit {

    public static void main(String[] args) {
        System.out.println(sumAllDigit(12345));
    }

    public static int sumAllDigit(int num) {
        int sum = 0;

        while (num != 0 && num > -1) {
            int lastDigit = num % 10;
            sum = sum + lastDigit;
            num = num / 10;
        }
        return sum;
    }
}
