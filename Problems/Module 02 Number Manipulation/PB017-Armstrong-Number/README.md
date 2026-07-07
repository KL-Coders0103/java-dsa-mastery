# PB017 - Armstrong Number

# Status

## Module
Module 02 - Number Manipulation

## Problem ID
PB017

## Difficulty
⭐⭐⭐

## Pattern
Digit Extraction + Power Calculation + Accumulation

## Topic
while Loop, Nested Loop

## Estimated Time
35-45 Minutes

## Platform
Custom

---

# Pattern Recognition

Use this pattern when:

- Digit Power Problems
- Armstrong Number
- Narcissistic Number
- Per-Digit Calculations

---

# Learning Objectives

After solving this problem you should understand:

- Count Digits
- Digit Extraction
- Calculating powers without Math.pow()
- Combining multiple patterns

---

# Problem Statement

Given an integer N,

determine whether it is an Armstrong Number.

Print

Armstrong Number

or

Not an Armstrong Number

---

# Definition

An Armstrong Number is a number that is equal to the sum of each digit raised to the power of the total number of digits.

Example

153

Digits = 3

1³ + 5³ + 3³

=

1 + 125 + 27

=

153

Therefore

153 is an Armstrong Number.

---

# Input Format

One integer N

---

# Output Format

Armstrong Number

OR

Not an Armstrong Number

---

# Constraints

0 <= N <= 2,147,483,647

---

# Example 1

Input

153

Output

Armstrong Number

---

# Example 2

Input

370

Output

Armstrong Number

---

# Example 3

Input

123

Output

Not an Armstrong Number

---

# Thinking Questions

1. How do we count the digits?
using increment variable after extraction of digit

2. How do we extract one digit?
using modulus operator

3. How do we calculate digit^count?
by multiplying the digit with itself 3 times

4. Where do we store the total?
in sum variable

5. What do we compare at the end?
original with sum

---

# Algorithm

Step 1

Read the integer N.

Step 2

Store the original number.

Step 3

Count the total number of digits.

Step 4

Reset the temporary variable to the original number.

Step 5

While the number is greater than zero

- Extract the last digit.
- Initialize power = 1.
- Calculate digit^count using a loop.
- Add the calculated power to sum.
- Remove the last digit.

Step 6

Compare sum with the original number.

If equal

Print "Armstrong Number"

Else

Print "Not an Armstrong Number"

---

# Dry Run

Input

153

Digits = 3

| Iteration | Number Before | Digit | Power Calculation | Sum | Number After |
|-----------|--------------:|------:|------------------:|----:|-------------:|
|1|153|3|3³ = 27|27|15|
|2|15|5|5³ = 125|152|1|
|3|1|1|1³ = 1|153|0|

Original = 153

Sum = 153

Output

Armstrong Number

---

# Complexity Analysis

## Time Complexity

O(D²)

Reason

- First loop counts digits → O(D)
- Second loop processes every digit → O(D)
- Inner loop calculates digit^count → O(D)

Overall

O(D²)

Where D = Number of Digits.

---

## Space Complexity

O(1)

Reason

Only a fixed number of integer variables are used.

---

# Notes

## Concepts Learned

- Counting Digits
- Digit Extraction
- Power Calculation
- Nested Loops
- Accumulation
- Comparison

---

## Pattern

Count Digits

↓

Digit Extraction

↓

Calculate digit^count

↓

Accumulate

↓

Compare

---

## Formula

For every digit

power = digit^count

sum = sum + power

---

## Common Mistakes

- Assuming every Armstrong Number uses cube (³).
- Forgetting to count the number of digits first.
- Using digit × count instead of digit^count.
- Forgetting to reset the power variable for every digit.
- Forgetting to remove the last digit.

---

## Edge Cases

0 → Armstrong Number

1 → Armstrong Number

153 → Armstrong Number

370 → Armstrong Number

371 → Armstrong Number

407 → Armstrong Number

9474 → Armstrong Number

123 → Not an Armstrong Number

---

## Interview Tip

Do not hardcode cubes like

digit × digit × digit

Always calculate

digit^(number of digits)

Otherwise your program will fail for 4-digit, 5-digit, and larger Armstrong Numbers.

---

# Related Problems

- Strong Number
- Sum of Digits
- Count Digits
- Reverse Number
- LeetCode: Armstrong Number (similar variations)