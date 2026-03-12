# Palindrome Checker App – Use Case 10 (Normalized Validation Method)

## 📌 Project Title

**Palindrome Checker using String Normalization (Case & Symbol Independent Validation)**

---

## 📖 Description

This Java console application checks whether a given string is a **palindrome after preprocessing (normalization)**.

Normalization includes:

* Removing spaces and special symbols
* Converting all characters to lowercase

This ensures the palindrome validation is **logical rather than format dependent**.

Example:
"A man a plan a canal Panama" → Valid Palindrome after normalization.

---

## 🎯 Objective

* To understand **string preprocessing techniques**
* To implement **case-insensitive palindrome validation**
* To ignore spaces and symbols during comparison
* To improve real-world string handling skills

---

## ⚙️ Features

* Accepts user input from console
* Removes non-alphanumeric characters
* Converts string to lowercase
* Performs symmetric comparison
* Displays whether the string is **Palindrome / Not Palindrome**

---

## 🧠 Algorithm

1. Start the program
2. Read a string from the user
3. Normalize the string:

    * Remove spaces and symbols
    * Convert to lowercase
4. Assume palindrome initially
5. Compare characters from both ends
6. If mismatch → Not Palindrome
7. Else continue comparison
8. Display the result
9. End the program

---

## 💻 Technologies Used

* Java
* String Functions (`replaceAll`, `toLowerCase`)
* Scanner Class
* Looping & Conditional Statements

---

## ▶️ How to Run

### Compile

```
javac UseCase10PalindromeCheckerApp.java
```

### Run

```
java UseCase10PalindromeCheckerApp
```

---

## 🧪 Sample Input / Output

**Input**

```
Enter a string: A man a plan a canal Panama
```

**Output**

```
Result: The given string is a PALINDROME.
```

**Input**

```
Enter a string: OpenAI
```

**Output**

```
Result: The given string is NOT a palindrome.
```

---

## 📊 Time and Space Complexity

* **Time Complexity:** O(n)
* **Space Complexity:** O(n) (Normalized string storage)

---

## ✅ Conclusion

Normalized palindrome validation is a **practical and real-world approach** because it ignores formatting differences like spaces, punctuation, and letter case.
This method improves understanding of **string manipulation, preprocessing, and logical comparison techniques** in Java.

---

## 👨‍💻 Author

sudheer200502

## 🔖 Version

10.0
