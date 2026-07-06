# PB008 - Multiplication Table

# Status

## Module
Programming Fundamentals

## Problem ID
PB008

## Difficulty
⭐⭐ Easy

## Pattern
Loops

## Topic
for Loop

## Estimated Time
20 Minutes

## Platform
Custom

---

# Learning Objectives

After solving this problem, you will understand:

- for loop
- Loop variable
- Initialization
- Condition
- Increment
- Dry running loops

---

# Problem Statement

Given an integer N,

Print the multiplication table of N from 1 to 10.

---

# Input Format

One integer N.

---

# Output Format

Print

N x 1 = N

N x 2 = ...

...

N x 10 = ...

---

# Example

Input

5

Output

5 x 1 = 5

5 x 2 = 10

5 x 3 = 15

...

5 x 10 = 50

---

# Thinking Questions

1. How many times should we repeat?
Untill the condition is true i.e 10 times.

2. Which loop is suitable?
For loop.

3. What should be the initial value?
initial value should be 1 because multiplication table never starts with 0

4. When should the loop stop?
When the codition becomes false

5. How will the value increase?
using increment operator

---

# Algorithm

Step 1

Read the integer N.

Step 2

Start a loop from 1 to 10.

Step 3

For each value of i,

calculate

N × i

Step 4

Print

N x i = Result

Step 5

End the loop.

---

# Dry Run

Input

N = 5

| Iteration | i | Result | Output |
|----------:|---|-------:|--------|
| 1 | 1 | 5 | 5 x 1 = 5 |
| 2 | 2 | 10 | 5 x 2 = 10 |
| 3 | 3 | 15 | 5 x 3 = 15 |
| 4 | 4 | 20 | 5 x 4 = 20 |
| 5 | 5 | 25 | 5 x 5 = 25 |
| 6 | 6 | 30 | 5 x 6 = 30 |
| 7 | 7 | 35 | 5 x 7 = 35 |
| 8 | 8 | 40 | 5 x 8 = 40 |
| 9 | 9 | 45 | 5 x 9 = 45 |
| 10 | 10 | 50 | 5 x 10 = 50 |

---

# Complexity

## Time Complexity

O(1)

Reason

The loop always executes exactly 10 times.

---

## Space Complexity

O(1)

Reason

Only a few integer variables are used.

---

# Notes

## Concepts Learned

- for loop
- Loop variable
- Initialization
- Condition
- Increment
- Repetition

---

## Pattern

Fixed Iteration Loop

---

## Common Mistakes

- Starting from 0 instead of 1
- Using i < 10 instead of i <= 10
- Forgetting i++
- Infinite loop

---

## Edge Cases

Input

0

Output

0 x 1 = 0
...
0 x 10 = 0

---

Input

-5

Output

-5 x 1 = -5
...
-5 x 10 = -50

---

## Interview Tip

Whenever a problem asks you to repeat an operation a fixed number of times, think of a `for` loop.

---

# Interview Insight

This is your first loop problem. Understanding the execution flow is more important than memorizing the syntax.