# Palindrome Checker App – Use Case 6 (Queue + Stack Method)

## 📌 Project Title

**Palindrome Checker using Queue and Stack (FIFO + LIFO Fairness Check)**

---

## 📖 Description

This Java console application validates whether a given string is a **palindrome** by using **two different data structures**:

* **Queue** → follows **FIFO (First In First Out)** principle
* **Stack** → follows **LIFO (Last In First Out)** principle

Characters of the input string are inserted into both structures.
Then comparison is done by **removing characters from the front of the queue and the top of the stack**.

If all characters match symmetrically, the string is confirmed as a **palindrome**.

This method demonstrates how **FIFO and LIFO behaviors can be combined for symmetric validation**.

---

## 🎯 Objective

* To understand practical usage of **Queue and Stack**
* To compare **FIFO vs LIFO behavior**
* To implement palindrome validation using **multiple data structures**
* To strengthen knowledge of **data structure operations**

---

## ⚙️ Features

* Accepts user input from console
* Stores characters in both Queue and Stack
* Performs symmetric comparison
* Displays whether the string is **Palindrome / Not Palindrome**
* Demonstrates fairness logic using two structures

---

## 🧠 Algorithm

1. Start the program
2. Read a string from the user
3. Create an empty Queue and Stack
4. Insert each character into both structures
5. Assume palindrome initially
6. Remove character from queue (front)
7. Pop character from stack (top)
8. Compare both characters
9. If mismatch → Not Palindrome
10. Else continue until queue becomes empty
11. Display the result
12. End the program

---

## 💻 Technologies Used

* Java
* Queue Interface (LinkedList implementation)
* Stack Class
* Scanner Class
* Looping & Conditional Statements

---

## ▶️ How to Run

### Compile

```id="k9d3p2"
javac UseCase6PalindromeCheckerApp.java
```

### Run

```id="f2m8q7"
java UseCase6PalindromeCheckerApp
```

---

## 🧪 Sample Input / Output

**Input**

```id="z8x1c4"
Enter a string: level
```

**Output**

```id="u7n3b5"
Result: The given string is a PALINDROME.
```

**Input**

```id="w4e6r9"
Enter a string: java
```

**Output**

```id="t1y5u8"
Result: The given string is NOT a palindrome.
```

---

## 📊 Time and Space Complexity

* **Time Complexity:** O(n)
* **Space Complexity:** O(n) (Extra space used by Queue and Stack)

---

## ✅ Conclusion

Using both **Queue and Stack together** provides a clear understanding of how **FIFO and LIFO principles** can be applied in real problems like palindrome validation.
This approach strengthens concepts related to **data structures, symmetric comparison, and algorithm design** in Java.

---

## 👨‍💻 Author

sudheer200502

## 🔖 Version

6.0
