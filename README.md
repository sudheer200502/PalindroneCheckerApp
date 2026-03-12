# Palindrome Checker App – Use Case 9 (Recursive Method)

## 📌 Project Title

**Palindrome Checker using Recursion (Divide and Conquer Approach)**

---

## 📖 Description

This Java console application checks whether a given string is a **palindrome** using **recursion**.

Characters are compared from the **outer positions moving inward** through recursive method calls.
The recursion continues until:

* All characters match → Palindrome
* A mismatch is found → Not Palindrome

This demonstrates the **divide-and-conquer strategy** using method recursion.

---

## 🎯 Objective

* To understand **recursion concept**
* To implement palindrome validation using **recursive calls**
* To perform **inward symmetric comparison**
* To improve algorithmic thinking

---

## ⚙️ Features

* Accepts user input from console
* Uses recursive function for validation
* No extra data structures required
* Efficient symmetric checking
* Displays whether the string is **Palindrome / Not Palindrome**

---

## 🧠 Algorithm

1. Start the program
2. Read a string from the user
3. Call recursive function with start = 0 and end = length − 1
4. If start ≥ end → Palindrome
5. If characters mismatch → Not Palindrome
6. Else recursively call for inner substring
7. Display the result
8. End the program

---

## 💻 Technologies Used

* Java
* Recursion
* Scanner Class
* Conditional Statements

---

## ▶️ How to Run

### Compile

```
javac UseCase9PalindromeCheckerApp.java
```

### Run

```
java UseCase9PalindromeCheckerApp
```

---

## 🧪 Sample Input / Output

**Input**

```
Enter a string: racecar
```

**Output**

```
Result: The given string is a PALINDROME.
```

**Input**

```
Enter a string: recursion
```

**Output**

```
Result: The given string is NOT a palindrome.
```

---

## 📊 Time and Space Complexity

* **Time Complexity:** O(n)
* **Space Complexity:** O(n) (Recursive call stack)

---

## ✅ Conclusion

Recursive palindrome validation provides a clean and elegant solution by applying **divide-and-conquer logic**.
It helps learners understand **function calls, base conditions, and stack memory behavior** in Java.

---

## 👨‍💻 Author

sudheer200502

## 🔖 Version

9.0
