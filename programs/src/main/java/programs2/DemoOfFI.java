package programs2;

public class DemoOfFI {

    public static void main(String[] args) {

        MyFunctionalInterface fi = (msg) -> {
            System.out.println(msg);
        };
        fi.print("my functional interface example");
    }
}
