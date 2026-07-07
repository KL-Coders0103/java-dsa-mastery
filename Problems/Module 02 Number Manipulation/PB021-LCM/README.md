# PB021 - LCM (Least Common Multiple)

# Status

## Module
Module 02 - Number Manipulation

## Problem ID
PB021

## Difficulty
⭐⭐⭐

## Pattern
GCD + Mathematical Relation

## Topic
Number Theory

## Estimated Time
20 Minutes

## Platform
Custom

---

# Pattern Recognition

Use this pattern when:

- Least Common Multiple
- Fraction Problems
- Number Theory

---

# Learning Objectives

After solving this problem you should understand:

- Relationship between GCD and LCM
- Mathematical Optimization
- Integer Arithmetic

---

# Problem Statement

Given two positive integers A and B,

find their Least Common Multiple (LCM).

---

# Input Format

Two integers A and B.

---

# Output Format

Print the Least Common Multiple.

---

# Constraints

1 <= A, B <= 100000

---

# Example 1

Input

12 18

Output

36

---

# Example 2

Input

20 30

Output

60

---

# Thinking Questions

1. What is the GCD of A and B?
largest integer that divides both number

2. Is there a relation between GCD and LCM?
Yes

3. Can we reuse our previous problem?
Yes

---

# Algorithm

Step 1

Read two integers A and B.

Step 2

Find GCD using factor traversal.

Step 3

Calculate

LCM = (A × B) / GCD

Step 4

Print LCM.

---

# Dry Run

Input

12 18

GCD

| i | Common Factor | GCD |
|---|---------------|-----|
|1|Yes|1|
|2|Yes|2|
|3|Yes|3|
|6|Yes|6|

LCM

(12 × 18) / 6

216 / 6

36

---

# Complexity Analysis

Time Complexity

O(min(A, B))

Reason

The GCD is found by checking factors up to the smaller number.

---

Space Complexity

O(1)

Reason

Only integer variables are used.

---

# Notes

## Concepts Learned

- GCD
- LCM
- Mathematical Formula
- Code Reusability

---

## Pattern

Reuse Previous Result

---

## Formula

LCM = (A × B) / GCD

---

## Common Mistakes

- Using the larger number instead of the smaller for GCD.
- Forgetting to calculate GCD before LCM.
- Multiplication overflow for large numbers.

---

## Interview Tip

Whenever GCD is known, LCM can be calculated directly using the mathematical relation.