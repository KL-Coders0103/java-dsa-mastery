# PB004 - Largest of Two Numbers

## Module
Module 01 - Programming Fundamentals

## Difficulty
⭐ Easy

## Topic
Comparison Operators, if-else

## Platform
Custom

---

# Related Problems

### HackerRank

- Java If-Else ✅

### LeetCode

- No direct equivalent (Concept Building)

---

# Learning Objectives

After completing this problem you should understand:

- Comparison operators
- if-else
- Edge cases
- Decision making

---

# Problem Statement

Given two integers A and B, print the larger number.

If both numbers are equal, print:

Both numbers are equal

---

# Input Format

Two integers

A

B

---

# Output Format

Print the largest number.

If both are equal, print:

Both numbers are equal

---

# Constraints

-10^9 <= A,B <= 10^9

---

# Example 1

Input

10

20

Output

20

---

# Example 2

Input

40

15

Output

40

---

# Example 3

Input

25

25

Output

Both numbers are equal

---

# Problem Analysis

Input

Two integers

Output

Largest integer

Observation

There are three possibilities.

1. A > B

2. B > A

3. A == B

---

# Thinking Questions

1. What is the input?

2. What is the output?

3. How many possible cases exist?

4. Which comparison operators will you use?

5. Why is checking equality important?

---

# Algorithm

Step 1

Read two integers A and B.

Step 2

If A > B

Print A.

Step 3

Else if B > A

Print B.

Step 4

Else

Print "Both numbers are equal".

Step 5

End.

---

# Dry Run

Input

A = 25

B = 25

Step 1

Compare A and B

25 > 25 → False

25 < 25 → False

Else executes

Output

Both numbers are equal

---

# Complexity

Time Complexity

O(1)

Reason

Because only one comparison is performed.

---

Space Complexity

O(1)

Reason

Only two integer variables are used.

---

# Notes

## Concepts Learned

- Comparison Operators
- if-else if
- Equality Checking

## Common Mistakes

- Forgetting the equality case
- Printing the wrong variable
- Incorrect output message

## Pattern

Comparison

## Interview Tip

Whenever two values are compared, think about all three possibilities:

- Greater Than
- Less Than
- Equal

---

# Interview Insight

Many candidates only write:

if (a > b)

else

and completely forget

a == b

Interviewers intentionally test this edge case.