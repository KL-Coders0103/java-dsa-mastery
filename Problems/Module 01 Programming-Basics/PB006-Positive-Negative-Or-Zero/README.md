# PB006 - Positive, Negative or Zero

# Status

## Module
Programming Fundamentals

## Problem ID
PB006

## Difficulty
⭐ Easy

## Pattern
Decision Making

## Topic
if-else, Comparison Operators

## Estimated Time
10 Minutes

## Platform
Custom

## Related HackerRank
Java If-Else

---

# Learning Objectives

After completing this problem you should understand:

- Positive numbers
- Negative numbers
- Zero
- Multiple conditions
- Order of conditions

---

# Prerequisites

PB001

PB002

PB004

PB005

---

# Problem Statement

Given an integer N,

Print

Positive

if N is greater than zero.

Print

Negative

if N is less than zero.

Otherwise print

Zero

---

# Input Format

One integer N.

---

# Output Format

Print

Positive

OR

Negative

OR

Zero

---

# Constraints

-10^9 <= N <= 10^9

---

# Example 1

Input

25

Output

Positive

---

# Example 2

Input

-14

Output

Negative

---

# Example 3

Input

0

Output

Zero

---

# Problem Analysis

## Input

One integer

## Output

One word

Positive

Negative

or

Zero

---

# Thinking Questions

1. How many possible outputs exist?
3 possible output:- Positive, Negative or Zero

2. Which comparison operators will you use?
Greater than

3. Why is zero treated separately?
because number maybe be zero as well

4. Which condition should be checked first?
greater than

5. Do we need loops?
no

---

# Algorithm

Step 1

Read the integer N.

Step 2

If N > 0

Print "Positive"

Step 3

Else if N < 0

Print "Negative"

Step 4

Else

Print "Zero"

Step 5

End

---

# Dry Run

## Example 1

Input

N = 25

Step 1

25 > 0

True

Print

Positive

---

## Example 2

Input

N = -12

Step 1

-12 > 0

False

Step 2

-12 < 0

True

Print

Negative

---

## Example 3

Input

N = 0

Step 1

0 > 0

False

Step 2

0 < 0

False

Else executes

Print

Zero

---

# Complexity

## Time Complexity

O(1)

Reason

Constant number of comparisons.

---

## Space Complexity

O(1)

Reason

Uses only one variable.

---

# Notes

## Concepts Learned

- Comparison Operators
- if-else if
- Zero Handling
- Decision Making

---

## Pattern

Decision Making

---

## Common Mistakes

- Considering 0 as Positive
- Using >= instead of >
- Forgetting the Zero case

---

## Edge Cases

0

1

-1

100

-100

---

## Interview Tip

Always remember:

Positive → Greater than 0

Negative → Less than 0

Zero → Neither Positive nor Negative

---

# Interview Insight

This is one of the first problems where the order of conditions matters. Think about whether checking equality first or last makes your logic cleaner.