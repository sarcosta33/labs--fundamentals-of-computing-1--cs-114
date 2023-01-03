# Lab 9, CS 114, Fundamentals of Computing I

Remember **not** to work in this repository. Copy any files you need from this repo into another folder, then work from there.

---

## 1. Base Conversion

One algorithm for converting a base 10 number to another base `b` involves repeatedly dividing by `b`. Each time a division is performed, the remainder and quotient are saved. At each step, the dividend is the quotient from the preceding step; the divisor is always `b`. The algorithm stops when the quotient is `0`. The number in the new base is the sequence of remainders in reverse order (the last one computed goes first; the first one goes last).

In this exercise you will use this algorithm to write a program that converts a base 10 number to a 4-digit number in another base. The base 10 number and the new base (between 2 and 9) will be input to the program. The start of the program is in the file `BaseConvert.java`. Save this file to a different directory, then modify it to solve the problem presented in this lab.

---
