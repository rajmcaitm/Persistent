package programs1;

public class FirstNonRepeatingCharacter {

	public static void main(String[] args) {

		String intput = "test";

		FindFirstNonRepeatingCharacter(intput);
		firstNonRepeat(intput);
		System.err.println(firstNonRepeatChar(intput));
		System.err.println(firstNonRepeatedCharUsingJava8(intput));
	}

	private static void FindFirstNonRepeatingCharacter(String intput) {

		int index = -1;
		char fistChar = ' ';
		for (char ch : intput.toCharArray()) {
			if (intput.indexOf(ch) == intput.lastIndexOf(ch)) {
				fistChar = ch;
				break;
			} else {
				index += 1;
			}
		}
		if (index == 1) {
			System.out.println("Either all characters are repeating or " + "string is empty");
		} else {
			System.out.println("First non-repeating character is : " + fistChar);
		}
	}

	public static void firstNonRepeat(String s) {

		for (int i = 0; i < s.length(); i++) {

			if (s.indexOf(s.charAt(i), s.indexOf(s.charAt(i)) + 1) == -1) {
				System.out.println("First non-repeating character is :" + s.charAt(i));
				break;
			}

		}
		return;
	}

	public static char firstNonRepeatChar(String str) {

		char ch[] = str.toCharArray();
		char result = ' ';

		for (int i = 0; i < str.length(); i++) {

			if (str.indexOf(ch[i]) == str.lastIndexOf(ch[i])) {
				result = ch[i];
				break;
			}
		}
		return result;
	}

	//write a function for first non repeated char in java using java 8
	public static char firstNonRepeatedCharUsingJava8(String str) {
		return (char) str.chars()
				.filter(c -> str.indexOf((char) c) == str.lastIndexOf((char) c))
				.findFirst()
				.orElseThrow(() -> new RuntimeException("No non-repeated character found"));
	}
}