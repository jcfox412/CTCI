1.1 Unique Characters in String
====================

<b>Prompt</b>: Implement an algorithm to determine if a string has all unique characters.  What if you cannot use additional data structures?

### Solution 1: Hash Map.

<b>Assumptions</b>: none.

Create a hash where each key is a character and each value is 1.  Iterate through the string, adding each character to the hash table as you go.  If a given character is already in the hash table, you know there is a duplicate character (return false).  Once done iterating through the string, return true, since you know there is no duplicate character.

Time complexity would be O(n), since we may need to iterate through the entire string.

Space complexity would be O(1), because there is a maximum number of unique characters that can be stored in the hash (depending on whether the string is ASCII or Unicode).

### Solution 2: Sorted String.

<b>Assumptions</b>: I can modify the input string, and I can sort the string in place in O(n log(n)) time.

Sort the given input string by character.  Iterate through the new sorted string, checking to see if the previous character is equal to the current character.  If the characters are equal, you know there is a duplicate character (return false).  Once done interating through the string, return true, since you know there is no duplicate character.

Time complexity would be O(n log(n)), since we would need to sort the input string.

Space complexity would be O(1), since we are using no additional data structures.
