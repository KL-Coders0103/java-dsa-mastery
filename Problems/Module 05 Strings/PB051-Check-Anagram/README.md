# PB051 - Check Anagram

## Status

### Module

Module 05 - Strings

### Problem ID

PB051

### Difficulty

⭐⭐⭐

### Pattern

Character Frequency Comparison

### Platform

Custom

---

# Learning Objectives

- Character Frequency
- String Comparison
- Nested Traversal

---

# Problem Statement

Read two strings.

Print "Anagram" if both strings contain the same characters with the same frequencies.

Otherwise print "Not Anagram".

Ignore case.

Example

Input

listen
silent

Output

Anagram

---

# Algorithm

1. Read both strings.
2. Convert both strings to lowercase.
3. Compare their lengths.
4. If lengths are different, print "Not Anagram".
5. Create an empty string `alreadyAppeared`.
6. Traverse the first string.
7. If the current character has already been processed, skip it.
8. Count its frequency in both strings.
9. If frequencies differ, print "Not Anagram".
10. Otherwise continue.
11. If every frequency matches, print "Anagram".

---

# Dry Run

Input

listen

silent

Process

l -> 1 == 1 ✅

i -> 1 == 1 ✅

s -> 1 == 1 ✅

t -> 1 == 1 ✅

e -> 1 == 1 ✅

n -> 1 == 1 ✅

Output

Anagram

---

# Complexity Analysis

## Time Complexity

O(N²)

Reason

For every distinct character, both strings are traversed to count frequency.

---

## Space Complexity

O(N)

Reason

The `alreadyAppeared` string stores processed characters.

---

# Concepts Learned

- Character Frequency Comparison
- Nested Traversal
- Duplicate Detection
- Case-Insensitive Comparison
- String Traversal

---

# Common Mistakes

- Forgetting to compare string lengths first.
- Not converting both strings to lowercase.
- Processing duplicate characters multiple times.
- Using `== -1` instead of `!= -1` while checking processed characters.
- Forgetting to update the processed characters string.

---

# Interview Tip

The beginner solution uses nested loops.

Later, this problem can be optimized using:

- Frequency Arrays
- HashMap
- Sorting

which reduce the complexity to **O(N)** or **O(N log N)**.

---

# Related Problems

- PB045 - Palindrome String
- PB048 - Character Frequency
- PB049 - Toggle Case