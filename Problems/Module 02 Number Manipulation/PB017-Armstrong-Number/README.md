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