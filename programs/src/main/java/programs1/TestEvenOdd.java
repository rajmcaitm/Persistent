package programs1;

import java.util.function.Predicate;
 
public class TestEvenOdd {
 
    public static void main(String[] args) {
 
        // lambda expression to evaluate number is EVEN using Predicate FI
        Predicate<Integer> p = i -> i % 2 == 0;
        Predicate<String> pre  = str -> str.length() > 7;
        Predicate<String> pred = s -> s.startsWith("R");
        String[] names = {
                "Virat Kohli",
                "Rohit Sharma",
                "Ravindra Jadeja",
                "Jasprit Bumrah",
                "Lokesh Rahul",
                "Hardik Pandya",
                "Rishabh Pant"
        };

        for(String name : names) {
            System.out.println("Whether '" + name + "' starts with 'R' : \t"
                    + pred.test(name));
        }

 
        // testing number using Predicate
        System.out.println("1. Whether number 10 is even/odd \t: " +p.test(10));
 
        System.out.println("2. Whether number 11 is even/odd \t: " +p.test(11));
 
        System.out.println("3. Whether number 1992 is even/odd \t: " + p.test(1992));
 
        System.out.println("4. Whether number 9753 is even/odd \t: " + p.test(9753));
 
        System.out.println("5. Whether number 2020 is even/odd \t: " + p.test(2020));

        System.err.println(pre.test("Java 8"));
        System.err.println(pre.test("Welcome2java"));
    }
}