# Palindrome Checker App – Use Case 5 (Stack Based Method)

## 📌 Project Title

**Palindrome Checker using Stack Data Structure (LIFO Principle)**

---

## 📖 Description

This Java console application checks whether a given string is a **palindrome** using a **Stack data structure**.
The stack follows the **LIFO (Last In First Out)** principle which naturally helps in reversing the string.

Each character of the string is **pushed into the stack**, and then characters are **popped in reverse order** and compared with the original string sequence to validate the palindrome.

---

## 🎯 Objective

* To understand the working of **Stack (LIFO principle)**
* To implement **palindrome validation using data structures**
* To practice **push and pop operations**
* To compare original and reversed sequences efficiently

---

## ⚙️ Features

* Accepts user input from console
* Uses **Stack<Character>** for storing characters
* Automatically reverses string using stack behavior
* Displays whether the string is **Palindrome / Not Palindrome**
* Demonstrates practical use of data structures

---

## 🧠 Algorithm

1. Start the program
2. Read a string from the user
3. Create an empty stack
4. Push each character of the string into the stack
5. Assume palindrome initially
6. Traverse the original string again
7. Pop characters from stack and compare
8. If any mismatch → Not Palindrome
9. Else continue comparison
10. Display the result
11. End the program

---

## 💻 Technologies Used

* Java
* Stack Class (java.util.Stack)
* Scanner Class
* Loops and Conditional Statements

---

## ▶️ How to Run

### Compile

```id="c8k2p9"
javac UseCase5PalindromeCheckerApp.java
```

### Run

```id="k3l9q1"
java UseCase5PalindromeCheckerApp
```

---

## 🧪 Sample Input / Output

**Input**

```id="p1s8d2"
Enter a string: noon
```

**Output**

```id="z7x4m5"
Result: The given string is a PALINDROME.
```

**Input**

```id="y6h2n9"
Enter a string: world
```

**Output**

```id="q4r8t1"
Result: The given string is NOT a palindrome.
```

---

## 📊 Time and Space Complexity

* **Time Complexity:** O(n)
* **Space Complexity:** O(n) (Extra space used by Stack)

---

## ✅ Conclusion

Using a **Stack data structure** makes palindrome checking intuitive because stack operations automatically reverse the character order.
This method helps students understand **data structure application, LIFO behavior, and string processing concepts** in Java.

---

## 👨‍💻 Author

sudheer200502

## 🔖 Version

5.0
