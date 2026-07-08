# PB029 - Inverted Pyramid Pattern

## Status

### Module
Module 03 - Pattern Printing

### Problem ID
PB029

### Difficulty
⭐⭐⭐

### Pattern
Nested Loops + Leading Spaces + Row Shrinking

### Platform
Custom

---

# Pattern Recognition

Use this pattern when:

- Inverted Pyramid
- Reverse Pyramid
- Diamond (Lower Half)
- Center-Aligned Patterns

---

# Learning Objectives

After solving this problem you should understand:

- Nested Loops
- Leading Spaces
- Row Shrinking
- Reverse Pattern Printing

---

# Problem Statement

Given an integer N,

print the following inverted pyramid.

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

Print the inverted pyramid.

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

Print spaces equal to the current row number.

Step 4

Print stars equal to (N - Row).

Step 5

Move to the next line.

---

# Dry Run

Input

4

| Row | Spaces | Stars |
|-----|--------|-------|
|1|0|4|
|2|1|3|
|3|2|2|
|4|3|1|

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

Each row prints spaces and stars.

Overall complexity is O(N²).

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
- Row Shrinking
- Reverse Pyramid

---

## Pattern

Outer Loop

↓

Rows

↓

Leading Spaces

↓

Shrinking Stars

↓

Next Line

---

## Common Mistakes

- Printing stars before spaces.
- Off-by-one errors in the spaces loop.
- Forgetting to decrease the number of stars.

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

An inverted pyramid is the mirror of a pyramid.

Pyramid:

- Spaces ↓
- Stars ↑

Inverted Pyramid:

- Spaces ↑
- Stars ↓

---

# Related Problems

- PB024 - Right Triangle Pattern
- PB025 - Inverted Right Triangle Pattern
- PB028 - Pyramid Pattern
- PB030 - Diamond Pattern