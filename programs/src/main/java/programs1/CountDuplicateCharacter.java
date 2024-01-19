package programs1;

import java.util.LinkedHashMap;
import java.util.Map;

public class CountDuplicateCharacter {

	public static void main(String[] args) {
		String test = "wweellccoommet";
		System.out.println(countDiublicateChar(test));
	}

	private static Map<Character, Integer> countDiublicateChar(String test) {

		Map<Character, Integer> map = new LinkedHashMap<>();

		for (int i = 0; i < test.length(); i++) {
			
			if (map.containsKey(test.charAt(i))) {
				map.put(test.charAt(i), map.get(test.charAt(i))+1);
			}else {
				map.put(test.charAt(i), 1);
			}
		}

		return map;
	}

}
