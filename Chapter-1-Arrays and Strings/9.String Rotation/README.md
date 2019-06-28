# Problem Statement

Assume you have a method isSubstring which checks if one word is a substring of another. Given two string s1 and s2, write code to check if s2 is a rotation o s1 using only one call to isSubstring.

For example:
```
waterbottle is a rotation of erbottlewat
```

## Points to remember
There are two solutions to this problem:

1. Consider,

    s1 = "waterbottle" and s2="erbottlewat"

    If you observe the string s2, it has two parts: __"erbottle"__ and __"wat"__
    
    These two parts can be identified using the first character in s1.
    To do this, we find the last index of the 1st character of s1 in s2.
    In this example, j=8
    Place another itertor i=0 at s1. Now iterate the to strings and compare character by character. If j=length of s1 at any point, then re-position j at 0. If any of the characters do not match, the strings aren't rotations.

    Refer [this](https://github.com/shwetajoshi601/cracking-the-coding-interview-solutions/blob/master/Chapter-1-Arrays%20and%20Strings/9.String%20Rotation/StringRotation2.java) solution.

2. Another simple solution is as follows:
    
    Concatenate s2 with itself:
    ```
    erbottlewat + erbottlewat = erbottlewaterbottlewat
    ```
    Now check if s1 is a substring of the new string. If s1 is a substring, they are rotations of each other, else, they are not.

    Refer [this](https://github.com/shwetajoshi601/cracking-the-coding-interview-solutions/blob/master/Chapter-1-Arrays%20and%20Strings/9.String%20Rotation/StringRotation.java) solution.

Note: In java, .indexOf() method can be used to check if a string is a substring of another.
