# PB012 - Fibonacci Series

# Status

## Module
Module 02 - Number Manipulation

## Problem ID
PB012

## Difficulty
⭐⭐ Easy

## Pattern
Sequence Generation

## Topic
Loops

## Estimated Time
25-30 Minutes

## Platform
Custom

---

# Pattern Recognition

Use this pattern when:

- Generate a sequence
- Next value depends on previous values
- Mathematical series

---

# Learning Objectives

After solving this problem you should understand:

- Sequence generation
- Variable updates
- Maintaining state
- Loop execution

---

# Problem Statement

Given an integer N,

print the first N numbers of the Fibonacci Series.

The Fibonacci Series starts with:

0 1

Every next number is the sum of the previous two numbers.

---

# Input Format

One integer N

---

# Output Format

Print the first N Fibonacci numbers separated by spaces.

---

# Constraints

1 <= N <= 40

---

# Example 1

Input

5

Output

0 1 1 2 3

---

# Example 2

Input

8

Output

0 1 1 2 3 5 8 13

---

# Thinking Questions

1. Which two numbers do we start with?
0 and 1

2. How do we calculate the next number?
by adding the previous two integers in series

3. Which variables keep changing?
current, next, previous

4. How many variables do we need?
3

5. Why can't we calculate the next number using only one variable?
because the next number will be calculated by using last 2

---

# Algorithm

Step 1

Read the integer N.

Step 2

Initialize:

first = 0

second = 1

Step 3

Print the first two numbers (handling the case where N = 1 separately).

Step 4

Repeat from the 3rd number to N:

- Calculate next = first + second
- Print next
- Update:
  - first = second
  - second = next

Step 5

End.

---

# Dry Run

Input

N = 5

| Step | first | second | next | Output |
|------|------:|-------:|-----:|--------|
|Initial|0|1|-|0 1|
|1|0|1|1|0 1 1|
|2|1|1|2|0 1 1 2|
|3|1|2|3|0 1 1 2 3|

---

# Complexity Analysis

Time Complexity

O(N)

Reason

The loop executes proportional to N.

---

Space Complexity

O(1)

Reason

Only three integer variables are used.

---

# Notes

## Concepts Learned

- Sequence Generation
- Variable Updates
- State Management
- Fibonacci Series

---

## Pattern

Sequence Generation

---

## Common Mistakes

- Forgetting to update first and second.
- Printing extra numbers for N = 1.
- Updating variables in the wrong order.

---

## Edge Cases

N = 1

Output

0

---

N = 2

Output

0 1

---

N = 7

Output

0 1 1 2 3 5 8

---

## Interview Tip

When a problem depends on previous values, think about what **state** needs to be carried from one iteration to the next.

---

# Related Problems

## HackerRank

(Java Loops II helps build looping skills.)

## LeetCode

Fibonacci Number (we'll solve it later after learning functions and recursion).