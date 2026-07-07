# PB016 - Palindrome Number

# Status

## Module
Module 02 - Number Manipulation

## Problem ID
PB016

## Difficulty
⭐⭐ Easy

## Pattern
Reverse Number + Comparison

## Topic
Digit Extraction

## Estimated Time
20-25 Minutes

## Platform
Custom

---

# Pattern Recognition

Use this pattern when:

- Reverse and Compare
- Palindrome Number
- Mirror Numbers

---

# Learning Objectives

After solving this problem you should understand:

- Reverse Number Pattern
- Preserving Original Data
- Comparison Logic

---

# Problem Statement

Given an integer N,

determine whether the given number is a Palindrome Number.

Print

Palindrome

or

Not Palindrome

---

# Definition

A palindrome number remains the same when its digits are reversed.

Examples

121

1221

1331

12321

---

# Input Format

One integer N

---

# Output Format

Palindrome

OR

Not Palindrome

---

# Constraints

0 <= N <= 2,147,483,647

---

# Example 1

Input

121

Output

Palindrome

---

# Example 2

Input

123

Output

Not Palindrome

---

# Example 3

Input

1001

Output

Palindrome

---

# Thinking Questions

1. What pattern did we learn in PB015?
Digit Extraction + Number Construction

2. What happens to num after the while loop?
num will become 0

3. Can we compare num with reverse directly?
no we have to store the value in another variable

4. What extra variable do we need?
original

---

# Algorithm

Step 1

Read the integer N.

Step 2

Store the original number.

Step 3

Initialize

reverse = 0

Step 4

While N > 0

- Extract last digit
- Build reversed number
- Remove last digit

Step 5

Compare original and reverse.

If equal

Print "Palindrome"

Otherwise

Print "Not a Palindrome".

---

# Dry Run

Input

121

| Iteration | Number Before | Digit | Reverse Before | Reverse After | Number After |
|-----------:|--------------:|------:|---------------:|--------------:|-------------:|
|1|121|1|0|1|12|
|2|12|2|1|12|1|
|3|1|1|12|121|0|

Original = 121

Reverse = 121

Output

Palindrome

---

# Complexity Analysis

## Time Complexity

O(D)

Reason

The loop executes once for each digit.

---

## Space Complexity

O(1)

Reason

Only a few integer variables are used.

---

# Notes

## Concepts Learned

- Reverse Number Pattern
- Preserving Original Data
- Comparison Logic
- Digit Extraction

---

## Pattern

Reverse + Compare

---

## Common Mistakes

- Forgetting to store the original number.
- Comparing num with reverse after the loop.
- Forgetting that num becomes 0 after digit extraction.

---

## Edge Cases

121 → Palindrome

123 → Not a Palindrome

0 → Palindrome

7 → Palindrome

1001 → Palindrome

---

## Interview Tip

Whenever you need to compare a processed value with the original input, store the original value before modifying it.

---

# Related Problems

LeetCode

- Palindrome Number (We'll solve the optimized version later.)