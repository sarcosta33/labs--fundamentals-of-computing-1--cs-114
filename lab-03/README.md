# Lab 3, CS 114, Fundamentals of Computing I

Remember **not** to work in this repository. Copy any files you need from this repo into another folder, then work from there.

---

## 1. Formatting Output
File `Deli.java` contains a partial program that computes the cost of buying an item at the deli. Do the following:

1. Study the program to understand what it does.
2. Add `import` statements to import the `DecimalFormat` and `NumberFormat` classes.
3. Add the statement to declare `money` to be a `NumberFormat` object as specified in the comment.
4. Add the statement to declare `fmt` to be a `DecimalFormat` object as specified in the comment.
5. Add the statements to print a label in the following format (the numbers in the example output are correct for input of $4.25 per pound and 41 ounces). Use the formatting object money to print the unit price and total price and the formatting object `fmt` to print the weight to 2 decimal places.
```
   ***** CSDeli *****

   Unit Price: $4.25 per pound
   Weight: 2.56 pounds

   TOTAL: $10.89
```

---

## 2. Computing Distance

The file `Distance.java` contains an incomplete program to compute the distance between two points. Recall that the distance between the two points (`x1`, `y1`) and (`x2`, `y2`) is computed by taking the square root of the quantity `(x1 - x2)^2 + (y1 - y2)^2`. The program already has code to get the two points as input. You need to add an assignment statement to compute the distance and then a print statement to print it out (appropriately labeled). Test your program using the following data:

```bash
The distance between the points (3, 17) and (8, 10) is 8.6023... (lots more digits printed); the distance between (-33,49) and (-9, -15) is 68.352...
```
