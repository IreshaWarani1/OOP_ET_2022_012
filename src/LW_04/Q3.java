package LW_04;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a power of 10 (e.g., 6, 9, 12, 15, 18, 21, 30, 100): ");
        int power = scanner.nextInt();

        String word;

        switch (power) {
            case 6:
                word = "Million";
                break;
            case 9:
                word = "Billion";
                break;
            case 12:
                word = "Trillion";
                break;
            case 15:
                word = "Quadrillion";
                break;
            case 18:
                word = "Quintillion";
                break;
            case 21:
                word = "Sextillion";
                break;
            case 30:
                word = "Nonillion";
                break;
            case 100:
                word = "Googol";
                break;
            default:
                word = null;
        }

        if (word != null) {
            System.out.println("10^" + power + " is called " + word + ".");
        } else {
            System.out.println("No corresponding word for 10^" + power + ".");
        }

        scanner.close();
    }
}
