# Problem Statement
Given a string, write a function to check if it is a permutation of a palindrome. A palindrome is a work or phrase that is the same forwards and backwards. A permutation is a rearrangement of letters. The palindrome does not need to be limited to just dictionary words.

## Points to Remember
1. It is important to understand the characteristics of a palindrome. In a palindrome, you can have any number of characters that occur even number of times, but at the most only one character that occurs odd number of times.

    This character with odd frequency will be at the center of the palindromes with odd length. If the odd frequency is zero then the palindrome will not have a center character. 

For example:
```
aabbaa

This string contains 2 a's, 2 b's and 2 c's. (Even length string)
```
```
abcacba
This string contains 3 a's, 2 b's and 2 c's (Odd length string)
```

2. You can build a frequency table of the characters in the string and check the odd and even frequency numbers. Either build for all 128 ASCII characters or optimize the space usage by building a table only for the characters occuring in the string.