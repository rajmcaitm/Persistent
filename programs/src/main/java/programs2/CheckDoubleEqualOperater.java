package programs2;

public class CheckDoubleEqualOperater {
    public static void main(String[] args) {
        String str1 = new String("Hello");
        String str2 = new String("Hello");

        System.out.println(str1 == str1); // false
        System.out.println(System.identityHashCode(str1)); // prints a unique hash code
        System.out.println(System.identityHashCode(str2)); // prints a different unique hash code
    }
}