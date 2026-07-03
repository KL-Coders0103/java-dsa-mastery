# PB002 - Even or Odd

## Module
Module 01 - Programming Fundamentals

## Difficulty
⭐ Easy

## Topic
Conditions, Operators

## Platform
Custom

## Related Problems

### HackerRank
- Java If-Else ✅ (Already Solved)

### LeetCode
- No direct equivalent (Concept Building)

---

# Learning Objectives

After solving this problem, you will understand:

- Modulus (%) operator
- if-else statement
- Decision making
- Integer properties
- Time Complexity O(1)

---

# Prerequisites

- Variables
- Scanner
- println()
- Arithmetic operators

---

# Problem Statement

Given an integer N, determine whether it is Even or Odd.

If N is divisible by 2, print:

Even

Otherwise print:

Odd

---

# Input Format

A single integer N.

---

# Output Format

Print

Even

or

Odd

---

# Constraints

-10^9 <= N <= 10^9

---

# Examples

## Example 1

Input

8

Output

Even

---

## Example 2

Input

11

Output

Odd

---

## Problem Analysis

### Input

One integer

### Output

Even or Odd

### Observation

A number divisible by 2 is Even.

Otherwise it is Odd.

---

# Thinking Questions

Answer before writing code.

1. What information is given?
we have given a integer

2. What do we have to determine?
we have to check whether that integer is even or odd

3. Which operator can check divisibility?
Modulus operator (%)

4. What condition checks whether a number is even?
if dividing that integer by 2 gives remainder 0 then it is even otherwise odd

5. Do we need a loop?
No we dont need loop

---

# Algorithm

Step 1

Read an integer N.

Step 2

Check whether N % 2 == 0.

Step 3

If true

Print "Even"

Else

Print "Odd"

Step 4

End

---

# Dry Run

Input

N = 12

Step 1

Read N

N = 12

Step 2

12 % 2 = 0

Step 3

Condition is true

Step 4

Print

Even

---

# Complexity

Time Complexity

O(1)

Reason

One modulus operation and one comparison.

---

Space Complexity

O(1)

Reason

Only one variable is used.

---

# Notes

Concepts Learned

- Modulus Operator (%)
- if-else
- Decision Making

Common Mistakes

- Using division (/) instead of modulus (%)
- Comparing with 1 instead of 0
- Forgetting braces

Pattern

Basic Conditional Checking

Interview Tip

Whenever you hear Even/Odd,
immediately think of %

---