# Problem Statement

Given two linked lists representing numbers in reverse order, add the two lists.
```
For example,

list1: 7 -> 1 -> 6 (represents 617)
list2: 5 -> 9 -> 2 (represents 295)

Result: 2 -> 1 -> 9 (Represents 912)
```

## Points to Remember
Here, the head node of each list represents the digit at unit's place. 
Add the corresponding digits in the two lists and find the carry. For the next set of digits the sum will be the data of the two lists added to the carry. (Just the way addition works)

