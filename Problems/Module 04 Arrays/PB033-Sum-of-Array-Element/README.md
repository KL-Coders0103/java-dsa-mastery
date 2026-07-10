# PB033 - Sum of Array Elements

## Status

### Module

Module 04 - Arrays

### Problem ID

PB033

### Difficulty

⭐

### Pattern

Traversal + Accumulator

### Platform

Custom

---

# Learning Objectives

- Array Traversal
- Accumulator Pattern
- Processing Elements

---

# Problem Statement

Given an integer N,

Read N integers into an array and print the sum of all elements.

Example

Input

5

10 20 30 40 50

Output

150

---

# Input Format

First line contains N.

Second line contains N integers.

---

# Output Format

Print the sum of all elements.

---

# Constraints

1 <= N <= 1000

---

# Algorithm

Step 1

Read N.

Step 2

Create an array of size N.

Step 3

Read N elements.

Step 4

Initialize sum = 0.

Step 5

Traverse the array and add each element to sum.

Step 6

Print sum.

---

# Dry Run

Input

5

10 20 30 40 50

| Index | Element | Sum |
|------:|--------:|----:|
|0|10|10|
|1|20|30|
|2|30|60|
|3|40|100|
|4|50|150|

Output

150

---

# Complexity Analysis

## Time Complexity

O(N)

Reason

One traversal to read and one traversal to process.

Overall complexity remains O(N).

---

## Space Complexity

O(N)

Reason

The array stores N elements.

---

# Notes

## Concepts Learned

- Array Traversal
- Accumulator Pattern
- Running Sum

---

## Common Mistakes

- Forgetting to initialize sum to 0.
- Using <= instead of < in loops.
- Printing the array instead of the sum.

---

## Interview Tip

Whenever you need a total, initialize an accumulator (like sum = 0) and update it during traversal.

---

# Related Problems

- PB034 - Largest Element
- PB035 - Smallest Element
- Prefix Sum (Future Module)