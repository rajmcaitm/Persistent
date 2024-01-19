package program3;

import java.util.Arrays;

public class SeparateZerosFromNonZeros {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(moveZerosToEnd(new int[]{12, 0, 7, 0, 8, 0, 3})));
        System.out.println(Arrays.toString(moveZerosToEnd(new int[]{1, -5, 0, 0, 8, 0, 1})));
        System.out.println(Arrays.toString(moveZerosToEnd(new int[]{0, 1, 0, 1, -5, 0, 4})));
        System.out.println(Arrays.toString(moveZerosToEnd(new int[]{-4, 1, 0, 0, 2, 21, 4})));
    }

    public static int[] moveZerosToEnd(int inputArray[]) {

        int counter = 0;
        for (int i = 0; i < inputArray.length; i++) {
            if(inputArray[i] != 0)
            {
                inputArray[counter] = inputArray[i];
                counter++;
            }
        }
        while (counter < inputArray.length) {
            inputArray[counter] = 0;
            counter++;
        }
        return inputArray;
    }
}
