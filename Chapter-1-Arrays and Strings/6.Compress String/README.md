# Problem Statement

Implement a method to perform basic string compression using the counts of repeated characters.
For example,
```
The string aabcccccaaa would become a2b1c5a3
```

If the compressed string would not become normal than the original string, your method should return the original string. You can assume the string has only uppercase and lowercase letters.

## Points to remember

1. This problem can be solved by using the String Builder in Java. For each character we check the next character and append either the character and its count to the string builder.
2. At any point if the compressed string is not smaller than the original string, the original string can be returned.

Note: Do not confuse this problem wih other string problems that can be solved with hashing. Note that, in the above example, the character 'a' occurs twice. The compressed string contains this character twice in order with its respective counts.