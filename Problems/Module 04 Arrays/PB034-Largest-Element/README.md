# PB034 - Largest Element in an Array

## Status

### Module

Module 04 - Arrays

### Problem ID

PB034

### Difficulty

⭐

### Pattern

Traversal + Maximum Tracking

### Platform

Custom

---

# Learning Objectives

- Array Traversal
- Decision Making
- Maximum Tracking

---

# Problem Statement

Given an integer N,

Read N integers into an array and print the largest element.

Example

Input

5

10 25 8 99 40

Output

99

---

# Input Format

First line contains N.

Second line contains N integers.

---

# Output Format

Print the largest element.

---

# Constraints

1 <= N <= 1000

---

# Algorithm

Step 1

Read N.

Step 2

Create an array.

Step 3

Read N elements.

Step 4

Initialize:

largest = arr[0]

Step 5

Traverse from index 1.

If current element > largest

Update largest.

Step 6

Print largest.

---

# Dry Run

Input

5

10 25 8 99 40

| Index | Element | Largest |
|------:|--------:|---------:|
|0|10|10|
|1|25|25|
|2|8|25|
|3|99|99|
|4|40|99|

Output

99

---

# Complexity Analysis

## Time Complexity

O(N)

Reason

One traversal to read and one traversal to find the maximum.

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
- Maximum Tracking
- Conditional Update

---

## Common Mistakes

- Initializing largest as 0.
- Starting comparison from index 0.
- Using <= instead of < in loops.

---

## Interview Tip

Always initialize the maximum with the first element of the array, not with a fixed value.

This ensures the algorithm works correctly even when all numbers are negative.

---

# Related Problems

- PB035 - Smallest Element
- PB036 - Second Largest Element
- LeetCode 53 (future - Kadane's Algorithm)