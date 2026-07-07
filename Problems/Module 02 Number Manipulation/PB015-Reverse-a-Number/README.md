# PB015 - Reverse Number

# Status

## Module
Module 02 - Number Manipulation

## Problem ID
PB015

## Difficulty
⭐⭐ Easy

## Pattern
Digit Extraction + Number Construction

## Topic
while Loop, Modulus, Integer Division

## Estimated Time
25-30 Minutes

## Platform
Custom

---

# Pattern Recognition

Use this pattern when:

- Reverse a number
- Palindrome Number
- Reverse Integer
- Digit rearrangement

---

# Learning Objectives

After solving this problem you should understand:

- Digit Extraction
- Building a new number
- Place value
- while Loop

---

# Problem Statement

Given an integer N,

reverse the digits of the number and print the reversed number.

---

# Input Format

One integer N.

---

# Output Format

Print the reversed number.

---

# Constraints

0 <= N <= 2,147,483,647

---

# Example 1

Input

1234

Output

4321

---

# Example 2

Input

900

Output

9

---

# Example 3

Input

1203

Output

3021

---

# Thinking Questions

1. How do we get the last digit?
Using modulus operator

2. How do we remove the last digit?
Using division operator

3. How do we build a new number?
by multiplying it by 10 and then add the digit

4. Why do we multiply by 10?
because it then add the number at once place and shift the previous number to tens place

---

# Algorithm

Step 1

Read the integer N.

Step 2

Initialize

reverse = 0

Step 3

While N > 0

- Extract last digit using N % 10
- Build the reversed number:
  reverse = reverse × 10 + digit
- Remove the last digit:
  N = N / 10

Step 4

Print reverse.

---

# Dry Run

Input

1234

| Iteration | Number Before | Digit | Reverse Before | Reverse After | Number After |
|-----------:|--------------:|------:|---------------:|--------------:|-------------:|
|1|1234|4|0|4|123|
|2|123|3|4|43|12|
|3|12|2|43|432|1|
|4|1|1|432|4321|0|

Output

4321

---

# Complexity Analysis

Time Complexity

O(D)

Reason

The loop runs once for every digit.

---

Space Complexity

O(1)

Reason

Only a few integer variables are used.

---

# Notes

## Concepts Learned

- Digit Extraction
- Number Construction
- Place Value
- while Loop

---

## Pattern

Digit Extraction + Number Construction

---

## Formula

reverse = reverse * 10 + digit

---

## Common Mistakes

- Forgetting to multiply by 10
- Writing reverse = reverse + digit
- Forgetting to remove the last digit

---

## Edge Cases

Input: 0
Output: 0

Input: 1000
Output: 1

Input: 1203
Output: 3021

---

## Interview Tip

Whenever you need to append a digit to a number, multiply the current number by 10 before adding the new digit.

---

# Related Problems

LeetCode

- Reverse Integer (We'll solve later with overflow handling.)

HackerRank

- No direct beginner equivalent.