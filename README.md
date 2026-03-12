# Palindrome Checker Management System

## Use Case 2 – Hardcoded Palindrome Validation

## Overview

This module demonstrates **basic palindrome validation in Java** using a predefined (hardcoded) string.
A **palindrome** is a word, phrase, or sequence that reads the same forward and backward, such as:

* `madam`
* `racecar`
* `level`

The program compares characters from the **beginning and end of the string** and determines whether the string is a palindrome.

---

## Objective

The goal of this use case is to introduce the **core palindrome checking logic** before implementing user input or more advanced features.

---

## How the Program Works

The application performs the following steps:

1. Stores a **hardcoded string value**.
2. Iterates through the string **only up to half of its length**.
3. Compares:

  * the character at the beginning
  * with the corresponding character from the end
4. If any characters do not match, the string is **not a palindrome**.
5. Displays the **result in the console**.

---

## Algorithm Logic

```
1. Define a string (example: "madam")
2. Set a boolean variable isPalindrome = true
3. Loop from i = 0 to string length / 2
4. Compare:
      input.charAt(i)
      input.charAt(length - 1 - i)
5. If characters differ:
      set isPalindrome = false
      break loop
6. Print result
```

---

## Project Structure

```
PalindromeChecker/
│
├── src/
│   └── UseCase2PalindromeCheckerApp.java
│
└── README.md
```

---

## Requirements

* Java JDK 8 or higher
* Any Java IDE or editor:

  * IntelliJ IDEA
  * Eclipse
  * VS Code
  * NetBeans

---

## How to Run

1. Open the project in your IDE.
2. Navigate to:

```
UseCase2PalindromeCheckerApp.java
```

3. Compile and run the program.

---

## Example Output

```
Input String: madam
Result: The string is a palindrome.
```

If the string is changed to a non-palindrome:

```
Input String: hello
Result: The string is NOT a palindrome.
```

---

## Key Concepts Demonstrated

* Java `main()` method
* String manipulation
* `for` loop iteration
* Character comparison using `charAt()`
* Boolean logic
* Basic algorithm design

---

## Future Improvements

Next versions of the system may include:

* User input using `Scanner`
* Case-insensitive palindrome checking
* Ignoring spaces and punctuation
* Menu-based console application
* Multiple palindrome tests

---

## Author

Developer

## sudheer200502

2.0
