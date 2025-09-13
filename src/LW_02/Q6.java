package LW_02;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Q6 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMMM yyyy");
        System.out.println(today.format(formatter));
    }
}