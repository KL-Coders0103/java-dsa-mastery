# PB013 - Count Digits

# Status

## Module
Module 02 - Number Manipulation

## Problem ID
PB013

## Difficulty
⭐⭐ Easy

## Pattern
Digit Extraction

## Topic
Loops, Integer Division, Modulus

## Estimated Time
20 Minutes

## Platform
Custom

---

# Pattern Recognition

Use this pattern when:

- Processing digits one by one
- Counting digits
- Reversing numbers
- Summing digits
- Checking palindromes

---

# Learning Objectives

After solving this problem you should understand:

- Digit Extraction
- Modulus Operator (%)
- Integer Division (/)
- Loop until a number becomes zero

---

# Problem Statement

Given an integer N,

count the total number of digits present in the number.

---

# Input Format

One integer N

---

# Output Format

Print the total number of digits.

---

# Constraints

0 <= N <= 2,147,483,647

---

# Example 1

Input

5387

Output

4

---

# Example 2

Input

7

Output

1

---

# Example 3

Input

10025

Output

5

---

# Thinking Questions

1. How can we get the last digit?
using modulus operator

2. How can we remove the last digit?
using divison operator

3. When should the loop stop?
When there is no number left or condition becomes false i.e number less than zero

4. How do we count each digit?
for every last digit we get there we increment count by 1.

---

# Algorithm

Step 1

Read the integer N.

Step 2

If N is 0, print 1 and stop.

Step 3

Initialize count = 0.

Step 4

While N > 0:

- Extract last digit using N % 10.
- Remove last digit using N / 10.
- Increment count.

Step 5

Print count.

---

# Dry Run

Input

5387

| Iteration | Number Before | Last Digit | Number After | Count |
|-----------:|--------------:|-----------:|-------------:|------:|
|1|5387|7|538|1|
|2|538|8|53|2|
|3|53|3|5|3|
|4|5|5|0|4|

Output

4

---

# Complexity Analysis

## Time Complexity

O(D)

Reason

The loop executes once for each digit.

Where D = Number of Digits.

---

## Space Complexity

O(1)

Reason

Only a few integer variables are used.

---

# Notes

## Concepts Learned

- while Loop
- Digit Extraction
- Modulus Operator (%)
- Integer Division (/)

---

## Pattern

Digit Extraction

---

## Common Mistakes

- Forgetting the edge case N = 0.
- Using String conversion.
- Forgetting to divide the number by 10.

---

## Edge Cases

N = 0 → 1 digit

N = 7 → 1 digit

N = 1000 → 4 digits

N = 99999 → 5 digits

---

## Interview Tip

Whenever a problem involves processing each digit of a number, think:

1. Extract the last digit.
2. Process it.
3. Remove it.
4. Repeat.

---

# Related Problems

HackerRank

- Find Digits (We'll solve later)

LeetCode

- Palindrome Number (Later)