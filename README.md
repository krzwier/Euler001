# euler001

This repository is my solution to Problem #1 of Project Euler+ on [HackerRank](https://www.hackerrank.com/). Description of problem [here](https://projecteuler.net/problem=1).

The challenge is to find the sum of all multiples of 3 and 5 below a given number *N*. Input to the program is provided as integers separated by newlines, where the first number *T* denotes the number of test cases.  The program must produce the correct output for each number *N* that follows, within a specified time limit.

I wrote my solution in Java.  In order to achieve O(n) efficiency, my solution involved adding all of the multiples of 3 and all of the multiples of 5, then subtracting all of the multiples of 15, which were previously counted twice.
