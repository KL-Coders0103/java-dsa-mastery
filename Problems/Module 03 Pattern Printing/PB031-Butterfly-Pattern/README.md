# PB031 - Butterfly Pattern

## Status

### Module

Module 03 - Pattern Printing

### Problem ID

PB031

### Difficulty

⭐⭐⭐⭐⭐

### Pattern

Symmetry + Multiple Inner Loops

### Platform

Custom

---

# Learning Objectives

- Symmetry
- Pattern Composition
- Multiple Inner Loops
- Breaking Complex Problems

---

# Problem Statement

Given an integer N,

print the following butterfly pattern.

Example

Input

5

Output

*                 *
* *             * *
* * *         * * *
* * * *     * * * *
* * * * * * * * * *
* * * *     * * * *
* * *         * * *
* *             * *
*                 *

---

# Input Format

One integer N.

---

# Output Format

Print the butterfly pattern.

---

# Constraints

1 <= N <= 100

---

# Algorithm

Step 1

Print the upper half.

For each row:

- Left stars
- Gap
- Right stars

Step 2

Print the lower half.

Repeat the same logic in reverse.

---

# Complexity Analysis

## Time Complexity

O(N²)

Reason

Each row prints stars and spaces.

Overall complexity remains O(N²).

---

## Space Complexity

O(1)

Only loop variables are used.

---

# Notes

## Concepts Learned

- Symmetry
- Pattern Composition
- Multiple Inner Loops
- Gap Management

---

## Common Mistakes

- Incorrect gap calculation.
- Printing the middle row twice.
- Wrong order of stars and spaces.

---

## Interview Tip

Complex patterns are usually combinations of smaller patterns.

Always try to break them into reusable pieces.

---

# Related Problems

- PB028 - Pyramid
- PB029 - Inverted Pyramid
- PB030 - Diamond