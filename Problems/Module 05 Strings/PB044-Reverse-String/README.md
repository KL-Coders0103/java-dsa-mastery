# PB044 - Reverse a String

## Status

### Module

Module 05 - Strings

### Problem ID

PB044

### Difficulty

⭐⭐

### Pattern

String Traversal

### Platform

Custom

---

# Learning Objectives

- String Traversal
- charAt()
- Reverse Traversal

---

# Problem Statement

Read a string from the user and print the string in reverse order.

Example

Input

Java

Output

avaJ

---

# Input Format

One line containing a string.

---

# Output Format

Print the reversed string.

---

# Constraints

Length <= 100

---

# Algorithm

1. Read the string.
2. Find its length.
3. Start from the last index.
4. Print one character at a time using `charAt(i)`.
5. Continue until index 0.

---

# Dry Run

Input

Java

Indexes

0 1 2 3

J a v a

Traversal

3 → 2 → 1 → 0

Output

avaJ

---

# Complexity Analysis

## Time Complexity

O(N)

Reason

Every character is visited exactly once.

---

## Space Complexity

O(1)

Reason

No additional data structure is used.

---

# Concepts Learned

- Reverse Traversal
- charAt()
- String Indexing

---

# Common Mistakes

- Starting from `length()` instead of `length() - 1`.
- Using `i > 0` instead of `i >= 0`.
- Forgetting that strings are zero-indexed.

---

# Interview Tip

Whenever you're asked to process characters one by one, think of a string as an array of characters and use:

```java
char ch = str.charAt(i);
```

---

# Related Problems

- PB043 - String Length
- PB045 - Palindrome String