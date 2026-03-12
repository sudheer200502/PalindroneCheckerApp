# Palindrome Checker App – Use Case 8 (LinkedList Based Method)

## 📌 Project Title

**Palindrome Checker using LinkedList (Double Ended Symmetric Validation)**

---

## 📖 Description

This Java console application checks whether a given string is a **palindrome** using a **LinkedList data structure**.

Characters of the string are added into a LinkedList and then compared by **removing elements from both ends**:

* `removeFirst()` → removes the first element
* `removeLast()` → removes the last element

If the characters match during each comparison, the string is confirmed as a **palindrome**.

This method demonstrates how **LinkedList supports efficient double-ended operations**, making it suitable for **symmetric validation problems** like palindrome checking.

---

## 🎯 Objective

* To understand the working of **LinkedList**
* To implement **palindrome validation using list operations**
* To perform **front and rear comparison**
* To strengthen knowledge of **Java Collections Framework**

---

## ⚙️ Features

* Accepts user input from console
* Stores characters in a LinkedList
* Performs symmetric comparison from both ends
* Displays whether the string is **Palindrome / Not Palindrome**
* Avoids explicit string reversal

---

## 🧠 Algorithm

1. Start the program
2. Read a string from the user
3. Create an empty LinkedList
4. Add each character of the string to the list
5. Assume palindrome initially
6. Remove first and last elements
7. Compare both characters
8. If mismatch → Not Palindrome
9. Else continue until list size becomes 0 or 1
10. Display the result
11. End the program

---

## 💻 Technologies Used

* Java
* LinkedList Class (Java Collections Framework)
* Scanner Class
* Loops and Conditional Statements

---

## ▶️ How to Run

### Compile

```id="u1p4l9"
javac UseCase8PalindromeCheckerApp.java
```

### Run

```id="x6v3b8"
java UseCase8PalindromeCheckerApp
```

---

## 🧪 Sample Input / Output

**Input**

```id="m2n5c7"
Enter a string: madam
```

**Output**

```id="q9w4e1"
Result: The given string is a PALINDROME.
```

**Input**

```id="r8t2y6"
Enter a string: structure
```

**Output**

```id="z3x7c5"
Result: The given string is NOT a palindrome.
```

---

## 📊 Time and Space Complexity

* **Time Complexity:** O(n)
* **Space Complexity:** O(n) (Extra space used by LinkedList)

---

## ✅ Conclusion

Using a **LinkedList** allows efficient **double-ended traversal and deletion**, which makes palindrome validation straightforward and optimized.
This approach helps learners understand **linked data structures, symmetric comparison logic, and practical usage of Java collection classes**.

---

## 👨‍💻 Author

sudheer200502

## 🔖 Version

8.0
