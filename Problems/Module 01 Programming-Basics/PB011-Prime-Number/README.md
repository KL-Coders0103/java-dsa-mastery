# PB011 - Prime Number

# Status

## Module

Programming Fundamentals

## Problem ID

PB011

## Difficulty

⭐⭐⭐

## Pattern

Divisibility

## Estimated Time

30 Minutes

## Platform

Custom

---

# Pattern Recognition

Use this pattern when:

✅ Checking divisibility

✅ Counting factors

✅ Number Theory

---

# Learning Objectives

After solving this problem you should understand:

- Prime Numbers
- Factors
- Divisibility
- Nested Loops
- Algorithm Thinking

---

# Problem Statement

Given an integer N,

determine whether it is a Prime Number.

Print

Prime

or

Not Prime

---

# Definition

A Prime Number has exactly TWO factors.

1

and

Itself

---

# Input Format

One integer N.

---

# Output Format

Prime

OR

Not Prime

---

# Constraints

1 <= N <= 100000

---

# Examples

Input

5

Output

Prime

---

Input

9

Output

Not Prime

---

Input

2

Output

Prime

---

Input

1

Output

Not Prime

---

# Thinking Questions

1. What is a factor?
The number which completly divides the integer.

2. How many factors does a prime number have?
only 2, 1 and number itself.

3. Which loop should we use?
For loop

4. Can 1 be prime?
1 is nither prime nor composite

5. Can 2 be prime?
yes, 2 is prime number

---

# Algorithm

Step 1

Read the integer N.

Step 2

If N is less than or equal to 1

Print "Not a Prime Number".

Step 3

Otherwise,

check divisibility from 2 to N-1.

Step 4

If any number divides N exactly,

the number is not prime.

Stop checking further.

Step 5

If no divisor is found,

print "Prime Number".

---

# Dry Run

Input

N = 7

| i | 7 % i | Divisible? | isPrime |
|---|-------|------------|----------|
|2|1|No|true|
|3|1|No|true|
|4|3|No|true|
|5|2|No|true|
|6|1|No|true|

Output

Prime Number

---

Input

N = 9

| i | 9 % i | Divisible? | isPrime |
|---|-------|------------|----------|
|2|1|No|true|
|3|0|Yes|false|

Loop stops because of break.

Output

Not a Prime Number

---

# Complexity

## Time Complexity

O(N)

Reason

In the worst case, the loop checks almost every number from 2 to N-1.

---

## Space Complexity

O(1)

Reason

Only a boolean and a few integer variables are used.

---

# Notes

## Concepts Learned

- Prime Numbers
- Factors
- Divisibility
- Boolean Flag
- break Statement

---

## Pattern

Divisibility Check

---

## Common Mistakes

❌ Treating 1 as Prime

❌ Forgetting to use break

❌ Checking from 1 instead of 2

---

## Edge Cases

N = 0

N = 1

N = 2

N = 3

N = 97

---

## Interview Tip

Always think about edge cases first.

Then think about optimization.

---

# Interview Insight

This is the first problem where we'll later optimize the algorithm.

Today's goal is correctness.

Optimization comes later.