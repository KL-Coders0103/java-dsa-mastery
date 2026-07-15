# PB048 - Count Frequency of Each Character

## Status

### Module

Module 05 - Strings

### Problem ID

PB048

### Difficulty

⭐⭐⭐

### Pattern

Nested Traversal + Frequency Counting

### Platform

Custom

---

# Learning Objectives

- String Traversal
- Nested Loops
- Frequency Counting
- Duplicate Handling

---

# Problem Statement

Read a string.

Print the frequency of every distinct alphabet character.

Ignore spaces.

Example

Input

hello

Output

h = 1
e = 1
l = 2
o = 1

---

# Algorithm

1. Read the string.
2. Convert to lowercase.
3. Traverse each character.
4. Ignore spaces.
5. If the character has not been processed:
   - Count its frequency using another loop.
   - Print the character and its frequency.
   - Mark it as processed.

---

# Complexity Analysis

## Time Complexity

O(N²)

Reason

Nested loops.

---

## Space Complexity

O(N)

Reason

The `alreadyAppeared` string stores distinct characters.

---

# Concepts Learned

- Nested Traversal
- Frequency Counting
- Duplicate Detection
- indexOf()

---

# Interview Tip

This is the beginner version of frequency counting.

Later you'll replace `alreadyAppeared` with a `HashSet` and replace the nested loop with a `HashMap` for an O(N) solution.