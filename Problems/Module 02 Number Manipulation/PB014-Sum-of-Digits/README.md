# PB014 - Sum of Digits

# Status

## Module

Module 02 - Number Manipulation

## Problem ID

PB014

## Difficulty

⭐⭐ Easy

## Pattern

Digit Extraction + Accumulation

## Topic

while Loop, Modulus, Integer Division

## Estimated Time

20 Minutes

## Platform

Custom

---

# Pattern Recognition

Use this pattern when:

- Sum of digits
- Product of digits
- Digital Root
- Harshad Number

---

# Learning Objectives

After solving this problem you should understand:

- Digit Extraction
- Accumulator Pattern
- Combining two patterns together

---

# Problem Statement

Given an integer N,

find the sum of all digits of the number.

---

# Input Format

One integer N

---

# Output Format

Print the sum of all digits.

---

# Constraints

0 <= N <= 2,147,483,647

---

# Example 1

Input

5387

Output

23

Explanation

5 + 3 + 8 + 7 = 23

---

# Example 2

Input

9

Output

9

---

# Example 3

Input

1002

Output

3

---

# Thinking Questions

1. How do we extract the last digit?
using modulus operator

2. How do we remove the last digit?
using divison operator

3. Which variable stores the answer?
Sum

4. Which line changes compared to PB013?
Count ++

---

# Algorithm

Step 1

Read the integer N.

Step 2

Initialize

sum = 0

Step 3

While N > 0

- Extract last digit using N % 10
- Add digit to sum
- Remove last digit using N / 10

Step 4

Print sum.

---

# Dry Run

Input

5387

| Iteration | Number Before | Digit | Sum Before | Sum After | Number After |
|-----------:|--------------:|------:|-----------:|----------:|-------------:|
|1|5387|7|0|7|538|
|2|538|8|7|15|53|
|3|53|3|15|18|5|
|4|5|5|18|23|0|

Output

23

---

# Complexity Analysis

## Time Complexity

O(D)

Reason

The loop executes once for every digit.

Where D = Number of Digits.

---

## Space Complexity

O(1)

Reason

Only a few integer variables are used.

---

# Notes

## Concepts Learned

- Digit Extraction
- Accumulator Pattern
- while Loop
- Integer Division
- Modulus Operator

---

## Pattern

Digit Extraction + Accumulation

---

## Common Mistakes

- Forgetting to divide by 10
- Adding the number instead of the digit
- Using String conversion

---

## Edge Cases

N = 0 → Sum = 0

N = 9 → Sum = 9

N = 1002 → Sum = 3

N = 9999 → Sum = 36

---

## Interview Tip

Whenever a problem asks for processing every digit of a number, think:

Extract → Process → Remove → Repeats

---

# Related Problems

HackerRank

Find Digits (Later)

LeetCode

Add Digits (Later)