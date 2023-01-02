# Lab 4, CS 114, Fundamentals of Computing I

Remember **not** to work in this repository. Copy any files you need from this repo into another folder, then work from there.

---

## 1. Factorials

Run the enclosed `Factorial.java` program to ensure it works. Then…

The _factorial_ of `n` (written `n!`) is the product of the integers between `1` and `n`. Thus `4! = 1 × 2 × 3 × 4 = 24`. By definition, `0! = 1`. _Factorial is not defined for negative numbers_.

1. Write a program that asks the user for a non-negative integer and computes and prints the factorial of that integer. You’ll need a while loop to do most of the work — this is a lot like computing a sum, but it’s a product instead. And you’ll need to think about what should happen if the user enters `0`.

2. Now modify your program so that it checks to see if the user entered a negative number. If so, the program should print a message saying that a nonnegative number is required and ask the user the enter another number. The program should keep doing this until the user enters a nonnegative number, after which it should compute the factorial of that number.

**Hint**: You will need another while loop **before** the loop that computes the factorial. You should not need to change any of the code that computes the factorial!

---

## 2. Counting and Looping

Run the enclosed `LoveCS.java` program to ensure it works. Then…

1. Instead of using constant `LIMIT`, ask the user how many times the message should be printed. You will need to declare a variable to store the user’s response and use that variable to control the loop. (Remember that all caps is used only for constants!)

2. Number each line in the output, and add a message at the end of the loop that says how many times the message was printed. For example, if the user enters 3, your program should print this:

```bash
Enter the number of times the message should be printed: 3
1: I love Computer Science!!
2: I love Computer Science!!
3: I love Computer Science!!

Message was printed 3 times.
```

3. If the message is printed `N` times, compute and print the sum of the numbers from 1 to `N`. Thus, for the example above, the last two lines would now read:

```bash
Message was printed 3 times.
The sum of the numbers from 1 to 3 is 6.
```

**Note**: You will need to add a variable to hold the sum.
