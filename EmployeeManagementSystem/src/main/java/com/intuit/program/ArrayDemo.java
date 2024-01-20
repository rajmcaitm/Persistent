package com.intuit.program;

public class ArrayDemo {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        for (int i= 2; i >= 0; i--){
           System.err.print(arr[i]);
        }

        for (int j = 5; j>2; j--){
            System.out.print(arr[j]);
        }
    }
}