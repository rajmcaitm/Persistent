package program3;

import java.util.Arrays;

import org.apache.commons.lang3.ArrayUtils;

public class ArrayElementRemovalProgram {
    public static void main(String[] args) {
        String[] arrayBeforeRemoval = new String[]{"Zero", "One", "Two", "Three", "Four", "Five", "Six"};

        System.out.println("Array Before Removal");

        System.out.println("========================");

        System.out.println(Arrays.toString(arrayBeforeRemoval));

        System.out.println("========================");

        String[] arrayAfterRemoval = ArrayUtils.removeElement(arrayBeforeRemoval, "Two");

        System.out.println("Array After Removal");

        System.out.println("========================");

        System.out.println(Arrays.toString(arrayAfterRemoval));
    }
}