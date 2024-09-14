package programs1;

public class SecondNonRepeatedChar {

	public static char kthNonRepeatingChar(String str, int k) {

		int count = 0;
		char result = ' ';

		for (int i = 0; i < str.length(); i++) {

			boolean repeating = false;

			for (int j = i + 1; j < str.length(); j++) {
				if (str.charAt(i) == str.charAt(j)) {

					repeating = true;
					break;
				}
			}

			if (!repeating) {
				count++;

				if (count == k) {
					result = str.charAt(i);
					break;
				}
			}
		}

		return result;
	}
	
	public static char secondNonRepeatChar(String str, int k) {

		char ch[] = str.toCharArray();
		char result = ' ';
		int count = 0;

		for (int i = 0; i < str.length(); i++) {

			if (str.indexOf(ch[i]) == str.lastIndexOf(ch[i])) {
				System.out.println("ss: "+ch[i]);
				count++;
				if (count == k) {
					result = ch[i];
					break;
				}
			}
		}
		return result;
	}

	public static void main(String[] args) {

		String str = "welcome";
		int k = 5;

		char result = kthNonRepeatingChar(str, k);
		if (result == ' ') {
			System.out.println("There is no kth non-repeating character " + "in the string.");
		} else {
			System.out.println("The " + k + "th non-repeating character in the string " + "is : " + result);
		}
		
		System.err.println("second Non-Repeat Char :"+secondNonRepeatChar(str, k));
	}
}
