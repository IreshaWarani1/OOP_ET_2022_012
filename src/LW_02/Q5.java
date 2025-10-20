package LW_02;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Q5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Get input sentence
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        StringTokenizer tokenizer = new StringTokenizer(sentence);

        StringBuilder cleaned = new StringBuilder();
        while (tokenizer.hasMoreTokens()) {
            String word = tokenizer.nextToken();

            word = word.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
            cleaned.append(word);
        }

        String cleanedStr = cleaned.toString();
        String reversedStr = new StringBuilder(cleanedStr).reverse().toString();

        if (cleanedStr.equals(reversedStr)) {
            System.out.println("The sentence IS a palindrome.");
        } else {
            System.out.println("The sentence is NOT a palindrome.");
        }

        scanner.close();
    }
}
