package programs1;

public class CheckPalindrome {

	public static void main(String[] args) {

		String str = "141";
		System.out.println(checkPalindrome(str));
		System.out.println(checkPalindrome(151));
		System.err.println(checkPalindromeUsingJava8(str));
		System.err.println(checkPalindromeUsingJava8(161));
	}


	private static boolean checkPalindrome(String str) {

		boolean flag = false;
		String reverse = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			reverse += str.charAt(i) + "";
		}
		if (str.equals(reverse)) {
			flag = true;
		}

		return flag;

	}
	//function to check given String a Palindrome or not using java 8
	public static boolean checkPalindromeUsingJava8(String str) {
		return str.equals(new StringBuilder(str).reverse().toString());
	}

	private static boolean checkPalindrome(int n) {

		boolean flag = false;
		int r, sum = 0, temp;

		temp = n;
		while (n > 0) {
			r = n % 10;
			sum = (sum * 10) + r;
			n = n / 10;
		}
		if (temp == sum) {
			flag = true;
		} else {
			flag = false;
		}
		return flag;
	}
	//function to check given int a Palindrome or not using java 8
	public static boolean checkPalindromeUsingJava8(int n) {
		return Integer.toString(n).equals(new StringBuilder(Integer.toString(n)).reverse().toString());
	}
}

