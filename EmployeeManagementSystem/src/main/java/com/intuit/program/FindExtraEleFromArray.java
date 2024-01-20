package com.intuit.program;

public class FindExtraEleFromArray {

	/*
	 * int[] x = {14,0,2,50,3,1,4,1,27} 
	 * int[] y = {27,1,3,0,14,50,1,2,4,100} 
	 * Size of y = Size of x + 1
	 * Both the arrays will contain duplicate values. 
	 * Find the Extra element in Y which is not present in x
	 */

	public static void main(String[] args) {

		int[] x = { 14, 0, 2, 50, 3, 1, 4, 1, 27 };
		int[] y = { 27, 1, 3, 0, 14, 50, 1, 2, 4, 100 };

		getExtraElement(x, y);
		System.err.println(extraElement(x, y));
	}

	public static void getExtraElement(int [] x, int [] y){

        int extraElement = 0;

        for (int i = 0; i <x.length ; i++)
            extraElement ^= x[i];

        for (int i = 0; i <y.length ; i++)
            extraElement ^= y[i];

        System.out.println("Extra Element: " + extraElement);
    }
	
	

	public static int extraElement(int [] x, int [] y){

        int sumX = 0, sumY = 0;

        for (int i = 0; i <x.length ; i++)
            sumX += x[i];

        for (int i = 0; i <y.length ; i++)
            sumY += y[i];
        
		return sumY-sumX;

    }
}
