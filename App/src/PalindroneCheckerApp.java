/**
 * =========================================================
 * MAIN CLASS - UseCase9RecursivePalindrome
 * =========================================================
 *
 * Use Case 9: Recursive Palindrome Checker
 *
 * Description:
 * This class validates a palindrome using recursion.
 *
 * Author: sudheer200502
 * Version: 9.0
 */

import java.util.Scanner;

public class PalindroneCheckerApp {

    /**
     * Application entry point for UC9.
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=== Palindrome Checker (Recursion Method) ===");
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        boolean result = check(input, 0, input.length() - 1);

        if (result) {
            System.out.println("Result: The given string is a PALINDROME.");
        } else {
            System.out.println("Result: The given string is NOT a palindrome.");
        }

        sc.close();
    }

    /**
     * Recursively checks whether a string is palindrome
     * @param s Input string
     * @param start Starting index
     * @param end Ending index
     * @return true if palindrome, otherwise false
     */
    private static boolean check(String s, int start, int end) {

        // Base condition
        if (start >= end)
            return true;

        // Mismatch condition
        if (s.charAt(start) != s.charAt(end))
            return false;

        // Recursive call
        return check(s, start + 1, end - 1);
    }
}