package programs2;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class MostRepeatedChar {

    public static void main(String[] args) {
        System.out.println(moreRepeatedChar("teestte"));
    }

    public static Map<Character, Long> moreRepeatedChar(String input) {

        long count = 0;
        Map<Character, Long> result = new LinkedHashMap<>();
        Map<Character, Long> map = input.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Character::new, Collectors.counting()));

        for (char ch : map.keySet()) {
            if (map.get(ch) == Collections.max(map.values())) {
                result.put(ch, Collections.max(map.values()));
            }
        }
        return result;
    }
}
