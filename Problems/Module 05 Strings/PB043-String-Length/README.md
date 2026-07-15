# PB043 - String Length

## Status

### Module

Module 05 - Strings

### Problem ID

PB043

### Difficulty

⭐

### Pattern

Built-in String Method

### Platform

Custom

---

# Learning Objectives

- String Length
- length() Method
- String Basics

---

# Problem Statement

Read a string from the user and print its length.

Example

Input

Hello World

Output

11

---

# Input Format

One line containing a string.

---

# Output Format

Print the length of the string.

---

# Constraints

Length <= 100

---

# Algorithm

1. Create Scanner.
2. Read a complete string using `nextLine()`.
3. Use `length()` to find the number of characters.
4. Print the result.

---

# Dry Run

Input

Java

Length

4

Output

4

---

# Complexity Analysis

## Time Complexity

O(1)

Reason

The `length()` method returns the stored length directly.

---

## Space Complexity

O(N)

Reason

The input string is stored in memory.

---

# Concepts Learned

- String Basics
- length() Method
- Reading Full Strings

---

# Common Mistakes

- Using `next()` instead of `nextLine()` for sentences.
- Thinking spaces are ignored.
- Trying to count characters manually.

---

# Interview Tip

Before traversing a string with a loop, store its length:

```java
int n = str.length();
```

This improves readability and avoids repeated method calls.

---

# Related Problems

- PB042 - String Input & Output
- PB044 - Reverse a String