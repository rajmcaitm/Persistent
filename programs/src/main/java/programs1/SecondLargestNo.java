package programs1;

import java.util.Arrays;

public class SecondLargestNo {

    public static void main(String[] args) {

        int arr[] = {1, 2, 4, 5, 6, 7, 8, 9, 3, 4, 5, 6};
        System.out.println(secondLargestNo(arr));
        System.out.println("max element : " + maxNo(arr));
        System.err.println(Arrays.toString(reverseIntegerArray(arr)));

    }

    public static int secondLargestNo(int[] arr) {
        return Arrays.stream(arr).sorted().skip(arr.length - 2).findFirst().getAsInt();

    }

    public static int maxNo(int arr[]) {
        return Arrays.stream(arr).max().getAsInt();

    }

    public static int[] reverseIntegerArray(int arr[]) {

        int newArr[] = new int[arr.length];
        int count = 0;

        for (int i = arr.length - 1; i >= 0; i--) {

            newArr[count] = arr[i];
            count++;
        }
        return newArr;
    }
}
