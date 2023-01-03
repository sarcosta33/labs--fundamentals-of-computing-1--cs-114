# Lab 8, CS 114, Fundamentals of Computing I

Remember **not** to work in this repository. Copy any files you need from this repo into another folder, then work from there.

---

## 1. Averaging Numbers

As discussed in Section 7.4 of the textbook, when you run a Java program called `Foo`, anything typed on the command line after `java Foo` is passed to the main method in the `args` parameter as an array of strings.

1. Write a program `Average.java` that prints the strings given as arguments when running `java Average` at the command line, one per line. If nothing is given at the command line, print “No arguments.”

2. Modify your program so that it assumes the arguments given at the command line are integers. If there are no arguments, print a message. If there is at least one argument, compute and print the average of the arguments. **Note**: You will need to use the `parseInt` method of the `Integer` class to extract integer values from the strings that are passed in.

3. Test your program thoroughly using different numbers of command line arguments.

---

## 2. Playing with Cards

For this lab, write all your code in `Cards.java`, including method `main`. Write a class that defines an enumerated type named `Rank` with values `ace`, `two`, `three`, `four`, `five`, `six`, `seven`, `eight`, `nine`, `ten`, `jack`, `queen`, `king`. Method `main`, should do the following:

1. Declare variables `highCard`, `faceCard`, `card1`, and `card2`of type `Rank`.
2. Assign `highCard` to be an `ace`, `faceCard` to be a `jack`, `queen` or `king` (your choice), and `card1` and `card2` to be two different numbered cards (`two` – `ten` — your choice).
3. Print a line, using the `highCard` and `faceCard` objects, in the following format:

```bash
A blackjack hand: ace and ....
```

Replace the dots with a `faceCard` variable.
4. Declare two variables `card1Val` and `card2Val` of type `int` and assign them the face value of your `card1` and `card2` objects, respectively. Use your `card1` and `card2` variables and the `ordinal` method associated with enumerated types. Remember that the face value of `two` is `2`, `three` is `3`, and so on, so you need to make a slight adjustment to the ordinal value of the enumerated type.
5. Print two lines, using the `card1` and `card2` objects and the name method, as follows:

```bash
A two card hand: (print `card1` and `card2`)
Hand value: (print the sum of the face values of the two cards)
```
