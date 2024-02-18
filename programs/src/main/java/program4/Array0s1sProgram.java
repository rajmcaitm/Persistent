package program4;

import java.util.Arrays;

public class Array0s1sProgram {
    public static void main(String[] args) {

        sortBinaryArray(new int[]{1, 0, 1, 1, 0, 1, 0, 0});

        System.out.println("========================");

        sortBinaryArray(new int[]{1, 1, 1, 1, 0, 0, 0, 0});

         System.out.println("========================");

        sortBinaryArray(new int[]{1, 1, 0, 0, 1, 1, 0, 0});
    }

    private static void sortBinaryArray(int[] inputArray) {
        Arrays.sort(inputArray);
        System.out.println(Arrays.toString(inputArray));
    }
}
