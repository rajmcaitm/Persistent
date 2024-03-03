package program4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DiffOfTwoDates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter start date in dd-MM-yyyy/HH:mm:ss format :");

        String s1 = sc.next();

        System.out.println("Enter end date in dd-MM-yyyy/HH:mm:ss format :");

        String s2 = sc.next();

        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy/HH:mm:ss");

        try {
            Date startDate = formatter.parse(s1);

            Date endDate = formatter.parse(s2);

            long diffInMilliSec = endDate.getTime() - startDate.getTime();

            long seconds = (diffInMilliSec / 1000) % 60;

            long minutes = (diffInMilliSec / (1000 * 60)) % 60;

            long hours = (diffInMilliSec / (1000 * 60 * 60)) % 24;

            long days = (diffInMilliSec / (1000 * 60 * 60 * 24)) % 365;

            long years = (diffInMilliSec / (1000l * 60 * 60 * 24 * 365));

            System.out.println("Difference is ---> ");

            System.err.println(years + " years, " + days + " days, " + hours + " hours, " + minutes + " minutes, " + seconds + " seconds");
        } catch (ParseException e) {
            e.printStackTrace();
        }

        sc.close();
    }
}
