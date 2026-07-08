# PB027 - Floyd's Triangle

## Status

### Module
Module 03 - Pattern Printing

### Problem ID
PB027

### Difficulty
⭐⭐⭐

### Pattern
Nested Loops + Running Counter

### Platform
Custom

---

# Pattern Recognition

Use this pattern when:

- Running Counter
- Sequential Number Printing
- Matrix Filling
- Simulation Problems

---

# Learning Objectives

After solving this problem you should understand:

- Nested Loops
- Running Counter
- Number Continuation
- Sequential Printing

---

# Problem Statement

Given an integer N,

print Floyd's Triangle.

Example

Input

5

Output

1
2 3
4 5 6
7 8 9 10
11 12 13 14 15

---

# Input Format

One integer N.

---

# Output Format

Print Floyd's Triangle.

---

# Constraints

1 <= N <= 100

---

# Algorithm

Step 1

Read the integer N.

Step 2

Initialize a counter with value 1.

Step 3

Repeat for each row.

Step 4

Print the counter for each column.

Step 5

Increment the counter after printing.

Step 6

Move to the next line.

---

# Dry Run

Input

4

Counter = 1

| Row | Output | Counter After Row |
|-----|--------|-------------------|
|1|1|2|
|2|2 3|4|
|3|4 5 6|7|
|4|7 8 9 10|11|

Output

1
2 3
4 5 6
7 8 9 10

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

Only one extra variable (counter) is used.

---

# Notes

## Concepts Learned

- Nested Loops
- Running Counter
- Sequential Number Printing
- Variable Persistence

---

## Pattern

Outer Loop

↓

Rows

↓

Inner Loop

↓

Print Counter

↓

Counter++

---

## Common Mistakes

- Resetting the counter inside the outer loop.
- Incrementing the counter before printing.
- Printing the row or column number instead of the counter.

---

## Edge Cases

N = 1

1

---

N = 2

1
2 3

---

N = 5

1
2 3
4 5 6
7 8 9 10
11 12 13 14 15

---

## Interview Tip

Whenever numbers must continue across rows, use a single running counter declared outside the loops.

---

# Related Problems

- PB026 - Number Triangle Pattern
- PB028 - Pyramid Pattern
- Matrix Filling Problems