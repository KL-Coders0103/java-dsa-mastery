# PB050 - Remove Spaces from a String

## Status

### Module

Module 05 - Strings

### Problem ID

PB050

### Difficulty

⭐⭐

### Pattern

String Building

### Platform

Custom

---

# Learning Objectives

- String Traversal
- String Building
- Character Filtering

---

# Problem Statement

Read a string from the user.

Remove all spaces and print the new string.

Example

Input

Hello World Java

Output

HelloWorldJava

---

# Algorithm

1. Read the string.
2. Create an empty string called `result`.
3. Traverse each character.
4. If the character is not a space:
   - Append it to `result`.
5. Print `result`.

---

# Dry Run

Input

Hello World

Result

H

↓

He

↓

Hel

↓

Hello

↓

(space skipped)

↓

HelloWorld

---

# Complexity Analysis

## Time Complexity

O(N²)

Reason

Each concatenation creates a new string.

---

## Space Complexity

O(N)

Reason

A new string is built.

---

# Concepts Learned

- String Traversal
- Character Filtering
- String Building

---

# Common Mistakes

- Trying to modify the original string.
- Forgetting to create a new string.
- Using `replace()` when not allowed.

---

# Interview Tip

For large strings, use `StringBuilder` instead of repeated string concatenation for better performance.

---

# Related Problems

- PB046 - Count Vowels & Consonants
- PB047 - Count Words
- PB049 - Toggle Case