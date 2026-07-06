# PB009 - Sum of First N Natural Numbers

# Status

## Module
Programming Fundamentals

## Problem ID
PB009

## Difficulty
⭐⭐ Easy

## Pattern
Loops + Accumulation

## Topic
for Loop

## Estimated Time
20 Minutes

## Platform
Custom

---

# Pattern Recognition

Use this pattern when:

✅ Sum from 1 to N

✅ Sum of Even Numbers

✅ Sum of Odd Numbers

✅ Sum of Array Elements

---

# Learning Objectives

After solving this problem you should understand:

- Running Sum
- Accumulator Variable
- Loop Traversal
- Mathematical Thinking

---

# Problem Statement

Given a positive integer N,

find the sum of all natural numbers from 1 to N.

---

# Input Format

One integer N

---

# Output Format

Print the sum.

---

# Constraints

1 <= N <= 100000

---

# Example 1

Input

5

Output

15

Explanation

1 + 2 + 3 + 4 + 5 = 15

---

# Example 2

Input

10

Output

55

---

# Thinking Questions

1. How many times should the loop run?
N times

2. What should be the initial value of the accumulator?
0

3. Which variable stores the answer?
Sum

4. What changes every iteration?
Value of Sum

5. What remains constant?
N

---

# Algorithm

Step 1

Read the integer N.

Step 2

Initialize

sum = 0

Step 3

Run a loop from 1 to N.

Step 4

In every iteration,

sum = sum + i

Step 5

Print sum.

---

# Dry Run

Input

N = 5

| Iteration | i | Sum before | Sum after |
|----------:|---|-------:|--------|
| 1 | 1 | 0 | 1 |
| 2 | 2 | 1 | 3 |
| 3 | 3 | 3 | 6 |
| 4 | 4 | 6 | 10 |
| 5 | 5 | 10 | 15 |

Final Output 15

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

Only two integer variables are used.

---

# Notes

## Concepts Learned

- Accumulator Pattern
- Running Sum
- for Loop
- Loop Traversal

---

## Pattern

Accumulation

---

## Common Mistakes

❌ Writing

sum = i

instead of

sum = sum + i

❌ Starting from 0 instead of 1

❌ Using i < n instead of i <= n

---

## Edge Cases

N = 1

Output

1

---

N = 0

(Depending on constraints, output would be 0.)

---

## Interview Tip

Whenever a problem asks for:

- Sum
- Count
- Total
- Average

Think of an **accumulator variable**.

---

# Interview Insight

This is your first Accumulation problem.

This pattern appears everywhere in DSA.