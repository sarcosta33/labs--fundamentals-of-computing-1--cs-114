Labs for CS 114, Fundamentals of Computing I 

---

This repo consists of ten labs associated with my section of CS 114, _Fundamentals of Computing I_, at The University of Hartford.

<ul>
  <li><a href="https://github.com/code-warrior/labs--fundamentals-of-computing-1--cs-114/tree/master/lab-01"><b>Lab 1</b></a></li>
  <li><a href="https://github.com/code-warrior/labs--fundamentals-of-computing-1--cs-114/tree/master/lab-02"><b>Lab 2</b></a></li>
  <li><a href="https://github.com/code-warrior/labs--fundamentals-of-computing-1--cs-114/tree/master/lab-03"><b>Lab 3</b></a></li>
  <li><a href="https://github.com/code-warrior/labs--fundamentals-of-computing-1--cs-114/tree/master/lab-04"><b>Lab 4</b></a></li>
  <li><a href="https://github.com/code-warrior/labs--fundamentals-of-computing-1--cs-114/tree/master/lab-05"><b>Lab 5</b></a></li>
  <li><a href="https://github.com/code-warrior/labs--fundamentals-of-computing-1--cs-114/tree/master/lab-06"><b>Lab 6</b></a></li>
  <li><a href="https://github.com/code-warrior/labs--fundamentals-of-computing-1--cs-114/tree/master/lab-07"><b>Lab 7</b></a></li>
  <li><a href="https://github.com/code-warrior/labs--fundamentals-of-computing-1--cs-114/tree/master/lab-08"><b>Lab 8</b></a></li>
  <li><a href="https://github.com/code-warrior/labs--fundamentals-of-computing-1--cs-114/tree/master/lab-09"><b>Lab 9</b></a></li>
  <li><a href="https://github.com/code-warrior/labs--fundamentals-of-computing-1--cs-114/tree/master/lab-10"><b>Lab 10</b></a></li>
</ul>

---

## Working with Make

Included in every lab folder is a `Makefile` to build and run your programs. Each `Makefile` is configured to work with the first program of every lab.

You can modify it to work with the other programs once you’re done with the first. The only modification required is to change the value assigned to `filename` on line 1 of `Makefile` to the name of the file you will be working with, sans extension. For example, if you wanted to work with a file called `Names.java`, then you’d assign `Names` to `filename`, not `Names.java`.

### Compiling Projects with Make

1. Assuming `make` is installed on your system, open your command line interface, or CLI, and navigate to the lab’s folder.
2. To compile then run your program, type `make`. Do this each time you want to compile then run your program.
3. Afterwards, if you only want to run your program, type `make run`.
4. Similarly, if you only want to compile but not run your program, then type `make compile`.
5. To remove the `.class` file associated with your program, type `make clean`.
