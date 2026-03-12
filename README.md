# Palindrome Checker App – Use Case 7 (Deque Based Optimized Method)

## 📌 Project Title

**Palindrome Checker using Deque (Double Ended Queue – Optimized Comparison)**

---

## 📖 Description

This Java console application checks whether a given string is a **palindrome** using a **Deque (Double Ended Queue)** data structure.

A Deque allows insertion and deletion of elements from **both the front and rear ends**, which makes it ideal for **bidirectional comparison**.
Characters of the string are inserted into the deque and then compared by removing elements using:

* `removeFirst()` → removes from the front
* `removeLast()` → removes from the rear

If all corresponding characters match, the string is confirmed as a **palindrome**.

This approach is efficient because it **avoids explicit string reversal** and performs direct **front-to-back symmetric comparison**.

---

## 🎯 Objective

* To understand the working of **Deque (Double Ended Queue)**
* To implement **optimized palindrome validation**
* To perform **bidirectional traversal**
* To improve knowledge of **data structure based algorithms**

---

## ⚙️ Features

* Accepts user input from console
* Stores characters in a Deque
* Compares characters from both ends
* Efficient symmetric validation
* Displays whether the string is **Palindrome / Not Palindrome**

---

## 🧠 Algorithm

1. Start the program
2. Read a string from the user
3. Create an empty Deque
4. Insert each character at the rear of the deque
5. Assume palindrome initially
6. Remove first and last characters
7. Compare both characters
8. If mismatch → Not Palindrome
9. Else continue until deque size becomes 0 or 1
10. Display the result
11. End the program

---

## 💻 Technologies Used

* Java
* Deque Interface (LinkedList implementation)
* Scanner Class
* Looping & Conditional Statements

---

## ▶️ How to Run

### Compile

```id="m8p3x2"
javac UseCase7PalindromeCheckerApp.java
```

### Run

```id="n4q7w1"
java UseCase7PalindromeCheckerApp
```

---

## 🧪 Sample Input / Output

**Input**

```id="z2c6v9"
Enter a string: radar
```

**Output**

```id="b5n8m1"
Result: The given string is a PALINDROME.
```

**Input**

```id="k1l4p7"
Enter a string: coding
```

**Output**

```id="h3j9s5"
Result: The given string is NOT a palindrome.
```

---

## 📊 Time and Space Complexity

* **Time Complexity:** O(n)
* **Space Complexity:** O(n) (Extra space used by Deque)

---

## ✅ Conclusion

Using a **Deque** provides an optimized way to validate palindromes because it allows **simultaneous access to both ends** of the data structure.
This method improves efficiency and demonstrates **advanced data structure usage, symmetric comparison, and algorithm optimization** in Java.

---

## 👨‍💻 Author

sudheer200502

## 🔖 Version

7.0
