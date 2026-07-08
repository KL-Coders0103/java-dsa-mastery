# PB028 - Pyramid Pattern

## Status

### Module
Module 03 - Pattern Printing

### Problem ID
PB028

### Difficulty
⭐⭐⭐⭐

### Pattern
Nested Loops + Leading Spaces + Row Growth

### Platform
Custom

---

# Learning Objectives

- Nested Loops
- Leading Spaces
- Row Growth
- Multiple Inner Loops

---

# Problem Statement

Given an integer N,

print the following pyramid.

Example

Input

5

Output

    *
   * *
  * * *
 * * * *
* * * * *

---

# Input Format

One integer N.

---

# Output Format

Print the pyramid.

---

# Constraints

1 <= N <= 100

---

# Algorithm

Step 1

Read the integer N.

Step 2

Repeat for each row.

Step 3

Print (N - Row - 1) spaces.

Step 4

Print (Row + 1) stars.

Step 5

Move to the next line.

---

# Dry Run

Input

5

| Row | Spaces | Stars |
|-----|--------|-------|
|1|4|1|
|2|3|2|
|3|2|3|
|4|1|4|
|5|0|5|

Output

    *
   * *
  * * *
 * * * *
* * * * *

---

# Complexity Analysis

## Time Complexity

O(N²)

Reason

Each row prints spaces and stars.

Overall operations are proportional to N².

---

## Space Complexity

O(1)

Reason

Only loop variables are used.

---

# Notes

## Concepts Learned

- Nested Loops
- Leading Spaces
- Row Growth
- Multiple Inner Loops

---

## Pattern

Outer Loop

↓

Rows

↓

Leading Spaces

↓

Stars

↓

Next Line

---

## Common Mistakes

- Printing the same number of spaces in every row.
- Forgetting to decrease spaces.
- Forgetting to move to the next line.
- Mixing the formulas for spaces and stars.

---

## Edge Cases

N = 1

*

---

N = 2

 *
* *

---

N = 5

    *
   * *
  * * *
 * * * *
* * * * *

---

## Interview Tip

Every center-aligned pattern can be broken into:

Leading Spaces

+

Visible Characters

Master this concept and Diamonds become much easier.

---

# Related Problems

- PB024 - Right Triangle
- PB025 - Inverted Right Triangle
- PB029 - Inverted Pyramid
- PB030 - Diamond Pattern