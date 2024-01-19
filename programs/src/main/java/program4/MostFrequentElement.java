package program4;

import java.util.LinkedHashMap;
import java.util.Map;

public class MostFrequentElement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 5, 7, 5, 5, 9};
        System.out.print("Most frequent element is: " + freq(arr));
    }

    public static Map<Integer, Integer> freq(int[] arr) {

        Map<Integer, Integer> map = new LinkedHashMap<>();
        int max_count = 0;
        int maxfreq = 0;

        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            if (count > max_count) {
                max_count = count;
                maxfreq = arr[i];
            }
        }
        map.put(maxfreq, max_count);
        return map;
    }
}
