package programs2;

import java.util.Arrays;

public class CheckEqualityOfTwoArrays {

    public static void main(String[] args) {

        int[] arrayOne = {2, 5, 1, 7, 4};
        int[] arrayTwo = {2, 5, 1, 7, 4};
        System.out.println(checkQuality(arrayOne, arrayTwo));
        System.err.println(checkQualityOfArrays(arrayOne, arrayTwo));

        String[] s1 = {"java", "swings", "j2ee", "struts", "jsp", "hibernate"};

        String[] s2 = {"java", "struts", "j2ee", "hibernate", "swings", "jsp"};

        System.out.println(checkQuality(s1, s2));
    }

    public static boolean checkQuality(int[] arrayOne, int[] arrayTwo) {

        return Arrays.equals(arrayOne, arrayTwo);
    }

    public static boolean checkQualityOfArrays(int[] arrayOne, int[] arrayTwo) {

        boolean flag = true;
        if (arrayOne.length == arrayTwo.length) {
            for (int i = 0; i < arrayOne.length; i++) {
                if (arrayOne[i] != arrayTwo[i]) {
                    flag = false;
                }
            }
        } else {
            flag = false;
        }

        return flag;
    }

    public static boolean checkQuality(String[] s1, String[] s2) {
        Arrays.sort(s1);
        Arrays.sort(s2);
        return Arrays.equals(s1, s2);
    }

}

