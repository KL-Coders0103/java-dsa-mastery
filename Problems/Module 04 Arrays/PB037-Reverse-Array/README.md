# PB037 - Reverse an Array

## Status

### Module

Module 04 - Arrays

### Problem ID

PB037

### Difficulty

⭐⭐

### Pattern

Two Pointer Technique

### Platform

Custom

---

# Learning Objectives

- Array Traversal
- Swapping
- Two Pointer Technique

---

# Problem Statement

Given an integer N,

Read N integers into an array and reverse the array in-place.

Example

Input

5

10 20 30 40 50

Output

50 40 30 20 10

---

# Input Format

First line contains N.

Second line contains N integers.

---

# Output Format

Print the reversed array.

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

Read all elements.

Step 4

Initialize

left = 0

right = n - 1

Step 5

While left < right

- Swap arr[left] and arr[right]
- left++
- right--

Step 6

Print the array.

---

# Dry Run

Input

5

10 20 30 40 50

Swap 1

50 20 30 40 10

Swap 2

50 40 30 20 10

Output

50 40 30 20 10

---

# Complexity Analysis

## Time Complexity

O(N)

Reason

Only half of the array is swapped.

Still linear time.

---

## Space Complexity

O(1)

Reason

No extra array is created.

Only one temporary variable is used.

---

# Concepts Learned

- Two Pointer Technique
- Swapping
- In-place Array Modification

---

# Common Mistakes

- Using a second array unnecessarily.
- Forgetting to move both pointers.
- Using `left <= right`, causing an unnecessary self-swap.

---

# Interview Tip

Whenever a problem asks for reversing or comparing from both ends, think about the Two Pointer Technique before considering extra memory.

---

# Related Problems

- PB016 - Palindrome Number
- Reverse String (future)
- Valid Palindrome (future)
- Move Zeroes (future)