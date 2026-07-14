# PB040 - Check if an Array is Sorted

## Status

### Module

Module 04 - Arrays

### Problem ID

PB040

### Difficulty

⭐⭐

### Pattern

Adjacent Element Comparison

### Platform

Custom

---

# Learning Objectives

- Array Traversal
- Adjacent Element Comparison
- Flag Variable
- Early Termination

---

# Problem Statement

Given an integer N,

Read N integers into an array.

Print "Sorted" if the array is in ascending order.

Otherwise print "Not Sorted".

Example

Input

5

10 20 30 40 50

Output

Sorted

---

# Input Format

First line contains N.

Second line contains N integers.

---

# Output Format

Print

Sorted

or

Not Sorted

---

# Constraints

1 <= N <= 1000

---

# Algorithm

1. Read N.
2. Read the array.
3. Assume the array is sorted.
4. Traverse from index 0 to N-2.
5. Compare arr[i] with arr[i+1].
6. If arr[i] > arr[i+1]:
   - Mark as not sorted.
   - Break.
7. Print the result.

---

# Dry Run

Input

5

10 20 30 40 50

Comparisons

10 ≤ 20 ✅

20 ≤ 30 ✅

30 ≤ 40 ✅

40 ≤ 50 ✅

Output

Sorted

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

- Adjacent Element Comparison
- Flag Variable
- Early Exit

---

# Common Mistakes

- Looping until `n` instead of `n-1`.
- Accessing `arr[i+1]` out of bounds.
- Forgetting to break after finding an unsorted pair.

---

# Interview Tip

Whenever a problem asks you to validate an array's order, compare adjacent elements instead of every pair of elements.

---

# Related Problems

- Bubble Sort
- Monotonic Array
- Binary Search (Prerequisite)