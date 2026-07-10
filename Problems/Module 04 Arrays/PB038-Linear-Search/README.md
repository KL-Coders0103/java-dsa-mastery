# PB038 - Linear Search

## Status

### Module

Module 04 - Arrays

### Problem ID

PB038

### Difficulty

⭐

### Pattern

Linear Search

### Platform

Custom

---

# Learning Objectives

- Array Traversal
- Searching
- Flag Variable
- Early Termination using break

---

# Problem Statement

Given an integer N,

Read N integers into an array.

Then read another integer X.

Print "Found" if X exists in the array, otherwise print "Not Found".

Example

Input

5

10 20 30 40 50

30

Output

Found

---

# Input Format

First line contains N.

Second line contains N integers.

Third line contains X.

---

# Output Format

Print

Found

or

Not Found

---

# Constraints

1 <= N <= 1000

---

# Algorithm

1. Read N.
2. Read the array.
3. Read the key.
4. Initialize `found = false`.
5. Traverse the array.
6. If an element equals the key:
   - Set `found = true`
   - Break the loop.
7. Print the result.

---

# Dry Run

Input

5

10 20 30 40 50

30

Traversal

10 ❌

20 ❌

30 ✅

Stop

Output

Found

---

# Complexity Analysis

## Time Complexity

O(N)

Worst case: search reaches the last element.

---

## Space Complexity

O(N)

Array stores N elements.

---

# Concepts Learned

- Linear Search
- Flag Variable
- Early Termination
- Array Traversal

---

# Common Mistakes

- Forgetting `break`.
- Hardcoding the array.
- Resetting the flag unnecessarily.
- Using `==` incorrectly with objects (future Java topic).

---

# Interview Tip

If the array is **unsorted**, Linear Search is often the simplest correct solution.
If the array is **sorted**, Binary Search may provide a faster solution.

---

# Related Problems

- PB040 - Check if Array is Sorted
- Binary Search (Future Module)