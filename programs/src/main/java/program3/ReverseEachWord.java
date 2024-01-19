package program3;

public class ReverseEachWord {

    public static void main(String[] args) {
        System.out.println(reverseWords("Java is a programming language"));
    }

    public static String reverseWords(String str) {

        String reverseString = "";
        String[] arr = str.split(" ");
        for (int i = 0; i < arr.length; i++) {
         String word   =  arr[i];
         String reverse = "";
            for (int j = word.length()-1; j >= 0; j--) {
                reverse = reverse + word.charAt(j);
            }
            reverseString = reverseString + reverse + " ";
        }
        return reverseString;
    }
}
