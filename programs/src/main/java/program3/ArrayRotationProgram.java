package program3;

import java.util.Arrays;
 
public class ArrayRotationProgram 
{
    private static void leftRotate(int[] inputArray, int n) 
    {
        int temp;
        for (int i = 0; i < n; i++)
        {
            temp = inputArray[0];
             
            for (int j = 0; j < inputArray.length-1; j++) 
            {
                inputArray[j] = inputArray[j+1];
            }
             
            inputArray[inputArray.length - 1] = temp;
        }
         
        System.out.println("Input Array After Left Rotation By "+n+" Positions :");
        System.out.println(Arrays.toString(inputArray));
    }

    private static void rightRotate(int[] inputArray, int n) {
        int temp;
        for (int i = 1; i <= n; i++) {
            temp = inputArray[inputArray.length - 1];

            for (int j = inputArray.length - 1; j > 0; j--) {
                inputArray[j] = inputArray[j - 1];
            }

            inputArray[0] = temp;
        }

        System.out.println("Input Array After Right Rotation By " + n + " Positions :");

        System.out.println(Arrays.toString(inputArray));
    }

    private static int[] leftRotateCustom(int[] inputArray, int n) {

        int[] newArr = new int[inputArray.length];
        int index = 0;
        for (int i = n; i < inputArray.length; i++) {
            newArr[index] = inputArray[i];
            index++;
        }
            for (int j = 0; j < n; j++) {
                newArr[index] = inputArray[j];
                index++;
            }
        return newArr;
    }

    private static int[] rightRotateCustom(int[] inputArray, int n) {

        int[] newArr = new int[inputArray.length];
        int index = 0;
        for (int i = inputArray.length-n; i < inputArray.length; i++) {
            newArr[index] = inputArray[i];
            index++;
        }
        for (int j = 0; j < inputArray.length-n; j++) {
            newArr[index] = inputArray[j];
            index++;
        }
        return newArr;
    }


    public static void main(String[] args) 
    {
        leftRotate(new int[] {1,2,3,4,5,6,7}, 2);
        rightRotate(new int[] {1,2,3,4,5,6,7}, 2);
        System.out.println(Arrays.toString(leftRotateCustom(new int[] {1,2,3,4,5,6,7}, 2)));
        System.err.println(Arrays.toString(rightRotateCustom(new int[] {1,2,3,4,5,6,7}, 2)));
    }
}