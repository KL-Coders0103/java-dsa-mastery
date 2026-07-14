# PB041 - Frequency of an Element

## Status

### Module

Module 04 - Arrays

### Problem ID

PB041

### Difficulty

⭐⭐

### Pattern

Counting / Frequency Counting

### Platform

Custom

---

# Learning Objectives

- Array Traversal
- Counting Pattern
- Conditional Counting

---

# Problem Statement

Given an integer N,

Read N integers into an array.

Then read an integer X.

Print how many times X occurs in the array.

Example

Input

6

10 20 10 30 10 40

10

Output

Frequency = 3

---

# Input Format

First line contains N.

Second line contains N integers.

Third line contains X.

---

# Output Format

Print the frequency of X.

---

# Constraints

1 <= N <= 1000

---

# Algorithm

1. Read N.
2. Read the array.
3. Read X.
4. Initialize `count = 0`.
5. Traverse the array.
6. If current element equals X, increment count.
7. Print count.

---

# Dry Run

Input

6

10 20 10 30 10 40

10

| Element | Count |
|--------:|------:|
|10|1|
|20|1|
|10|2|
|30|2|
|10|3|
|40|3|

Output

3

---

# Complexity Analysis

## Time Complexity

O(N)

Reason

One traversal of the array.

---

## Space Complexity

O(N)

Reason

The array stores N elements.

---

# Concepts Learned

- Counting Pattern
- Frequency Counting
- Array Traversal

---

# Common Mistakes

- Using `break` after the first match.
- Forgetting to initialize count to 0.
- Comparing the wrong variable.

---

# Interview Tip

Frequency counting is the foundation for HashMaps, Frequency Arrays, Counting Sort, and many interview problems.

---

# Related Problems

- PB038 - Linear Search
- Frequency Array (Future)
- HashMap Frequency (Future)