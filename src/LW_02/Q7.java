package LW_02;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Q7 {
    public static void main(String[] args) {

        Date myDate = new Date();

        System.out.println("Default format: " + myDate.toString());

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEEE,MMMM dd,yyyy");

        String formattedDate = simpleDateFormat.format(myDate);

        System.out.println("Formatted date: " + formattedDate);
    }
}
