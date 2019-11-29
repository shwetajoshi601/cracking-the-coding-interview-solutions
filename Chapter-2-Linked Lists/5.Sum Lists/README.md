# Problem Statement

Given two linked lists representing numbers in reverse order, add the two lists.
```
For example,

list1: 7 -> 1 -> 6 (represents 617)
list2: 5 -> 9 -> 2 (represents 295)

Result: 2 -> 1 -> 9 (Represents 912)
```

## Points to Remember
* Here, the head node of each list represents the digit at unit's place. 
Add the corresponding digits in the two lists and find the carry. For the next set of digits the sum will be the data of the two lists added to the carry. (Just the way addition works)
* If the linked list represents the numbers in the same order, then a stack based approach can be used. Construct two stacks for the two linked lists. Since the numbers are represent in their order, the stack will represent the number in reverse, i.e. unit's digit first.

```
For example,

list1: 2 -> 5 -> 9 -> 7
list2: 5 -> 6 -> 7

Result: 3 -> 1 -> 6 -> 4
```

Here, the top of the stack would represent the unit's digit. 
```
st1         st2
7           7
9           6
5           5
2           -
```
Add the corresponding elements in the two stacks until one of the stacks is empty (considering carry at each step). Then, add the element from the stack that has the remaining elements.
