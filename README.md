# Palindrome Checker Management System

## Use Case 3 – Reverse String Based Palindrome Check

## Overview

This module demonstrates a **palindrome validation approach by reversing a string and comparing it with the original string**.

A **palindrome** is a word, phrase, or sequence that reads the same forward and backward.

Examples:

* madam
* racecar
* level
* noon

The program reverses the given string and checks whether the reversed string matches the original.

---

## Objective

The purpose of this use case is to introduce **transformation-based palindrome validation** by creating a reversed version of the string and comparing the two values.

---

## How the Program Works

The application performs the following steps:

1. Stores a **hardcoded string**.
2. Iterates through the string **from the last character to the first**.
3. Builds a **reversed version** of the string.
4. Compares the **original string** with the **reversed string**.
5. Displays whether the string is a **palindrome or not**.

---

## Algorithm Logic

```
1. Define a string (example: "madam")
2. Create an empty string called reversed
3. Loop from the last character of the string to the first
4. Add each character to the reversed string
5. Compare original string with reversed string
6. If both are equal → Palindrome
7. Otherwise → Not a palindrome
```

---

## Project Structure

```
PalindromeChecker/
│
├── src/
│   └── UseCase3PalindromeCheckerApp.java
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

## How to Run the Program

1. Open the project in your Java IDE.
2. Navigate to:

```
UseCase3PalindromeCheckerApp.java
```

3. Compile and run the program.

---

## Example Output

### Palindrome Example

```
Original String: madam
Reversed String: madam
Result: The string is a palindrome.
```

### Non-Palindrome Example

```
Original String: hello
Reversed String: olleh
Result: The string is NOT a palindrome.
```

---

## Key Concepts Demonstrated

* Java `main()` method
* String manipulation
* Reverse iteration using `for` loop
* Building strings dynamically
* String comparison using `equals()`
* Basic algorithm implementation

---

## Future Improvements

Planned enhancements for the system:

* Accept **user input using Scanner**
* Ignore **uppercase/lowercase differences**
* Ignore **spaces and punctuation**
* Add **menu-driven interface**
* Store and display **palindrome history**

---

## Author

sudheer200502

## Version

3.0
