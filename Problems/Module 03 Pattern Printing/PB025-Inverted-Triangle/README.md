# PB025 - Inverted Right Triangle Pattern

## Status

### Module
Module 03 - Pattern Printing

### Problem ID
PB025

### Difficulty
⭐⭐

### Pattern
Nested Loops + Row Shrinking

### Topic
for Loop

### Estimated Time
20-25 Minutes

### Platform
Custom

---

# Pattern Recognition

Use this pattern when:

- Inverted Triangle
- Reverse Growth
- Shrinking Patterns
- Upper Half of Diamond

---

# Learning Objectives

After solving this problem you should understand:

- Nested Loops
- Row Shrinking
- Variable Inner Loop
- Reverse Pattern Printing

---

# Problem Statement

Given an integer N,

print the following inverted right triangle.

Example

Input

5

Output

* * * * *
* * * *
* * *
* *
*

---

# Input Format

One integer N.

---

# Output Format

Print the inverted right triangle.

---

# Constraints

1 <= N <= 100

---

# Example 1

Input

5

Output

* * * * *
* * * *
* * *
* *
*

---

# Example 2

Input

3

Output

* * *
* *
*

---

# Algorithm

Step 1

Read the integer N.

Step 2

Repeat for each row.

Step 3

For every row,

print stars equal to

(N - Current Row).

Step 4

Move to the next line.

Step 5

Repeat until all rows are completed.

---

# Dry Run

Input

4

| Row | Stars Printed |
|-----|---------------|
|1|* * * *|
|2|* * *|
|3|* *|
|4|*|

Output

* * * *
* * *
* *
*

---

# Complexity Analysis

## Time Complexity

O(N²)

Reason

The outer loop runs N times.

The inner loop runs

N + (N-1) + (N-2) + ... + 1

=

N(N+1)/2

which simplifies to

O(N²)

---

## Space Complexity

O(1)

Reason

Only loop variables are used.

---

# Notes

## Concepts Learned

- Nested Loops
- Variable Inner Loop
- Reverse Pattern
- Row Shrinking

---

## Pattern

Outer Loop

↓

Rows

↓

Inner Loop

↓

Stars = N - Current Row

↓

Print

---

## Common Mistakes

- Using the growing pattern from PB024.
- Incorrect loop condition.
- Forgetting to print a new line.
- Using <= instead of < with zero-based indexing.

---

## Edge Cases

N = 1

*

---

N = 2

* *
*

---

N = 5

* * * * *
* * * *
* * *
* *
*

---

## Interview Tip

An inverted triangle is simply the reverse of a growing triangle.

Remember:

Growing Triangle

Stars = Row Number

↓

Inverted Triangle

Stars = N - Row

This idea is reused while building pyramids and diamonds.

---

# Related Problems

- PB022 - Square Pattern
- PB023 - Hollow Square Pattern
- PB024 - Right Triangle Pattern
- PB028 - Pyramid Pattern
- PB029 - Inverted Pyramid Pattern