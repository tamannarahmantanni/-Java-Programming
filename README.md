DOC FILE: https://docs.google.com/document/d/1mOQUVApjrvKlnFSeU87qIu_j6mYEaTH4/edit?usp=drive_link&ouid=113434615955561700751&rtpof=true&sd=true

This README file provides detailed descriptions and solutions for JAVA programming tasks. Below is the list of problems along with their descriptions and solution approaches


1. Find the 2nd Highest CGPA (Linear Search)

Problem:
Given the CGPA list:
[3.50, 3.52, 3.43, 3.63, 3.48, 3.32, 3.30, 3.60, 3.86, 3.75]

Approach:

-Traverse the list to identify the highest CGPA.

-Traverse the list again to find the second-highest CGPA, excluding the highest.


2. Sort CGPA List in Descending Order

Problem:
Programmatically sort the given CGPA list in descending order without using the Arrays.sort() method.

Approach:

-Use a nested loop to compare and swap elements.

-Arrange them in descending order.

3. Binary Search for CGPA

Problem:
Take a CGPA as user input and check if it exists in the given list using the binary search algorithm.

Approach:

-Sort the CGPA list (if not sorted).

-Implement the binary search algorithm to check for the user-provided value.

4. Generate Random Integers

Problem:
Generate an array of 10 random integers. Print all the integers, and find the maximum and minimum values in the array.

Approach:

-Use a random number generator to populate the array.

-Traverse the array to identify the maximum and minimum values.

5. Count Notes for an Amount

Problem:
Given an amount, break it down into notes using the following denominations:
[1000, 500, 200, 100, 50, 20, 10, 5, 2, 1]

Approach:

-Use a greedy algorithm to divide the amount by the largest note.

-Continue dividing the remainder by the next largest note until it becomes zero.

6. Pyramid Pattern

Problem:
Generate the following pattern programmatically:

12345
1234
123
12
1
12
123
1234
12345

Approach:

-Use nested loops to print the decreasing and increasing sequences of numbers.

7. Find 2 Lowest Heights

Problem:
Given the heights of 10 babies in cm, find the two lowest heights without using the Arrays.sort() method.

Approach:

-Traverse the list to identify the smallest height.

-Traverse the list again to find the second-smallest height, excluding the smallest.

8. Analyze a String

Problem:
For a given string, count:

The number of words.

The number of characters (excluding spaces).

The number of vowels.

The number of consonants.

Approach:

-Split the string into words to count them.

-Remove spaces to count characters.

-Use conditions to count vowels and consonants.

9. Check Binary String

Problem:
Write a program to check if a given string consists only of binary digits (0 and 1).

Approach:

-Traverse the string to check if all characters are either 0 or 1.

10. Generate Secure Password

Problem:
Generate a random password of length 8 that contains:

At least 1 capital letter.

At least 1 small letter.

At least 1 digit.

At least 1 special character.

Approach:

-Use a random character generator for each required category.

-Shuffle the characters to ensure randomness.

11. Remove Vowels

Problem:
Write a program to remove vowels from a given string.

Approach:

-Iterate through the string and exclude vowels during concatenation.

12. Calculate Discounted Cost

Problem:
Extract prices from the following text and calculate the total cost after a 15% discount:
A Core i7 laptop costs 85000 tk and a gaming mouse costs 2500 tk.

Approach:

-Extract the prices using regular expressions or parsing.

-Calculate the total cost and apply a 15% discount.

13. Extract Transaction ID

Problem:
Extract the transaction ID from the following HTML:

<!DOCTYPE html>
<html>
<body>
    <div>
        <div class="button">
            <p>Transaction Id: TXN1234</p>
        </div>
    </div>
</body>
</html>

Approach:

-Use string manipulation or regular expressions to extract the transaction ID.

14. Validate IP Address

Problem:
Check if an IP address is valid. Conditions:

Format: [digit].[digit].[digit].[digit]

The first segment must not start with 0 or be a single digit.

Approach:

-Split the input string by . and validate each segment.

15. Calculate Marks

Problem:
A test paper consists of 15 questions:

Some carry 10 marks each.

Others carry 5 marks each.

Determine how many questions of each type are needed to achieve a total of 100 marks.

Approach:

-Solve using basic arithmetic equations to distribute the marks.

-This document provides a comprehensive description and approach for solving each problem. Happy coding!

