# PB026 - Number Triangle Pattern

## Status

### Module
Module 03 - Pattern Printing

### Problem ID
PB026

### Difficulty
⭐⭐

### Pattern
Nested Loops + Row Growth + Number Printing

### Platform
Custom

---

# Pattern Recognition

Use this pattern when:

- Number Triangle
- Row Growth
- Column-Based Printing
- Number Patterns

---

# Learning Objectives

After solving this problem you should understand:

- Nested Loops
- Variable Inner Loop
- Printing Numbers
- Relationship between Row and Column

---

# Problem Statement

Given an integer N,

print the following number triangle.

Example

Input

5

Output

1
1 2
1 2 3
1 2 3 4
1 2 3 4 5

---

# Input Format

One integer N.

---

# Output Format

Print the number triangle.

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

Print numbers from 1 to the current row.

Step 4

Move to the next line.

Step 5

Repeat until all rows are completed.

---

# Dry Run

Input

4

| Row | Output |
|-----|--------|
|1|1|
|2|1 2|
|3|1 2 3|
|4|1 2 3 4|

Output

1
1 2
1 2 3
1 2 3 4

---

# Complexity Analysis

## Time Complexity

O(N²)

Reason

The outer loop runs N times.

The inner loop runs:

1 + 2 + 3 + ... + N

= N(N+1)/2

Overall

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
- Number Printing
- Row Growth

---

## Pattern

Outer Loop → Rows

↓

Inner Loop → Numbers

↓

Print Current Column Value

---

## Common Mistakes

- Starting the number from 0 instead of 1.
- Printing the row number instead of the column number.
- Forgetting to move to the next line.

---

## Edge Cases

N = 1

1

---

N = 2

1
1 2

---

N = 5

1
1 2
1 2 3
1 2 3 4
1 2 3 4 5

---

## Interview Tip

Whenever the pattern is:

1
1 2
1 2 3

the printed value is usually the **current column number**.

---

# Related Problems

- PB024 - Right Triangle Pattern
- PB025 - Inverted Right Triangle Pattern
- PB027 - Floyd's Triangle