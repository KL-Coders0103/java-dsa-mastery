# PB005 - Largest of Three Numbers

## Module
Module 01 - Programming Fundamentals

## Difficulty
⭐ Easy

## Topic
Comparison, if-else

## Platform
Custom

---

# Learning Objectives

After solving this problem you should understand:

- Multiple comparisons
- Logical AND (&&)
- Nested thinking
- Edge cases

---

# Prerequisites

- if-else
- Comparison Operators
- Variables

---

# Problem Statement

Given three integers A, B and C.

Print the largest number.

If all three numbers are equal, print:

All numbers are equal

---

# Input Format

Three integers

A

B

C

---

# Output Format

Print the largest integer.

OR

All numbers are equal

---

# Constraints

-10^9 <= A,B,C <= 10^9

---

# Example 1

Input

10

20

30

Output

30

---

# Example 2

Input

50

15

40

Output

50

---

# Example 3

Input

25

25

25

Output

All numbers are equal

---

# Problem Analysis

Possible cases

1. A is largest

2. B is largest

3. C is largest

4. All numbers are equal

---

# Thinking Questions

1. How many inputs are there?
There are given 3 input

2. How many possible outputs are there?
2, either largest number or all will be equal

3. How can we know A is the largest?
if and only if it is greater than both B and C

4. Which logical operator can combine two conditions?
&& operator

5. Why should we check the "all equal" case?
Because it might be possible that all numbers may be equal.

---

# Algorithm

Step 1

Read A, B and C.

Step 2

If all numbers are equal

Print "All numbers are equal".

Step 3

Else if A is greater than or equal to both B and C

Print A.

Step 4

Else if B is greater than or equal to both A and C

Print B.

Step 5

Else

Print C.

---

# Dry Run

## Test Case 1

### Input

A = 10

B = 20

C = 30

### Execution

Step 1

Check if all numbers are equal.

10 == 20 && 20 == 30

False

---

Step 2

Check if A is largest.

10 >= 20 && 10 >= 30

False

---

Step 3

Check if B is largest.

20 >= 10 && 20 >= 30

False

---

Step 4

Else executes.

Print C

Output

30

---

## Test Case 2

### Input

A = 25

B = 25

C = 25

### Execution

Step 1

25 == 25 && 25 == 25

True

Print

All numbers are equal

---

## Test Case 3

### Input

A = 50

B = 10

C = 30

### Execution

Step 1

All equal?

False

Step 2

50 >= 10 && 50 >= 30

True

Print

50

---

# Complexity Analysis

## Time Complexity

O(1)

### Reason

Only a fixed number of comparison operations are performed.

The execution time does not depend on the input values.

---

## Space Complexity

O(1)

### Reason

Only three integer variables are used.

No extra data structure is created.

---

# Notes

## Concepts Learned

- Comparison Operators
- Logical AND (&&)
- Decision Making
- Multiple Conditions
- Equality Checking

---

## Key Observations

A number is the largest only if it is greater than or equal to the other two numbers.

---

## Pattern Learned

Decision Making

Comparison Pattern

---

## Common Mistakes

❌ Forgetting the "all numbers are equal" case.

❌ Comparing only two numbers.

❌ Using only ">" and failing when values are equal.

❌ Not testing edge cases.

---

## Edge Cases

25 25 25

20 20 10

30 10 30

10 30 30

0 0 0

-10 -20 -30

---

## Interview Tip

Whenever a problem asks for the maximum among multiple values:

1. Think about equality.
2. Test edge cases.
3. Consider simplifying conditions.
4. Ask yourself if the final `else` is enough.

---

## Revision Notes

Remember these operators:

>

<

>=

<=

==

&&

These operators will be used throughout DSA.

Master them now.

---

# Interview Insight

This problem introduces the use of the logical AND operator (&&), which is used extensively in DSA and interview problems.