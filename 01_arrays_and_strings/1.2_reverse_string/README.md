1.2 Reverse a String
====================

<b>Prompt</b>: Implement a function void reverse(char* str) in C or C++ which reverses a null-terminated string.

<b>NOTE</b>: I am unfamiliar with C or C++, so I will Java instead.

### Solution 1: Character Array

<b>Assumptions</b>: none.

Create a character array from the input string.  Iterate through half of the string, using a placeholder variable to swap the i<sup>th</sup> and (len-i)<sup>th</sup> elements of the character array. If the string is even-length, then all characters will be moved.  If the string is odd-length, then all but the middle character will be moved. Print the result.

Time complexity is O(n), since we must access each character of the string at least once.

Space complexity is O(n), since we create a character array of length n to manipulate the string.