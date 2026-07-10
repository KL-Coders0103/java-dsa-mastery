# PB032 - Read & Print Array

## Status

### Module
Module 04 - Arrays

### Problem ID
PB032

### Difficulty
⭐

### Pattern
Array Traversal

### Platform
Custom

---

# Learning Objectives

- Array Declaration
- Array Input
- Array Traversal
- for Loop with Arrays

---

# Problem Statement

Given an integer N,

Read N integers into an array and print them in the same order.

Example

Input

5

10 20 30 40 50

Output

10 20 30 40 50

---

# Input Format

First line contains N.

Second line contains N integers.

---

# Output Format

Print all array elements separated by a space.

---

# Constraints

1 <= N <= 100

---

# Algorithm

Step 1

Read N.

Step 2

Create an array of size N.

Step 3

Read N elements.

Step 4

Traverse the array.

Step 5

Print each element.

---

# Dry Run

Input

5

10 20 30 40 50

Array

Index

0 1 2 3 4

Value

10 20 30 40 50

Output

10 20 30 40 50

---

# Complexity Analysis

## Time Complexity

O(N)

Reason

One traversal to read.

One traversal to print.

Overall

O(N)

---

## Space Complexity

O(N)

Reason

The array stores N integers.

---

# Notes

## Concepts Learned

- Array Declaration
- Array Traversal
- Indexing
- arr.length

---

## Common Mistakes

- Using <= instead of <
- Accessing arr[n]
- Forgetting to read input
- Printing the array object directly

---

## Interview Tip

Every array problem starts with:

Read

↓

Traverse

Master this before moving to searching or sorting.

---

# Related Problems

- PB033 - Sum of Array Elements
- PB034 - Largest Element
- PB038 - Linear Search