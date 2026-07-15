# PB049 - Toggle Case

## Status

### Module

Module 05 - Strings

### Problem ID

PB049

### Difficulty

⭐⭐

### Pattern

Character Manipulation

### Platform

Custom

---

# Learning Objectives

- Character Manipulation
- ASCII Character Ranges
- String Traversal

---

# Problem Statement

Read a string.

Convert every uppercase letter to lowercase.

Convert every lowercase letter to uppercase.

Leave digits, spaces and symbols unchanged.

Example

Input

Hello World 123

Output

hELLO wORLD 123

---

# Algorithm

1. Read the string.
2. Traverse each character.
3. If uppercase:
   - Convert to lowercase.
4. Else if lowercase:
   - Convert to uppercase.
5. Else:
   - Print unchanged.

---

# Complexity Analysis

## Time Complexity

O(N)

Reason

Each character is processed exactly once.

---

## Space Complexity

O(1)

Reason

No extra data structures are used.

---

# Concepts Learned

- Character Manipulation
- Character.toLowerCase()
- Character.toUpperCase()
- ASCII Character Ranges

---

# Interview Tip

Avoid converting the whole string inside a loop. Convert only the current character for better efficiency.

---

# Related Problems

- PB046 - Count Vowels & Consonants
- PB048 - Character Frequency
- PB050 - Remove Spaces