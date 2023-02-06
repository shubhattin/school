- [Assignment](#assignment)
- [Methods](#methods)
- **[Arrays Questions](#arrays-isc)**
- _[Array Objects as parameters](#array-objects-as-passes-parameters)_
- _[String Manipulation](#isc-string-manipulation)_
- [Output](#output)
- [Test](#test)
- **[Date and Time](#date-and-time)**
- [Inheritence](#inheritence)
- **[Data Structures](#data-structures-implementation-and-questions)**
- [Stack and Queue](#stack-and-queue)
- [Assignments (Jan)](#assignments-jan)

[Project Questions](./proj/ques.md)

Tool for running java easily :- [`runjava`](https://github.com/shubhattin/neovim-config/blob/main/wsl-config/other/runjava.py)

## Assignment

1. Checking saddle point of Matrx MxM.
   Saddle point is where value is **min** in **rows** and **max** in **columns**.
   [Here](./1/SaddlePoint.java)
2. Checking for a Wonderous Square. The **sum** of all the _rows_ and _columns_ is **same**.
   [Here](./1/WonderSquare.java)
3. Calulating MOBIUS of a number. **_i.e._**
   - If **1** then **1**
   - **0** if a prime factor comes **more than once**
   - **(-1)<sup>p</sup>** is there are **p distinct prime factors**.<br>
     [Here](./1/MOBIUS.java)
4. Printing the **Consecutive** Numbers whose sum adds upto the number entered. **_Like_**
   _ 9 = 4+5, 2+3+4
   _ 27 = 2+3+4+5+6+7, 8+9+10, 13+14.<br>
   [Here](./1/ConsecSum.java)
5. A Wonderous Square is a n by n matrix.
   _ It contains Integers from 1 to n<sup>2</sup>,where each integer appears only once.
   _ The sum of integers in any row or column should add upto in any row or column should add upto
   **0.5\*n(n<sup>2</sup>+1)**<br>
   [Here](./1/WonderSquare1.java)
6. A Smith number is a number in which the sum of digits of a number is equal to sum digits of
   the prime factors(excluding 1) of that number.
   [Here](./1/Smith.java)
7. A Adam-Prime number is a number in which is both Adam and Prime Number. Adam Number is number
   in which square of a number and the sqaure of its reverse are reverse to each other.
   [Here](./1/AdamPrime.java)
8. A Kaprekar number is a number in which the sqaure of the number is split into two parts
   and the sum of those two parts is equal to number. For e.x- 45<sup>2</sup>=2025 -> 20 + 45 == 45,
   297<sup>2</sup>=88209 -> 88 + 209 == 297.
   [Here](./1/Kaprekar.java)
9. An Evil Number is a number in which it's binary equivalent contains even times of 1's occurences.
   [Here](./1/Evil.java)
10. A Reversible Prime is a number which is prime and its reverse is also a prime.
    Both the integers consits of 3 or 9 at thier either ends.
    [Here](./1/RevPrime.java)
11. In a unique number every digit is distict. Enter a range of **m** to **n** and search for unique
    numbers.
    [Here](./1/Unique.java)
12. Write a program to check for Duck Numbers. it is a number containing one or more 0's as its digits. [Here](./1/Duck.java)

## Methods

1. Implementing Selection Sort, for descending order.
   [Here](./2/SelectSort.java)
2. Implement a BubbleSort to Ascending order.Initialize Array of A and B of **_M_** and **_N_**. Sort it Join the Elements Consecutively.
   [Here](./2/BubbleSort.java)
3. Write a program to implement Matric Multiplication.
   [Here](./2/MatrixMul.java)
4. Implement Binary Search.
   [Here](./2/BinarySearch.java)
5. Implement Binary Search using Recursion.
   [Here](./2/BinarySearchRec.java)

## Arrays ISC

1. Number Freequency Counter in an Array.
   [Here](./3/NumFreq.java)
2. Write a program to accept a set of n integers (where n > 0) in a single dimensional array. Arrange the elements of the array such that the lowest number appears in the centre of the array, next lower number in the right cell of the centre, next lower in the left cell of the centre and so on. The process will stop when the highest number will set in its appropriate cell. Finally, display the array elements. Assume that the memory space is less. Hence, you don't need to create extra array for the aforesaid task.
   [Here](./3/CentInt.java) and also [Here](./3/CentInt1.java)
3. A bank intends to design a program to display the denomination of an input amount, up to 5 digits. The available denomination with the bank are of rupees 2000, 500, 200, 100, 50, 20, 10 and 1.[Here](./3/Bank.java)
4. The encryption of letters are to be done as follows:
   A = 1
   B = 2
   C = 3 . . .
   Z = 26
   The potential of a word is found by adding the encrypted value of the letters.
   Example: KITE
   Potential = 11 + 9 + 20 + 5 = 45
   Accept a sentence which is terminated by either " . " , " ? " or " ! ". Each word of sentence is separated by single space. Decode the words according to their potential and arrange them in increasing order of their potential.
   [Here](./3/WordPotential.java)
5. A company manufactures packing cartons in four sizes, i.e. cartons to accommodate 6 boxes, 12 boxes, 24 boxes and 48 boxes. Design a program to accept the number of boxes to be packed (N) by the user (maximum up to 1000 boxes) and display the break-up of the cartons used in descending order of capacity (i.e. preference should be given to the highest capacity available, and if boxes left are less than 6, an extra carton of capacity 6 should be used.)
   [Here](./3/Boxes.java)
6. Given a square matrix M[][] of order 'n'. The maximum value possible for 'n' is 10. Accept three different characters from the keyboard and fill the array according to the output shown in the examples. If the value of n exceeds 10 then an appropriate message should be displayed.
   Input:
   First Character '_'
   Second Character '?'
   Third Character '#'
   Output:
   \# _ _ #
   ? # # ?
   ? # # ?
   \# _ \* #
   [Here](./3/MatPattern.java)
7. The result of a quiz competition is to be prepared as follows:
   The quiz has five questions with four multiple choices (A, B, C, D), with each question carrying 1 mark for the correct answer. Design a program to accept the number of participants N such that N must be greater than 3 and less than 11. Create a double-dimensional array of size (Nx5) to store the answers of each participant row-wise. Calculate the marks for each participant by matching the correct answer stored in a single-dimensional array of size 5. Display the scores for each participant and also the participant(s) having the highest score.
   [Here](./3/Quiz.java)
8. Check for a lower triangular matrix.
   [Here](./3/LowTri.java)
9. Check for Scalar Matrix.
   [Here](./3/Scalar.java)
10. A square matrix is the matrix in which number of rows equals the number of columns. Thus, a matrix of order n\*n is called a Square Matrix.
    Write a program in Java to create a double dimensional array of size nxn matrix form and fill the numbers in a circular fashion (anticlock-wise) with natural numbers from 1 to n2, taking n as an input. The filling of the elements should start from outer to the central cell.
    [Here](./3/CircleMat.java)
11. A square matrix is the matrix in which number of rows equals the number of columns. Thus, a matrix of order n\*n is called a Square Matrix.
    Write a program in Java to create a double dimensional array of size nxn matrix form and fill the numbers in a circular fashion (anticlock-wise) with natural numbers from 1 to n2, taking n as an input. The filling of the elements should start from outer to the central cell.
    [Here](./3/AntiCircleMat.java)
12. Write a program in Java create a double dimensional array of size nxn matrix form and fill the numbers in a circular fashion (anticlock-wise) with natural numbers from 1 to n2, as illustrated below:
    [Here](./3/CircleMat1.java)
13. Write a program in Java to enter natural numbers in a double dimensional array mxn (where m is the number of rows and n is the number of columns). Shift the elements of 4th column into the 1st column, the elements of 1st column into the 2nd column and so on. Display the new matrix.
    [Here](./3/ColumnShift.java)
14. Write a program in Java to enter natural numbers in a double dimensional array m x n (where m is the number of rows and n is the number of columns). Display the new matrix in such a way that the new matrix is the mirror image of the original matrix.
    [Here](./3/MirrorMat.java)
15. Write a Program in Java to fill a 2D array with the first 'mxn' prime numbers, where 'm' is the number of rows and 'n' is the number of columns.
    [Here](./3/PrimeMat.java)

## Array objects as passes Parameters

1. Check for equality of two matrices.
   [Here](./4/EqMat.java)
2. Adding Time.
   [Here](./4/AddTime.java)
3. Shift a Matrix up by one row.
   [Here](./4/Shift.java)
4. Merge two integers.
   [Here](./4/Merger.java)
5. Merge Two Sorted Integer Arrays.
   [Here](./4/Mixer.java)
6. Matrix Subtraction.
   [Here](./4/MatrixSub.java)
7. Merge Two Integer Arrays and then Sort the combined Array.
   [Here](./4/Combine.java)
8. Reverse numeral elements of a Matrix.
   [Here](./4/MatRev.java)

## ISC String Manipulation

1. A class Rearrange has been defined to modify a word by bringing all the vowels in the word
   at the beginning followed by the consonants.
   [Here](./5/VowelShift.java)
2. Count the freequency of Words starting with Capital Letter in a sentence.
   [Here](./5/Capital.java)
3. A class **SwapSort** to swap first and last characters of a word, and to sort the alphabets.
   [Here](./5/SwapSort.java)
4. Shift all the Consonants to the right of the word and capitalize the shifted consonants.
   [Here](./5/ConsShift.java)
5. Enter a String with max 100 and count the nunber of words and consonats.
   [Here](./5/TheString.java)
6. Print String **Fibonacci Series**.
   [Here](./5/StrFib.java)
7. Exchange the first and last letters of words in a sentence.
   [Here](./5/Exchange.java)

## Output

1. Show the Output. [Here](./6/Str.java)

## Test

1. A class Combine contains an array of integers which combines two arrays into a single array including the duplicate elements, if any, and sorts the combined array.
   [Here](./7/Combine.java)
2. A class Matrix contains a two-dimensional integer array of an order [m * n]. The maximum value possible for both ‘m’ and ‘n’ is 25. Design a class Matrix to find the difference between the two matrices
   [Here](./7/MatDiff.java)
3. A simple encryption system uses a shift process to hide a message. The value of the shift can
   be [Here](./7/Decode.java)
4. Print all triangular numbers in range of 3 to n.
   [Here](./7/Triangle.java)
5. Find HCF using Recursive Method.
   [Here](./7/HCF.java)
6. Find Second largest Number in array without sorting.
   [Here](./7/SecLarge.java)
7. Check for Fascinating Number. **2<sup>nd</sup>**
   [Here](./7/Fasc.java)

## Date and Time

https://drive.google.com/drive/folders/1B1m1IhQbXwIn8JCZZegARtCEb9_0EcAe

1. Given a date, check if it is valid or not. It may be assumed that the given date is in range from 01/01/1800 to 31/12/9999. [Here](./11/DateVerify.java)
2. Write a program to input a date in ddmmyyyy 8 digit format and print it in 1) dd / mm / yyyy format 2) dd, month name , yyyy format. [Here](./11/DateFormat.java)
3. Write a program to accept the year, month and the weekday name of the 1st day of that month and generate its calendar. [Here](./11/Calendar.java)
4. Design a program to accept a day number (between 1 and 366), year (in 4 digits) from the user to generate and display the corresponding date. Also, accept ‘N’ (1 <= N <= 100) from the user to compute and display the future date corresponding to ‘N’ days after the generated date. Display an error message if the value of the day number, year and N are not within the limit or not according to the condition specified. [Here](./11/NumberToDate.java)
5. Write a program to accept a date in the string format dd/mm/yyyy. Check whether the date entered is valid or not. If it is valid, then input a certain number of days. Then calculate and print the future date after adding the given number of days if the future date is valid. If the date entered is invalid, then display a proper error message. [Here](./11/FutureDate.java)
6. Write a program to accept 2 dates in the string format dd/mm/yyyy and find the difference in days between the 2 dates. [Here](./11/DateDiff.java)
7. Given a time in numbers we can convert it into words.
   For example :
   5 : 00 —— five o’clock
   5 : 10 —— ten minutes past five
   5 : 15 —— quarter past five
   5 : 30 —— half past five
   5 : 40 —— twenty minutes to six
   5 : 45 —— quarter to six
   5 : 47 —— thirteen minutes to six
   Write a program which first inputs two integers, the
   first between 1 and 12 (both inclusive) and second
   between 0 and 59 (both inclusive) and then prints out
   the time they represent, in words. [Here](./11/TimeToWord.java)

## Inheritence

1. Question 10.
   [Here](./8/Highest.java)

## Data Structures Implementation and Questions

- ### **Linked List**
  1. Make a Linked list to Enter numbers and sort them.[Here](./9/LinkSort.java)
- ### **Stack**
  1. Simple Implementation of Stack as an Array.[Here](./9/SimpleStack.java)
  2. Simple Implementation of Stack as a **Linked List**.[Here](./9/SimpleStackLink.java)
  3. Parenthesis matching using Stack.[Here](./9/MatchParenStack.java)
  4. Infix to Postfix Converter.[Here](./9/InfixToPostfix.java)
- ### **Queue**
  1. Simple Implementation of Queue.[Here](./9/SimpleQueue.java)
  2. Simple Implementation of Queue, also with shifting.[Here](./9/SimpleQueueShift.java)
  3. Simple Circular Queue Implementation.[Here](./9/SimpleCircleQueue.java)
  4. Simple Implementation of Queue as a **Linked List**.[Here](./9/SimpleQueueLink.java)

## Stack and Queue

1. A linear data structure enables the user to add an address from rear end and remove
   address from front. (a) Specify the class Diary giving details of the functions void pushadd(String) and String popadd(). Assume that the other functions have been defined. [4]
   The main function and algorithm need NOT be written.
   (b) Name the entity used in the above data structure arrangement.[Here](./10/Diary.java)
2. A register is an entity which can hold a maximum of 100 names. The register enables the user to add and remove names from the topmost end only
   (a) Specify the class Register giving details of the functions void push(String) and
   String pop().
   Assume that the other functions have been defined.
   The main function and algorithm need NOT be written.
   (b) Name the entity used in the above data structure arrangement.[Here](./10/Register.java)
3. A queue is an entity which can hold a maximum of 100 integers. The queue enables
   the user to add integers from the rear and remove integers from the front.[Here](./10/Queue.java)
4. A bookshelf is designed to store the books in a stack with LIFO(Last In First Out
   operation. Define a class Book with the following specifications.Assume that the other functions have been defined. The main function need not be written.[Here](./10/Book.java)

## Assignments (Jan)

1. Writa a program to accept a sentence which may be terminated by either '.' or ? or '!' only.
   Any other character may be ignored. The words may be seperated by one or more than one blank spaces and in UPPER CASE.
   [Here](./12/Upper.java)
2. Design a program to accept a day number (between 1 and 366), year (in 4 digits) from the user to generate and display the corresponding date. Also, accept ‘N’ (1 <= N <= 100) from the user to compute and display the future date corresponding to ‘N’ days after the generated date. Display an error message if the value of the day number, year and N are not within the limit or not according to the condition specified. [Here](./12/NumberToDate.java)
3. Printing the **Consecutive** Numbers whose sum adds upto the number entered. **_Like_**
   _ 9 = 4+5, 2+3+4
   _ 27 = 2+3+4+5+6+7, 8+9+10, 13+14.<br>
   [Here](./12/ConsecSum.java)
4. Caeser Cipher. [Here](./12/CaeserCipher.java)
5. Convert ASCII to Numbers. [Here](./12/ASCIItoNum.java)
6. Convert Numbers to ASCII. [Here](./12/NumtoASCII.java)

**_Deployed Preview : [https://shubhattin.github.io/school](https://shubhattin.github.io/school/)_**
