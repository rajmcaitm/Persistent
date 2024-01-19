package program4;

public class HarshadNumber {

    public static void main(String[] args) {
        System.out.println(testHarshadNo(111));
    }

    public static boolean testHarshadNo(int num) {
        int temp = num;
        boolean flag = false;
        int sum = 0;
        while (num > 0) {
        int remainder = num % 10;
        sum = sum + remainder;
        num = num / 10;
    }
        if (temp % sum == 0) {
            flag = true;
        }else {
            flag = false;
        }
        return flag;
    }
}
