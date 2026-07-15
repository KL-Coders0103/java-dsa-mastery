# PB045 - Palindrome String

## Status

### Module

Module 05 - Strings

### Problem ID

PB045

### Difficulty

⭐⭐

### Pattern

Two Pointer + Character Comparison

### Platform

Custom

---

# Learning Objectives

- Two Pointer Technique
- Character Comparison
- String Traversal
- charAt()

---

# Problem Statement

Read a string from the user.

Print "Palindrome" if the string reads the same forward and backward.

Otherwise print "Not Palindrome".

Example

Input

madam

Output

Palindrome

---

# Input Format

One line containing a string.

---

# Output Format

Print

Palindrome

or

Not Palindrome

---

# Constraints

Length <= 100

---

# Algorithm

1. Read the string.
2. Initialize `left = 0` and `right = length - 1`.
3. While `left < right`:
   - Compare `str.charAt(left)` and `str.charAt(right)`.
   - If different, print "Not Palindrome".
   - Otherwise move both pointers inward.
4. If all comparisons match, print "Palindrome".

---

# Dry Run

Input

level

Comparisons

l == l ✅

e == e ✅

Output

Palindrome

---

# Complexity Analysis

## Time Complexity

O(N)

Reason

At most half the characters are compared.

---

## Space Complexity

O(1)

Reason

Only a few variables are used.

---

# Concepts Learned

- Two Pointer Technique
- Character Comparison
- String Traversal

---

# Common Mistakes

- Comparing indexes instead of characters.
- Using `length()` as the last index.
- Forgetting to move both pointers.
- Reversing the string unnecessarily.

---

# Interview Tip

For palindrome problems, prefer the Two Pointer approach instead of reversing the string. It is more efficient and uses constant extra space.

---

# Related Problems

- PB016 - Palindrome Number
- PB037 - Reverse Array
- PB044 - Reverse String