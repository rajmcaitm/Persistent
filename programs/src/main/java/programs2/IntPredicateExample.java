package programs2;

import java.util.function.DoublePredicate;
import java.util.function.LongPredicate;

public class IntPredicateExample {

    public static void main(String[] args) {

        IntPredicate ip = i -> i % 2 == 0;
        LongPredicate lp = i -> i >= 10;
        DoublePredicate dp = d ->  d >= 6.7;

        System.out.println("Whether 10 is even number : " + ip.test(10));

        System.out.println("Whether 7 is even number : " + ip.test(7));

        System.out.println("check number is greater than or equal to 10 : "+lp.test(10));

        System.out.println("Whether Suresh passed with CGPA of 9.2 : "+ dp.test(9.2));
    }
}