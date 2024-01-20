package program4;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatter {
    public static void main(String[] args) {

        Date today = new Date();

        System.out.println("Today is : " + today);

        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Today in dd/MM/yyyy format : " + formatter.format(today));
    }
}
