# PB047 - Count Words in a String

## Status

### Module

Module 05 - Strings

### Problem ID

PB047

### Difficulty

⭐⭐

### Pattern

Word Boundary Detection

### Platform

Custom

---

# Learning Objectives

- String Traversal
- Character Comparison
- Word Boundary Detection

---

# Problem Statement

Read a sentence from the user and print the number of words.

Example

Input

Hello World Java

Output

3

---

# Input Format

One line containing a sentence.

---

# Output Format

Print the number of words.

---

# Algorithm

1. Read the string.
2. Initialize `count = 0`.
3. Traverse each character.
4. If the current character is not a space and:
   - it is the first character, or
   - the previous character is a space,
   increment the word count.
5. Print the count.

---

# Dry Run

Input

Hello World Java

Word Starts

Hello ✅

World ✅

Java ✅

Output

3

---

# Complexity Analysis

## Time Complexity

O(N)

Reason

Each character is visited exactly once.

---

## Space Complexity

O(1)

Reason

Only one counter is used.

---

# Concepts Learned

- String Traversal
- Word Boundary Detection
- Character Comparison

---

# Common Mistakes

- Accessing `charAt(i - 1)` when `i = 0`.
- Counting every space.
- Using `split()` when not allowed.
- Failing to handle multiple consecutive spaces.

---

# Interview Tip

A word starts when:

- Current character is not a space.
- AND it is either the first character or the previous character is a space.

---

# Related Problems

- PB044 - Reverse String
- PB046 - Count Vowels & Consonants
- PB048 - Count Character Frequency