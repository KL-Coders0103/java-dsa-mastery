# PB007 - Leap Year

# Status

## Module
Programming Fundamentals

## Problem ID
PB007

## Difficulty
⭐⭐ Easy

## Pattern
Decision Making

## Topic
Nested if-else, Logical Operators

## Estimated Time
20 Minutes

## Platform
Custom

## Related Platform Problems

### HackerRank

No direct equivalent

### LeetCode

Concept Building

---

# Learning Objectives

After solving this problem, you will understand:

- Nested conditions
- Multiple decision making
- Logical AND (&&)
- Logical OR (||)
- Real-world conditions

---

# Problem Statement

Given a year, determine whether it is a Leap Year.

Print

Leap Year

or

Not a Leap Year

---

# Rules

A year is a Leap Year if:

1. It is divisible by 400

OR

2. It is divisible by 4 but NOT divisible by 100

---

# Input Format

One integer

Year

---

# Output Format

Leap Year

OR

Not a Leap Year

---

# Constraints

1 <= Year <= 9999

---

# Examples

## Example 1

Input

2000

Output

Leap Year

---

## Example 2

Input

1900

Output

Not a Leap Year

---

## Example 3

Input

2024

Output

Leap Year

---

## Example 4

Input

2023

Output

Not a Leap Year

---

# Thinking Questions

1. Which operator checks divisibility?
Modulus Operator (%)

2. Why isn't every year divisible by 4 a leap year?
because there might be a possiblity of that particular year divisible by 100 and if it is divisibl by 100 then it is not a leap year

3. What is special about years divisible by 400?
because it is definetly a leap year.

4. Which logical operators will you use?
&& and || operator

5. Can this problem be solved using a single if statement?
yes

---

# Algorithm

Step 1

Read the year.

Step 2

If the year is divisible by 400

Print "Leap Year".

Step 3

Otherwise, check if the year is divisible by 4.

If yes, check if it is divisible by 100.

- If divisible by 100 → Print "Not a Leap Year".
- Otherwise → Print "Leap Year".

Step 4

If the year is not divisible by 4

Print "Not a Leap Year".

Step 5

End.

---

# Dry Run

### Input

2024

Step 1

2024 % 400 = 24 → False

Step 2

2024 % 4 = 0 → True

Step 3

2024 % 100 = 24 → False

Output

Leap Year

---

# Complexity

Time Complexity

O(1)

Reason

A constant number of modulus operations and comparisons.

---

Space Complexity

O(1)

Reason

Only one integer variable is used.

---

# Notes

## Concepts Learned

- Nested if-else
- Multiple conditions
- Modulus operator
- Logical reasoning

---

## Pattern

Rule-Based Decision Making

---

## Common Mistakes

- Assuming every year divisible by 4 is a leap year.
- Forgetting the 400-year rule.
- Printing the wrong output when the year is not divisible by 4.

---

## Interview Tip

Break complex English rules into smaller conditions before writing code.

---

# Interview Insight

This is one of the most frequently asked beginner programming problems.

Interviewers ask it to check whether you can correctly translate English rules into programming logic.