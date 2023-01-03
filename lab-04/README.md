# Lab 4, CS 114, Fundamentals of Computing I

Remember **not** to work in this repository. Copy any files you need from this repo into another folder, then work from there.

---

## 1. Rolling Dice

Write a complete Java program that simulates the rolling of a pair of dice. (Use the enclosed `Dice.java` program to start.) For each die in the pair, the program should generate a random number between 1 and 6 (inclusive). It should print out the result of the roll for each die and the total roll (the sum of the two dice), all appropriately labeled. You must use the `Random` class. The `RandomNumbers` program in listing 3.2 of the text may be helpful.

---

## 2. Powers of 2

File `PowersOf2.java` contains a skeleton of a program to read in an integer from the user and print out that many powers of 2, starting with 20.

1. Using the comments as a guide, complete the program so that it prints out the number of powers of 2 that the user requests. **Do not use Math.pow to compute the powers of 2!** Instead, compute each power from the previous one (how do you get 2<sup>n</sup> from 2<sup>n–1</sup>?). For example, if the user enters 4, your program should print this:

```bash
Here are the first 4 powers of 2:
1
2
4
8
```

2. Modify the program so that instead of just printing the powers, you print which power each is, eg:

```bash
Here are the first 4 powers of 2:
2^0 = 1
2^1 = 2
2^2 = 4
2^3 = 8
```
