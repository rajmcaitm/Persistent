package programs2;

import java.util.function.DoubleToIntFunction;
import java.util.function.DoubleToLongFunction;
import java.util.function.IntToDoubleFunction;
import java.util.function.IntToLongFunction;
import java.util.function.LongToDoubleFunction;
import java.util.function.LongToIntFunction;

public class IntToLongFunctionExample {
 
    public static void main(String[] args) {

        IntToLongFunction ilf = i -> i * 2048;
        IntToDoubleFunction idf = i -> i * 0.05;
        LongToIntFunction lif = l -> (int)(l/1024);
        LongToDoubleFunction ltd = l -> l * 0.123;
        DoubleToIntFunction dti = d -> (int)d;
        DoubleToLongFunction dtL = d -> (long)d;

        System.out.println("1. 5 * 2048 = \t" + ilf.applyAsLong(5));
        System.out.println("2. 9 * 2048 = \t" + ilf.applyAsLong(9));
        System.out.println("1. 7 * 0.05 = \t" + idf.applyAsDouble(7));
        System.out.println("1. 2048 / 1024 = " + lif.applyAsInt(2048));
        System.out.println("1. 123456 * 0.123 = " + ltd.applyAsDouble(123456));
        System.out.println("After removing fractional part from 9.3 \t= " + dti.applyAsInt(9.3));
        System.out.println("After removing fractional part from 3.14 \t= " + dtL.applyAsLong(3.14));

    }
}