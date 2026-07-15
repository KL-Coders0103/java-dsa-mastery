# PB042 - String Input & Output

## Status

### Module

Module 05 - Strings

### Problem ID

PB042

### Difficulty

⭐

### Pattern

String Basics

### Platform

Custom

---

# Learning Objectives

- String Declaration
- String Input
- String Output
- next() vs nextLine()

---

# Problem Statement

Read a string from the user and print it exactly as entered.

Example

Input

Hello World

Output

Hello World

---

# Input Format

One line containing a string.

---

# Output Format

Print the same string.

---

# Constraints

Length <= 100

---

# Algorithm

1. Create Scanner.
2. Read a complete line using `nextLine()`.
3. Store it in a String.
4. Print the String.

---

# Dry Run

Input

Java Programming

String

"Java Programming"

Output

Java Programming

---

# Complexity Analysis

## Time Complexity

O(N)

Reason

Reading and printing a string of length N.

---

## Space Complexity

O(N)

Reason

The input string is stored in memory.

---

# Concepts Learned

- String Basics
- nextLine()
- Input/Output

---

# Common Mistakes

- Using `next()` when spaces should be included.
- Mixing `nextInt()` and `nextLine()` without consuming the newline.

---

# Interview Tip

Use `nextLine()` whenever the input can contain spaces.

Use `next()` only when you need a single word.

---

# Related Problems

- PB043 - String Length
- PB044 - Reverse a String