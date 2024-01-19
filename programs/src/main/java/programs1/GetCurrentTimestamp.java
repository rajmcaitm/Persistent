package programs1;

import java.sql.Timestamp;
import java.util.function.Supplier;

public class GetCurrentTimestamp {

    public static void main(String[] args) {

        Supplier<Timestamp> s1 = () -> new Timestamp(System.currentTimeMillis());
        Supplier<String> s2 = () -> System.getProperty("user.name");

        Supplier<StringBuffer> s3 = () -> {
            StringBuffer password = new StringBuffer();
            for (int i = 0; i < 8; i++) {
                password.append((int) (Math.random() * 10));
            }

            return password;
        };

        System.out.println(s1.get());
        System.err.println(s2.get());
        System.err.println(s3.get());


    }
}