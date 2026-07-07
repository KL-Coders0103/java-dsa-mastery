# PB023 - Hollow Square Pattern

## Status

- Module: Module 03 - Pattern Printing
- Problem ID: PB023
- Difficulty: ⭐⭐
- Pattern: Boundary Conditions
- Platform: Custom

---

## Learning Objectives

- Nested Loops
- Boundary Checking
- if-else inside loops
- Matrix Thinking

---

## Problem Statement

Given an integer N,

print a hollow square pattern.

Example

Input

5

Output

* * * * *
*       *
*       *
*       *
* * * * *

---

## Input Format

One integer N.

---

## Output Format

Print the hollow square.

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

Repeat for each column.

Step 4

If the current position is on the boundary

- First Row
- Last Row
- First Column
- Last Column

Print "* "

Else

Print spaces.

Step 5

Move to the next line after completing each row.

---

# Dry Run

Input

4

| Row | Column | Boundary? | Output |
|-----|--------|-----------|--------|
|0|0|Yes|*|
|0|1|Yes|*|
|0|2|Yes|*|
|0|3|Yes|*|
|1|0|Yes|*|
|1|1|No|Space|
|1|2|No|Space|
|1|3|Yes|*|

Output

* * * *
*     *
*     *
* * * *

---

# Complexity Analysis

## Time Complexity

O(N²)

Reason

The outer loop runs N times.

For each row, the inner loop also runs N times.

---

## Space Complexity

O(1)

Reason

Only loop variables are used.

---

# Notes

## Concepts Learned

- Nested Loops
- Boundary Conditions
- Row and Column Traversal
- Matrix Thinking

---

## Pattern

Outer Loop → Rows

↓

Inner Loop → Columns

↓

Boundary Check

↓

Print

---

## Common Mistakes

- Using && instead of ||.
- Forgetting one of the four boundaries.
- Printing println() inside the inner loop.
- Printing one space instead of two, causing alignment issues.

---

## Edge Cases

N = 1

*

N = 2

* *
* *

N = 5

* * * * *
*       *
*       *
*       *
* * * * *

---

## Interview Tip

Many matrix problems use the same idea:

"If the current cell lies on the boundary, perform one action; otherwise, perform another."