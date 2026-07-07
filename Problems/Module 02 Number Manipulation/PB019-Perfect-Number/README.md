# PB019 - Perfect Number

# Status

## Module
Module 02 - Number Manipulation

## Problem ID
PB019

## Difficulty
⭐⭐⭐

## Pattern
Factor Traversal + Accumulation

## Topic
Factors

## Estimated Time
30 Minutes

## Platform
Custom

---

# Pattern Recognition

Use this pattern when:

- Finding factors
- Sum of factors
- Number theory
- Divisor problems

---

# Learning Objectives

After solving this problem you should understand:

- Proper Factors
- Factor Traversal
- Sum Accumulation
- Number Comparison

---

# Problem Statement

Given a positive integer N,

determine whether it is a Perfect Number.

Print

Perfect Number

or

Not a Perfect Number

---

# Definition

A Perfect Number is a number that is equal to the sum of all its proper factors.

Proper factors include all positive factors except the number itself.

---

# Input Format

One integer N

---

# Output Format

Perfect Number

OR

Not a Perfect Number

---

# Constraints

1 <= N <= 100000

---

# Example 1

Input

6

Output

Perfect Number

Explanation

Factors of 6

1 2 3

Sum = 6

---

# Example 2

Input

28

Output

Perfect Number

Explanation

Factors

1 2 4 7 14

Sum = 28

---

# Example 3

Input

10

Output

Not a Perfect Number

Explanation

Factors

1 2 5

Sum = 8

---

# Thinking Questions

1. What are proper factors?
which divide the number completely

2. Should we include the number itself?
no

3. Which loop should we use?
For loop

4. What variable stores the sum?
Sum variable

---

# Algorithm

Step 1

Read the integer N.

Step 2

Store the original number.

Step 3

Initialize sum = 0.

Step 4

Loop from 1 to N - 1.

If i is a factor of N,

add i to sum.

Step 5

Compare sum with the original number.

If equal,

print "Perfect Number".

Otherwise,

print "Not a Perfect Number".

---

# Dry Run

Input

6

| i | 6 % i | Factor | Sum |
|--:|-------:|:------:|----:|
|1|0|Yes|1|
|2|0|Yes|3|
|3|0|Yes|6|
|4|2|No|6|
|5|1|No|6|

Original = 6

Sum = 6

Output

Perfect Number

---

# Complexity Analysis

Time Complexity

O(N)

Reason

We check every number from 1 to N-1.

---

Space Complexity

O(1)

Reason

Only a few integer variables are used.

---

# Notes

## Concepts Learned

- Factor Traversal
- Proper Factors
- Accumulation
- Comparison

---

## Pattern

Factor Traversal + Accumulation

---

## Common Mistakes

- Storing original = sum instead of original = num.
- Including the number itself as a proper factor.
- Forgetting that 1 is not a Perfect Number.

---

## Edge Cases

1 → Not Perfect Number

6 → Perfect Number

28 → Perfect Number

10 → Not Perfect Number

---

# Related Problems

LeetCode

- Check Perfect Number (later optimized version)