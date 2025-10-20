package LW_02;
import java.util.Scanner;

public class Q2 {
    public static int countDigits(int number) {
        int count = 0;

        if (number == 0) {
            return 1;
        }

        while (number != 0) {
            number /= 10;
            count++;
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter an integer (negative number to quit): ");
            int num = scanner.nextInt();

            if (num < 0) {
                System.out.println("Program terminated.");
                break;
            }

            int digits = countDigits(num);
            System.out.println(num + " has " + digits + " digit(s).\n");
        }

        scanner.close();
    }
}
