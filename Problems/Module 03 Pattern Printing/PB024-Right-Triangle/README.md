# PB024 - Right Triangle Pattern

## Status

- Module: Module 03 - Pattern Printing
- Problem ID: PB024
- Difficulty: ⭐
- Pattern: Row Growth
- Platform: Custom

---

## Learning Objectives

- Variable Inner Loop
- Nested Loops
- Row Growth
- Pattern Observation

---

## Problem Statement

Given an integer N,

print the following right triangle pattern.

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

## Input Format

One integer N.

---

## Output Format

Print the right triangle.

---

## Constraints

1 <= N <= 100

---

# Algorithm

Step 1

Read the integer N.

Step 2

Repeat for each row.

Step 3

For every row, print stars equal to the current row number.

Step 4

Move to the next line.

Step 5

Repeat until all rows are printed.

---

# Dry Run

Input

4

| Row | Stars Printed |
|-----|---------------|
|1|*|
|2|* *|
|3|* * *|
|4|* * * *|

Output

*
* *
* * *
* * * *

---

# Complexity Analysis

## Time Complexity

O(N²)

Reason

The outer loop runs N times.

The inner loop runs:

1 + 2 + 3 + ... + N

= N(N + 1) / 2

This simplifies to O(N²).

---

## Space Complexity

O(1)

Reason

No extra memory is used.

---

# Notes

## Concepts Learned

- Nested Loops
- Variable Inner Loop
- Row Growth
- Pattern Observation

---

## Pattern

Outer Loop → Rows

↓

Inner Loop → Current Row

↓

Print

---

## Common Mistakes

- Running the inner loop N times.
- Using j < i instead of j <= i (with zero-based indexing).
- Forgetting to move to the next line after each row.

---

## Edge Cases

N = 1

*

N = 2

*
* *

N = 5

*
* *
* * *
* * * *
* * * * *

---

## Interview Tip

Whenever a pattern grows from top to bottom, ask yourself:

"Can the inner loop depend on the current row?"