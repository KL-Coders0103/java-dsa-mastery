# PB022 - Square Pattern

## Status

- Module: Module 03 - Pattern Printing
- Problem ID: PB022
- Difficulty: ⭐
- Pattern: Nested Loops
- Topic: for Loop
- Platform: Custom

---

## Learning Objectives

- Learn Nested Loops
- Understand Rows and Columns
- Print 2D Patterns

---

## Problem Statement

Given an integer N,

print a square pattern of stars.

Example

Input

4

Output

* * * *
* * * *
* * * *
* * * *

---

## Input Format

One integer N.

---

## Output Format

Print a square of stars.

---

## Constraints

1 <= N <= 100

---

# Algorithm

Step 1

Read the integer N.

Step 2

Repeat N times (Rows).

Step 3

Inside each row, repeat N times (Columns).

Step 4

Print "* " for every column.

Step 5

After completing one row, move to the next line.

Step 6

Repeat until all rows are printed.

---

# Dry Run

Input

3

| Row | Column | Output |
|-----|--------|--------|
|1|1|*|
|1|2|*|
|1|3|*|
|2|1|*|
|2|2|*|
|2|3|*|
|3|1|*|
|3|2|*|
|3|3|*|

Output

* * *
* * *
* * *

---

# Complexity Analysis

## Time Complexity

O(N²)

Reason

The outer loop runs N times.

For each iteration, the inner loop also runs N times.

Total operations = N × N.

---

## Space Complexity

O(1)

Reason

No extra data structures are used.

---

# Notes

## Concepts Learned

- Nested Loops
- Row and Column Traversal
- Pattern Printing

---

## Pattern

Outer Loop → Rows

↓

Inner Loop → Columns

---

## Common Mistakes

- Printing println() inside the inner loop.
- Forgetting the inner loop.
- Using print() instead of println() after each row.

---

## Edge Cases

N = 1

*

N = 2

* *
* *

---

## Interview Tip

In almost every pattern problem:

Outer Loop controls Rows.

Inner Loop controls Columns.

Remember this rule because the same idea is used in matrix traversal.