# Problem Statement

Write a method to replace all spaces in a string with '%20'. You may assume that the string has sufficient space at the end to hold the additional characters and that you are given the "true" length of the string. (Note: If implementing in Java, please use a character array so that you can perform this operation in place)

Example:
```
Input:  "Mr John Smith    ", 13
Output: "Mr%20John%20Smith"
```
## Points to Remember

1. A simple solution would be to use a String Builder in Java and construct a new string. (Solution provided)
2. The note in the question is important. Remember, when you need to do any sort of replace operations on a string, try to use a character array. Strings are immutable and each time you modify a string, a new string gets created. To avoid this, use a character array. It is advisable to traverse the array from the end.