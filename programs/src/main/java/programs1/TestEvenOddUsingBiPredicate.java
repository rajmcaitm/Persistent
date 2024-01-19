package programs1;

public class TestEvenOddUsingBiPredicate {

    public static void main(String[] args) {

        BiPredicate<Integer, Integer> bp = (x, y) -> (x + y) % 2 == 0;
        BiPredicate<String, String> add = (x, y) -> (x + y).toUpperCase().charAt(0) == 'D';
        BiPredicate<Integer, Integer> divisor = (i,j) -> i%j == 0;
        Predicate<Integer> greaterThan = (i) -> i > 10;
        BiPredicate<Integer, Integer> sumGreaterThan = (i,j) -> (i+j) > 10;


        System.out.println("1. Whether sum of (10, 6) is even/odd \t: "
                + bp.test(10, 6));

        System.out.println("2. Whether sum of (20, 5) is even/odd \t: "
                + bp.test(20, 5));

        System.err.println(add.test("dharya", "test"));

        System.out.println("Whether 2 divisor of 10 : "
                + divisor.test(20, 10));

        System.out.println("Whether 8 is greater than 10 \t: "
                + greaterThan.test(8));

        System.out.println("Whether 19 is greater than 10 \t: "
                + greaterThan.test(19));

        System.out.println("Whether sum of (10, 6) is greater than 10 \t: "
                + bp.test(10, 6));


    }
}