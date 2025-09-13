package LW_01;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter full name (First Middle Last): ");
        String fullName = sc.nextLine();
        String[] parts = fullName.split(" ");
        String first = parts[0];
        String middle = parts[1];
        String last = parts[2];
        System.out.println(last + ", " + first + " " + middle.charAt(0) + ".");
        sc.close();
    }
}