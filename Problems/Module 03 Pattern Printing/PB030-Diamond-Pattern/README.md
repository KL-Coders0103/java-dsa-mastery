# PB030 - Diamond Pattern

## Status

### Module
Module 03 - Pattern Printing

### Problem ID
PB030

### Difficulty
⭐⭐⭐⭐

### Pattern
Pyramid + Inverted Pyramid

### Platform
Custom

---

# Learning Objectives

- Combine Multiple Patterns
- Code Reusability
- Pattern Composition
- Nested Loops

---

# Problem Statement

Given an integer N,

print the following diamond pattern.

Example

Input

5

Output

    *
   * *
  * * *
 * * * *
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

Print the diamond.

---

# Constraints

1 <= N <= 100

---

# Algorithm

Step 1

Read N.

Step 2

Print the upper pyramid.

Step 3

Print the lower inverted pyramid.

Step 4

Finish.

---

# Dry Run

Input

4

Upper Half

| Row | Spaces | Stars |
|-----|--------|-------|
|1|3|1|
|2|2|2|
|3|1|3|
|4|0|4|

Lower Half

| Row | Spaces | Stars |
|-----|--------|-------|
|2|1|3|
|3|2|2|
|4|3|1|

Output

   *
  * *
 * * *
* * * *
 * * *
  * *
   *

---

# Complexity Analysis

## Time Complexity

O(N²)

Reason

Both halves together perform approximately

N² operations.

---

## Space Complexity

O(1)

Reason

Only loop variables are used.

---

# Notes

## Concepts Learned

- Pattern Composition
- Nested Loops
- Leading Spaces
- Symmetry

---

## Pattern

Upper Pyramid

↓

Lower Pyramid

↓

Diamond

---

## Common Mistakes

- Printing the middle row twice.
- Incorrect spaces in the lower half.
- Forgetting that the lower loop starts from row 1.

---

## Edge Cases

N = 1

*

---

N = 2

 *
* *
 *

---

N = 5

    *
   * *
  * * *
 * * * *
* * * * *
 * * * *
  * * *
   * *
    *

---

## Interview Tip

Whenever a complex pattern appears,

ask yourself:

"Can I build it by combining smaller patterns?"

Most of the time,

the answer is yes.

---

# Related Problems

- PB028 - Pyramid Pattern
- PB029 - Inverted Pyramid Pattern
- PB031 - Butterfly Pattern