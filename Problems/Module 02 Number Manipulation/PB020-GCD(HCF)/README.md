# PB020 - GCD (HCF)

# Status

## Module
Module 02 - Number Manipulation

## Problem ID
PB020

## Difficulty
⭐⭐⭐

## Pattern
Common Factor Traversal

## Topic
Factors

## Estimated Time
30 Minutes

## Platform
Custom

---

# Learning Objectives

- Understand GCD
- Find common factors
- Compare factors
- Prepare for Euclidean Algorithm

---

# Problem Statement

Given two positive integers A and B,

find their Greatest Common Divisor (GCD).

---

# Example 1

Input

12 18

Output

6

Explanation

Factors of 12

1 2 3 4 6 12

Factors of 18

1 2 3 6 9 18

Greatest Common Factor = 6

---

# Example 2

Input

20 30

Output

10

---

# Thinking Questions

1. What is a common factor?
the factor which divides both integer completely

2. How do we know a number divides both A and B?
by using && condition

3. Which loop should we use?
for loop

4. How do we keep track of the greatest factor?
by updating everytime when we get common factor

---

# Algorithm

Step 1

Read two integers A and B.

Step 2

Find the smaller number.

Step 3

Initialize

gcd = 1

Step 4

Loop from 1 to min(A, B).

If i divides both numbers,

update gcd = i.

Step 5

Print gcd.

---

# Dry Run

Input

12 18

| i | 12 % i | 18 % i | Common Factor | GCD |
|---|--------|--------|---------------|-----|
|1|0|0|Yes|1|
|2|0|0|Yes|2|
|3|0|0|Yes|3|
|4|0|2|No|3|
|5|2|3|No|3|
|6|0|0|Yes|6|

Output

6

---

# Complexity Analysis

## Time Complexity

O(min(A, B))

Reason

The loop executes from 1 to the smaller of the two numbers.

---

## Space Complexity

O(1)

Reason

Only a few integer variables are used.

---

# Notes

## Concepts Learned

- Common Factors
- Greatest Common Divisor (GCD)
- Factor Traversal
- Math.min()

---

## Pattern

Common Factor Traversal

---

## Common Mistakes

- Looping to the larger number instead of the smaller.
- Forgetting to update gcd.
- Breaking the loop too early.

---

## Edge Cases

12 18 → 6

20 30 → 10

17 19 → 1

15 15 → 15

1 100 → 1

---

## Interview Tip

When checking factors of two numbers, always iterate up to the smaller number.