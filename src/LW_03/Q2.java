package LW_03;


import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheitInput = scanner.nextDouble();


        Q1 temp = new Q1();
        temp.setFahrenheit(fahrenheitInput);

        double celsius = temp.toCelsius();

        System.out.printf("Temperature in Celsius: %.2f°C%n", celsius);

        scanner.close();
    }

}
