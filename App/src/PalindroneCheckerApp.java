/**
 * =========================================================
 * MAIN CLASS - UseCase5PalindromeCheckerApp
 * =========================================================
 *
 * Use Case 5: Stack Based Palindrome Checker
 *
 * Description:
 * This class validates a palindrome using a Stack
 * data structure which follows the LIFO principle.
 *
 * Author: sudheer200502
 * Version: 5.0
 */

import java.util.Scanner;
import java.util.Stack;

public class PalindroneCheckerApp {

    /**
     * Application entry point for UC5.
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=== Palindrome Checker (Stack Method) ===");
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Create a Stack to store characters
        Stack<Character> stack = new Stack<>();

        // Push each character of the string into the stack
        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        // Assume palindrome initially
        boolean isPalindrome = true;

        // Compare original string with stack pop sequence
        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                isPalindrome = false;
                break;
            }
        }

        // Display result
        if (isPalindrome) {
            System.out.println("Result: The given string is a PALINDROME.");
        } else {
            System.out.println("Result: The given string is NOT a palindrome.");
        }

        sc.close();
    }
}