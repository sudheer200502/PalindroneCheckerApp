# Palindrome Checker App – Use Case 4 (Character Array Method)

## 📌 Project Title

**Palindrome Checker using Two-Pointer Technique (Character Array Based Validation)**

---

## 📖 Description

This Java console application checks whether a given string is a **palindrome** by converting the string into a **character array** and comparing characters from the **start and end positions** using the **two-pointer technique**.

This approach is efficient because it avoids creating additional strings (like reverse strings), thereby **reducing memory usage**.

---

## 🎯 Objective

* To validate whether a string is a palindrome
* To implement **character array processing**
* To understand the **two-pointer algorithm**
* To improve **time and space efficiency**

---

## ⚙️ Features

* Accepts user input from the console
* Converts string into a character array
* Uses start and end pointers for comparison
* Displays whether the string is **Palindrome / Not Palindrome**
* Memory-efficient implementation

---

## 🧠 Algorithm

1. Start the program
2. Read a string from the user
3. Convert the string into a character array
4. Initialize:

  * `start = 0`
  * `end = length − 1`
5. Compare characters at `start` and `end`
6. If characters are not equal → Not Palindrome
7. Else move pointers:

  * `start++`
  * `end--`
8. Repeat until `start < end`
9. Display the result
10. End the program

---

## 💻 Technologies Used

* Java
* Scanner Class
* Arrays
* Looping & Conditional Statements

---

## ▶️ How to Run

1. Compile the program

```
javac UseCase4PalindromeCheckerApp.java
```

2. Run the program

```
java UseCase4PalindromeCheckerApp
```

3. Enter a string when prompted

---

## 🧪 Sample Input / Output

**Input**

```
Enter a string: madam
```

**Output**

```
Result: The given string is a PALINDROME.
```

**Input**

```
Enter a string: hello
```

**Output**

```
Result: The given string is NOT a palindrome.
```

---

## 📊 Time and Space Complexity

* **Time Complexity:** O(n)
* **Space Complexity:** O(n) (for character array)

---

## ✅ Conclusion

The Character Array based palindrome checker is a simple and efficient method to validate palindromes.
Using the **two-pointer technique** reduces unnecessary operations like string reversal and improves performance.
This implementation helps in understanding **basic string processing, array traversal, and algorithm optimization** in Java.

---

## 👨‍💻 Author

sudheer200502

## 🔖 Version

4.0
