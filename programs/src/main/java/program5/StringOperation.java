package program5;

public class StringOperation {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";
        String commonChars = String.valueOf(findCommonCharacters(str1, str2));
        System.out.println("Common characters: " + commonChars);
        System.out.println("find second repeated character: " + findSecondRepeatedChar("welcomeo"));
        System.out.println("find first repeated character: " + findFirstRepeatedChar("welcomeo"));
    }

    public static StringBuilder findCommonCharacters(String str1, String str2) {
        StringBuilder commonChars = new StringBuilder();
        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);
            if (str2.indexOf(ch) != -1 && commonChars.indexOf(String.valueOf(ch)) == -1) {
                commonChars.append(ch);
            }
        }
        return commonChars;
    }

    //java function to find second repeated char using java 8
    public static char findSecondRepeatedChar(String str) {
        return (char) str.chars()
                .filter(c -> str.indexOf((char) c) != str.lastIndexOf((char) c))
                .distinct()
                .skip(1)
                .findFirst()
                .orElse(' ');
    }

    //java function to find first repeated char using java 8
    public static char findFirstRepeatedChar(String str) {
        return (char) str.chars()
                .filter(c -> str.indexOf((char) c) != str.lastIndexOf((char) c))
                .findFirst()
                .orElse(' ');
    }
}

