# Problem Statement
There are three types of edits that can be performed on strings: insert a character, remove a character, or replace a character. Given two strings, write a function to check if they are one edit (or zero edits) away.

Example:
```
pale, ple   -> true
pales, pale -> true
pale, bale  -> true
pale, bake  -> false
```

## Points to remember
1. Note that, if two strings have a difference of > 1 in length, then they cannot be one edit away
2. This is a simple problem which can be solved with an iteration in which you can check the corresponding characters based on the conditions on length of the strings
For example, 

    In the first example above, on reaching the character 'a' in s1, there is a mismatch in s2. 
    a != l
    Since the length of s2 is less than that of s1, you should only increment the pointer for s1.

    If both the strings are equal in length, both can be traversed in a similar way.

    We do not need a special condition for insertion or removal since both mean one string is smaller than the other.