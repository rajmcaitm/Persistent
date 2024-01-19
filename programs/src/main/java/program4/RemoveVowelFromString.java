package program4;

public class RemoveVowelFromString {
    public static void main(String[] args) {
        System.out.println(removeVowelsFromString("iouatest"));
        System.out.println(removeVowels("iouatest"));
    }

    public static String removeVowelsFromString(String str) {
    return str.replaceAll("[AEIOUaeiou]", "");
    }

    public static String removeVowels(String str) {

        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {

            }else {
                result = result + str.charAt(i);
            }
        }

        return result;
    }
}
