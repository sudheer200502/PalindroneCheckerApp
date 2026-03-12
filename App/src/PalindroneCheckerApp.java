/**
 * =========================================================
 * MAIN CLASS - UseCase6PalindromeCheckerApp
 * =========================================================
 *
 * Use Case 6: Queue + Stack Fairness Check
 *
 * Description:
 * This class validates palindrome using two data structures:
 * Queue (FIFO) and Stack (LIFO).
 *
 * Author: sudheer200502
 * Version: 6.0
 */

import java.util.*;

public class PalindroneCheckerApp {

    /**
     * Application entry point for UC6.
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=== Palindrome Checker (Queue + Stack Method) ===");
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Create Queue and Stack
        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();

        // Insert characters into both structures
        for (char c : input.toCharArray()) {
            queue.add(c);     // FIFO insertion
            stack.push(c);    // LIFO insertion
        }

        // Assume palindrome initially
        boolean isPalindrome = true;

        // Compare by removing from queue front and stack top
        while (!queue.isEmpty()) {
            char fromQueue = queue.remove();   // front element
            char fromStack = stack.pop();      // top element

            if (fromQueue != fromStack) {
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