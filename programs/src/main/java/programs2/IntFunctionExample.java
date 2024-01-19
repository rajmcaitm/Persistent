package programs2;

import java.util.function.*;

public class IntFunctionExample {

    public static void main(String[] args) {

        IntFunction<Integer> f = i -> i * i;
        IntFunction<Boolean> f1 = i -> i * i > 0;
        LongFunction<Boolean> lf = longNum -> longNum >= 0;
        DoubleFunction<String> df = d -> "you have cleared IIT-JEE with " + d + " CGPA";
        ToIntFunction<Integer> tIf = i -> i*i;
        ToLongFunction<Integer> tLf = i -> i*10;
        ToDoubleFunction<Integer> tDF = i -> i - 0.5;

        System.out.println("The Square of number 5 is \t: " + f.apply(5));
        System.out.println("The Square of number 9 is \t: " + f.apply(9));
        System.out.println("The Square of number 9 is \t: " + f1.apply(9));
        System.out.println("Whether -7 is postive number : " + lf.apply(-7));
        System.err.println("Suresh, " + df.apply(9.2));
        System.out.println("The Square of number 5 is \t: " + tIf.applyAsInt(5));
        System.out.println("5 * 1024 = \t" + tLf.applyAsLong(5));
        System.out.println("After discount, for 5 is \t= " + tDF.applyAsDouble(5));

    }
}