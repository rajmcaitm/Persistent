package programs1;

import java.util.function.Predicate;

public class TestAndPredicate {

    public static void main(String[] args) {

        Predicate<Integer> p1 = i -> i % 2 == 0;

        Predicate<Integer> p2 = i -> i > 35;

        int numbers[] = {25, 35, 50, 60, 75, 90, 100};

        for (int num : numbers) {

            if (p1.and(p2).test(num)) {
                System.out.println(num + " is EVEN as well as greater than 35");
            }
        }

        System.err.println("____________________________________________________");
        for(int num : numbers) {

            if(p1.or(p2).test(num)) {
                System.out.println(num + " is either EVEN or greater than 35");
            }
        }

        for(int num : numbers) {

            if(p1.negate().test(num)) {
                System.err.println(num + " is ODD number");
            }
        }
    }
}