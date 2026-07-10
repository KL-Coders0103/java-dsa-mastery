# PB036 - Second Largest Element in an Array

## Status

### Module

Module 04 - Arrays

### Problem ID

PB036

### Difficulty

⭐⭐

### Pattern

Traversal + Dual Variable Tracking

### Platform

Custom

---

# Learning Objectives

- Array Traversal
- Maximum Tracking
- Dual Variable Tracking

---

# Problem Statement

Given an integer N,

Read N integers into an array and print the second largest distinct element.

Example

Input

5

10 40 25 99 70

Output

70

---

# Input Format

First line contains N.

Second line contains N integers.

---

# Output Format

Print the second largest element.

---

# Constraints

2 <= N <= 1000

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

largest = arr[0]

secondLargest = arr[0]

Step 5

Traverse the array from index 1.

Case 1

If current element > largest

secondLargest = largest

largest = current element

Case 2

Else if current element > secondLargest
and current element != largest

Update secondLargest

Step 6

Print secondLargest.

---

# Dry Run

Input

5

10 40 25 99 70

Initially

largest = 10

secondLargest = 10

| Current | Largest | Second Largest |
|---------|--------:|---------------:|
|10|10|10|
|40|40|10|
|25|40|25|
|99|99|40|
|70|99|70|

Output

70

---

# Complexity Analysis

## Time Complexity

O(N)

Reason

Only one traversal is required.

---

## Space Complexity

O(N)

Reason

The array stores N elements.

---

# Concepts Learned

- Dual Variable Tracking
- Maximum Tracking
- Conditional Updates
- Single Pass Traversal

---

# Common Mistakes

- Initializing secondLargest incorrectly.
- Forgetting to update secondLargest when largest changes.
- Using sorting instead of traversal.
- Ignoring duplicate values.

---

# Interview Tip

Whenever you need the "top two" values, think about maintaining two variables instead of sorting the array.

Sorting takes O(N log N).

This solution takes O(N).

---

# Related Problems

- PB034 - Largest Element
- PB035 - Smallest Element
- LeetCode 414 - Third Maximum Number
- LeetCode 747 - Largest Number At Least Twice of Others