# PB039 - Count Even & Odd Elements in an Array

## Status

### Module

Module 04 - Arrays

### Problem ID

PB039

### Difficulty

⭐

### Pattern

Traversal + Multiple Accumulators

### Platform

Custom

---

# Learning Objectives

- Array Traversal
- Multiple Counters
- Decision Making

---

# Problem Statement

Given an integer N,

Read N integers into an array.

Print the count of even elements and odd elements.

Example

Input

6

10 15 20 7 8 11

Output

Even Count = 3

Odd Count = 3

---

# Input Format

First line contains N.

Second line contains N integers.

---

# Output Format

Print the even count and odd count.

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

Initialize

even = 0

odd = 0

Step 5

Traverse the array.

If element is even

even++

Else

odd++

Step 6

Print both counts.

---

# Dry Run

Input

6

10 15 20 7 8 11

| Element | Even | Odd |
|--------:|-----:|----:|
|10|1|0|
|15|1|1|
|20|2|1|
|7|2|2|
|8|3|2|
|11|3|3|

Output

Even Count = 3

Odd Count = 3

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

- Array Traversal
- Multiple Accumulators
- Conditional Counting

---

# Common Mistakes

- Forgetting to initialize counters to 0.
- Using separate loops for even and odd counts.
- Incorrect modulus condition.

---

# Interview Tip

Whenever you need to count multiple categories in one pass, create one counter for each category and update the appropriate one during traversal.

---

# Related Problems

- PB033 - Sum of Array Elements
- PB038 - Linear Search
- PB041 - Frequency of an Element