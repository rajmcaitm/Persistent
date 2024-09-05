package programs1;

public class SquareOfNumber {

    public static void main(String[] args) {

        Function<Integer, Integer> f = i -> i * i;
        Function<String, Integer> length = i ->  i.length();
        Function<String, String> upperCase = i -> i.toUpperCase();
        Function<String, String> lowerCase = i -> i.toLowerCase();
        Function<Integer, Integer> square = (x) -> x * x;
        Function<String, String> test = (x) -> {
            return x.toLowerCase() + x.toUpperCase();
        };

        System.out.println("1. The Square of number 5 is \t: " + f.apply(5));
        System.out.println("2. The Square of number 9 is \t: " + f.apply(9));
        System.out.println("1. Length of String 'BenchResources' is : " +length.apply("Welcome"));
        System.out.println("1. UpperCase of String 'welcome' is \t: " + upperCase.apply("welcome"));
        System.out.println("1. Lowercase of String 'WELCOME' is \t: " + lowerCase.apply("WELCOME"));
        System.out.println(square.apply(25)); // prints: 625
        System.out.println(test.apply(test.apply("t")));
    }
}