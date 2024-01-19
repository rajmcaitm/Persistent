package programs2;

public class PairsOfAllElements {

    public static void main(String[] args) {
        int[] arr = new int[] {4, 6, 5, -10, 8, 5, 20};
        findThePairs(arr, 10);

    }
    static void findThePairs(int inputArray[], int inputNumber) {
        for (int i = 0; i < inputArray.length; i++) {
            for (int j = i + 1; j < inputArray.length; j++) {
                if (inputArray[i] + inputArray[j] == inputNumber) {
                    System.out.println(inputArray[i] + " , " + inputArray[j]);
                }
            }
        }
    }
}
