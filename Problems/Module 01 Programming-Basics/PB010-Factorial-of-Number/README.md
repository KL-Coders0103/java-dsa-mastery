# PB010 - Factorial of a Number

# Status

## Module
Programming Fundamentals

## Problem ID
PB010

## Difficulty
⭐⭐ Easy

## Pattern
Loops + Product Accumulation

## Topic
for Loop

## Estimated Time
20 Minutes

## Platform
Custom

---

# Pattern Recognition

Use this pattern when:

✅ Product of numbers

✅ Factorial

✅ Multiplication accumulation

---

# Learning Objectives

After solving this problem you should understand:

- Product Accumulator
- Loop Traversal
- Mathematical Thinking
- Factorial Concept

---

# Problem Statement

Given a positive integer N,

find the factorial of N.

Factorial is defined as:

N! = 1 × 2 × 3 × ... × N

---

# Input Format

One integer N

---

# Output Format

Print the factorial.

---

# Constraints

0 <= N <= 12

---

# Example 1

Input

5

Output

120

Explanation

5! = 1 × 2 × 3 × 4 × 5

= 120

---

# Example 2

Input

0

Output

1

Explanation

0! = 1

---

# Thinking Questions

1. What is factorial?
Product of integer and all integer below it

2. How many times should the loop run?
till condition becomes false

3. Should the accumulator start with 0 or 1?
1

4. Why can't it start with 0?
because the final result will become 0

5. What is 0! ?
1

---

# Algorithm

Step 1

Read the integer N.

Step 2

Initialize

factorial = 1

Step 3

Run a loop from 1 to N.

Step 4

Multiply

factorial = factorial × i

Step 5

Print factorial.

---

# Dry Run

Input

N = 5

| Iteration | i | factorial before | factorial after |
|-----------:|--:|-----------------:|----------------:|
| 1 | 1 | 1 | 1 |
| 2 | 2 | 1 | 2 |
| 3 | 3 | 2 | 6 |
| 4 | 4 | 6 | 24 |
| 5 | 5 | 24 | 120 |

Output

120

---

# Complexity Analysis

## Time Complexity

O(N)

Reason

The loop executes N times.

---

## Space Complexity

O(1)

Reason

Only a few integer variables are used.

---

# Notes

## Concepts Learned

- Product Accumulator
- for Loop
- Factorial
- Loop Traversal

---

## Pattern

Product Accumulation

---

## Common Mistakes

❌ Initializing factorial as 0

❌ Forgetting to multiply by i

❌ Using addition instead of multiplication

---

## Edge Cases

N = 0

Output

1

---

N = 1

Output

1

---

N = 5

Output

120

---

## Interview Tip

Whenever a problem asks for a product of multiple values, initialize the accumulator to 1, not 0.

---

# Interview Insight

This is the first problem where initializing the accumulator correctly is extremely important.