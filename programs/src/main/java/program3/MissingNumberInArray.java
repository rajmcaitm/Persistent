package program3;

public class MissingNumberInArray {
    public static void main(String[] args) {

        int[] a = {1, 4, 5, 3, 7, 2, 8};
        System.out.println(findMissingElement(a));

    }

    static int sumOfNthElement(int n) {
        return (n * (n + 1)) / 2;
    }

    static int arrayElementSum(int n[]) {
        int sum = 0;
        for (int i = 0; i < n.length; i++) {
            sum = sum + n[i];
        }
        return sum;
    }

    public static int findMissingElement(int n[]) {
        return sumOfNthElement(n.length + 1) - arrayElementSum(n);
    }
}
