# Problem Statement

Given two strings, write a method to determine if one is a permutation of the other.

## Points to Remember
1. Two strings are said to be permutations of each other if they have the same length and the same characters assuming the permutations are without repetition of characters.
For example,
    "abcdefg" is a permutation of "defgabc"
This means the strings have the same characters in different orders.
To simplify the problem, sort the two strings and compare them. If the sorted strings are equal then they are permutations of each other.
Note: For permutations with repetition of characters, you need to follow a different approach (solution will be added soon)

2. A note about Java string comparison:
    == -> Compares the content as well the memory location
    .equals() -> Compares the content only
For example,
    String s1 = new String("Hello");
    String s2 = new String("Hello");
    System.out.println(s1 == s2);   // false
    System.out.println(s1.equals(s2));  // true
