package programs2;

import java.util.Arrays;

public class SecondLargestNum {

    public static void main(String[] args) {
        int[] arr = {2, 5, 1, 7, 4};
        System.out.println(secondLargestNo(arr));
        System.err.println(secondLargestNoUsingLimit(arr));
    }

    public static int secondLargestNo(int[] no) {
        return Arrays.stream(no).sorted().skip(no.length-2).min().getAsInt();
    }

    public static int secondLargestNoUsingLimit(int[] no) {
        return Arrays.stream(no).sorted().limit(no.length-1).max().getAsInt();
    }
}
