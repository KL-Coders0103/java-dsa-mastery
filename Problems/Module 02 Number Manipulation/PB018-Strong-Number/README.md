# PB018 - Strong Number

# Status

## Module
Module 02 - Number Manipulation

## Problem ID
PB018

## Difficulty
⭐⭐⭐

## Pattern
Digit Extraction + Factorial + Accumulation

## Estimated Time
35 Minutes

## Platform
Custom

---

# Pattern Recognition

Use this pattern when:

- Process every digit
- Apply an operation on each digit
- Sum the results
- Compare with original number

---

# Learning Objectives

After solving this problem you should understand:

- Combining multiple patterns
- Reusing previous solutions
- Nested loops

---

# Problem Statement

Given an integer N,

determine whether it is a Strong Number.

Print

Strong Number

or

Not Strong Number

---

# Definition

A Strong Number is a number whose sum of the factorials of its digits equals the number itself.

Example

145

1! + 4! + 5!

=

1 + 24 + 120

=

145

So,

145 is a Strong Number.

---

# Input Format

One integer N

---

# Output Format

Strong Number

OR

Not Strong Number

---

# Examples

Input

145

Output

Strong Number

---

Input

123

Output

Not Strong Number

---

# Thinking Questions

1. How do we extract each digit?
using modulus operator

2. How do we calculate the factorial of one digit?
using for loop and multiplying the number with the below following integer

3. Where do we store the sum?
in sum variable

4. What do we compare at the end?
original number with sum of factorial of all number

---

# Algorithm

Step 1

Read the integer N.

Step 2

Store the original number.

Step 3

Initialize sum = 0.

Step 4

While N > 0

- Extract the last digit.
- Initialize factorial = 1.
- Calculate the factorial of the digit.
- Add the factorial to sum.
- Remove the last digit.

Step 5

Compare sum with the original number.

If equal

Print "Strong Number"

Else

Print "Not a Strong Number".

---

# Dry Run

Input

145

| Iteration | Digit | Factorial | Sum |
|-----------|------:|----------:|----:|
|1|5|120|120|
|2|4|24|144|
|3|1|1|145|

Original = 145

Sum = 145

Output

Strong Number

---

# Complexity Analysis

Time Complexity

O(D × 9)

Reason

There are D digits, and each digit's factorial is calculated in at most 9 multiplications.

Since 9 is a constant,

Time Complexity = O(D)

---

Space Complexity

O(1)

Reason

Only a fixed number of integer variables are used.

---

# Notes

## Concepts Learned

- Nested Loops
- Digit Extraction
- Factorial Calculation
- Accumulation
- Comparison

---

## Pattern

Digit Extraction + Nested Loop

---

## Common Mistakes

- Forgetting to reset factorial for every digit.
- Forgetting to store the original number.
- Adding the digit instead of its factorial.

---

## Edge Cases

1 → Strong Number

2 → Strong Number

145 → Strong Number

123 → Not Strong Number

40585 → Strong Number

---

## Interview Tip

Whenever every digit requires its own calculation (factorial, square, cube, etc.), expect to use a nested loop or a helper function.