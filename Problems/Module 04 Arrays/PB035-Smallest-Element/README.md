# PB035 - Smallest Element in an Array

## Status

### Module

Module 04 - Arrays

### Problem ID

PB035

### Difficulty

⭐

### Pattern

Traversal + Minimum Tracking

### Platform

Custom

---

# Learning Objectives

- Array Traversal
- Minimum Tracking
- Conditional Updates

---

# Problem Statement

Given an integer N,

Read N integers into an array and print the smallest element.

Example

Input

5

10 25 8 99 40

Output

8

---

# Input Format

First line contains N.

Second line contains N integers.

---

# Output Format

Print the smallest element.

---

# Constraints

1 <= N <= 1000

---

# Algorithm

1. Read N.
2. Create an array.
3. Read all elements.
4. Initialize `min = arr[0]`.
5. Traverse from index 1.
6. If current element is smaller than `min`, update `min`.
7. Print `min`.

---

# Dry Run

Input

5

10 25 8 99 40

| Index | Element | Minimum |
|------:|--------:|---------:|
|0|10|10|
|1|25|10|
|2|8|8|
|3|99|8|
|4|40|8|

Output

8

---

# Complexity Analysis

Time Complexity

O(N)

Space Complexity

O(N)

---

# Concepts Learned

- Array Traversal
- Minimum Tracking
- Conditional Update

---

# Common Mistakes

- Initializing minimum with 0.
- Starting traversal from index 0.
- Using incorrect comparison operator.

---

# Interview Tip

Initialize the minimum with the first array element instead of a fixed value.

This ensures correctness even when all elements are negative.

---

# Related Problems

- PB034 - Largest Element
- PB036 - Second Largest Element