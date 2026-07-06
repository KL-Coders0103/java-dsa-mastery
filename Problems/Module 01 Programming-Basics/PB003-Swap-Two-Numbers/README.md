# PB003 - Swap Two Numbers

## Module
Module 01 - Programming Fundamentals

## Difficulty
⭐ Easy

## Topic
Variables

## Platform
Custom

---

# Learning Objectives

After completing this problem, you will learn:

- What swapping means
- Why swapping is required
- Temporary variable
- Variable assignment
- Multiple approaches
- Interview discussion

---

# Prerequisites

- Variables
- Input Output
- Arithmetic Operators

---

# Problem Statement

Given two integers A and B, swap their values.

After swapping,

A should contain the value of B.

B should contain the value of A.

Print both numbers after swapping.

---

# Input Format

Two integers

A

B

---

# Output Format

Print the swapped values.

---

# Constraints

-10^9 <= A,B <= 10^9

---

# Example

## Input

10

20

## Output

20

10

---

# Problem Analysis

## Input

Two integers

## Output

Two integers after swapping

---

# Real Life Example

Imagine two glasses.

Glass A contains Apple Juice.

Glass B contains Orange Juice.

Your task is to exchange the juices.

How would you do it?

---

# Thinking Questions

Answer before coding.

1. What does "swap" actually mean?
Swap means changing the value of two content which maybe either numeric, characters etc

2. After swapping, what should A contain?
Value of B

3. After swapping, what should B contain?
Value of A

4. If you directly write
A = B
then what happens to the original value of A?
It takes the value of B and loss it original value, it means B overrides the value of A with its content

5. Why might we need a temporary variable?
so that we can swap the value of A and B

---

# Algorithm

Step 1

Read two integers A and B.

Step 2

Store A in a temporary variable.

Step 3

Assign B to A.

Step 4

Assign temp to B.

Step 5

Print A.

Step 6

Print B.

---

# Dry Run

Input

A = 10

B = 20

Step 1

temp = 10

Step 2

A = 20

Step 3

B = 10

Output

20

10

---

# Complexity

Time Complexity

O(1)

Reason

Only assignments are performed.

---

Space Complexity

O(1)

Reason

One temporary variable is used.

---

# Notes

## Concepts Learned

- Swapping Variables
- Temporary Variable
- Assignment Operator

---

## Common Mistakes

- Forgetting the temporary variable
- Writing A = B first and losing the original value

---

## Pattern

Variable Manipulation

---

## Interview Tip

Always think about preserving data before overwriting it.

---

# Interview Discussion

Can this problem be solved WITHOUT using a third variable?
Yes, There are 2 more ways to swap two numbers
1) Arithmetic Method
2) XOR Methos