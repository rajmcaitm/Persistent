package programs1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class SortAnArray {

    public static void main(String[] args) {

        String[] input = {"dharya", "dharm", "chauhdary", "xyz", "ved"};
        System.out.println(Arrays.toString(sort(input)));
        System.out.println(Arrays.toString(sortWithOutSort(input)));
        System.out.println(Arrays.toString(sortWithComparator(input)));
        System.err.println(Arrays.toString(sortUsingParallelSort(input)));
        System.err.println(Arrays.toString(sortWithJava8(input)));

    }

    public static String[] sort(String[] str) {
        //Arrays.sort(str);
        Arrays.sort(str, Comparator.naturalOrder());
        //Arrays.sort(str, Collections.reverseOrder());
        return str;
    }

    public static String[] sortWithOutSort(String[] str) {

        for (int i = 0; i < str.length; i++) {
            for (int j = i + 1; j < str.length; j++) {

                if (str[i].compareTo(str[j]) > 0) {
                    String temp = str[i];
                    str[i] = str[j];
                    str[j] = temp;
                }
            }
        }
        return str;
    }

    public static String[] sortWithComparator(String[] str) {

        Arrays.sort(str, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);            // sort in descending order
            }
        });
        return str;
    }

    public static String[] sortUsingParallelSort(String[] str) {
        Arrays.parallelSort(str);
        return str;
    }

    public static String[] sortWithJava8(String[] str) {
        //return Stream.of(str).sorted().toArray(String[] :: new);
        //return Arrays.stream(str).sorted().toArray(String[] :: new);
        return Arrays.stream(str).sorted(Collections.reverseOrder()).toArray(String[] :: new); //reverse order
    }
}
