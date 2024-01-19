package programs2;

public class StringIsRotatedVerionOfAnother {

    public static void main(String[] args) {
        String s1 = "JavaJ2eeStrutsHibernate";
        String s2 = "StrutsHibernateJavaJ2ee";
        System.out.println(checkRotatedVersion(s1, s2));
    }

    static boolean checkRotatedVersion(String s1, String s2) {

        boolean flag = true;

        if (s1.length() != s2.length()) {
            System.out.println("s2 is not rotated version of s1");
            flag = false;
        } else {
            //String s3 = s1 + s2;
            if (s2.contains(s1)) {
                flag = true;
            }
        }

        return flag;
    }
}