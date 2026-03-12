/**
 * =========================================================
 * MAIN CLASS - UseCase8PalindromeCheckerApp
 * =========================================================
 *
 * Use Case 8: Linked List Based Palindrome Checker
 *
 * Description:
 * This class checks whether a string is a palindrome
 * using a LinkedList by comparing elements from
 * both the front and rear ends.
 *
 * Author: sudheer200502
 * Version: 8.0
 */

import java.util.*;

public class PalindroneCheckerApp {

    /**
     * Application entry point for UC8.
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=== Palindrome Checker (LinkedList Method) ===");
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Create LinkedList
        LinkedList<Character> list = new LinkedList<>();

        // Add characters to the list
        for (char c : input.toCharArray()) {
            list.add(c);
        }

        // Assume palindrome initially
        boolean isPalindrome = true;

        // Compare from both ends
        while (list.size() > 1) {

            char first = list.removeFirst();
            char last = list.removeLast();

            if (first != last) {
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