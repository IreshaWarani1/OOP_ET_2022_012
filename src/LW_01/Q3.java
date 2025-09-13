package LW_01;
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length in centimetres: ");
        double cm = sc.nextDouble();
        double totalInches = cm / 2.54;
        int feet = (int)(totalInches / 12);
        double inches = totalInches % 12;
        System.out.println(feet + " feet " + inches + " inches");
        sc.close();
    }
}