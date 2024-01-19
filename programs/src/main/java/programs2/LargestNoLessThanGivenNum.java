package programs2;

import java.util.Arrays;

public class LargestNoLessThanGivenNum {

    public static void main(String[] args) {

        int[] arr = {2, 5, 1, 7, 4, 8, 9, 16, 20, 80};
        int givenNo = 80;
        System.out.println(largestNoLessThanGivenNo(arr, givenNo));
    }

    public static int largestNoLessThanGivenNo(int[] arr, int givenNo) {

        return Arrays.stream(arr).sorted().filter(n -> n < givenNo).max().getAsInt();
    }
}
