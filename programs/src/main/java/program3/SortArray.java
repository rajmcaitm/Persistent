package program3;

import java.util.Arrays;

public class SortArray {

    public static void main(String[] args) {
        int arr[] = {1, 4, 5, 7, 2, 8, 3, 4};
        System.out.println(Arrays.toString(sortingArrayASC(arr)));
        System.out.println(Arrays.toString(sortingArrayDSC(arr)));
    }

    public static int[] sortingArrayASC(int[] arr) {

        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        return arr;
    }

    public static int[] sortingArrayDSC(int[] arr) {

        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        return arr;
    }
}
