# PB046 - Count Vowels & Consonants

## Status

### Module

Module 05 - Strings

### Problem ID

PB046

### Difficulty

⭐⭐

### Pattern

String Traversal + Multiple Accumulators

### Platform

Custom

---

# Learning Objectives

- String Traversal
- Character Processing
- Multiple Accumulators
- Decision Making

---

# Problem Statement

Read a string from the user.

Count the number of vowels and consonants.

Example

Input

Hello

Output

Vowels = 2

Consonants = 3

---

# Input Format

One line containing a string.

---

# Output Format

Print the number of vowels and consonants.

---

# Algorithm

1. Read the string.
2. Initialize vowel and consonant counters.
3. Traverse the string character by character.
4. Convert each character to lowercase.
5. If it is an alphabet:
   - If it is a vowel, increment vowel count.
   - Otherwise increment consonant count.
6. Print both counts.

---

# Dry Run

Input

Hello

Characters

H e l l o

Output

Vowels = 2

Consonants = 3

---

# Complexity Analysis

## Time Complexity

O(N)

Reason

Each character is visited once.

---

## Space Complexity

O(1)

Reason

Only a few variables are used.

---

# Concepts Learned

- Character Traversal
- Character Classification
- Multiple Accumulators
- Character.toLowerCase()

---

# Common Mistakes

- Counting spaces as consonants.
- Forgetting uppercase vowels.
- Using `toLowerCase()` on the whole string inside the loop.
- Ignoring digits and symbols.

---

# Interview Tip

Always verify whether a character is an alphabet before classifying it as a vowel or consonant.

---

# Related Problems

- PB039 - Count Even & Odd
- PB045 - Palindrome String
- PB047 - Count Words