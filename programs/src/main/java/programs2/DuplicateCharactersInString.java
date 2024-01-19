package programs2;

import java.util.LinkedHashSet;
import java.util.Set;

public class DuplicateCharactersInString {

    public static void main(String[] args) {
        System.out.println(getDublicateChar("tekstk"));
    }

    public static Set<Character> getDublicateChar(String str) {

        char[] carray = str.toCharArray();
        Set<Character> set = new LinkedHashSet<>();
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (carray[i] == carray[j]) {
                    set.add(carray[j]);
                    break;
                }
            }
        }
        return set;
    }
}
