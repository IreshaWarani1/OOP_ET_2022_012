package LW_02;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Q6 {
    public static void main(String[] args) {

        Date myDate = new Date();

        System.out.println("Default format: " + myDate.toString());

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd MMMM yyyy");

        String formattedDate = simpleDateFormat.format(myDate);

        System.out.println("Formatted date: " + formattedDate);
    }
}
