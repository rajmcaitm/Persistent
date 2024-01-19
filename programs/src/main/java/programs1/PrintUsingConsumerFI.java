package programs1;

import java.util.function.Consumer;

public class PrintUsingConsumerFI {

    public static void main(String[] args) {

        Consumer<String> c = i -> System.out.println(i);
        Consumer<Integer> con = i -> {
            i = 10;
            System.out.println(i);
        };

        c.accept("Welcome to");
        c.accept("Java 8 world");
        con.accept(10);
    }
}