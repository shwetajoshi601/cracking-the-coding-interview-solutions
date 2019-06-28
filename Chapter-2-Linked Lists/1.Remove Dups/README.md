# Problem Statement

Write code to remove duplicates from an unsorted Linked List.
How would you solve this problem is a temporary buffer is not allowed?

## Points to Remember

There are two solutions to this problem:
1. Since we have to remove duplicates, a hash set can be used. Loop over the linked list elements, if the element is not present in the hash set, we add it in the set, set a pointer to the current node. Move the current pointer ahead. If the element is present in the hashset, set the previous pointer to the next node of the current pointer. The solution takes O(N) time.
2. Another solution would be to use two pointers - one for pointing to a single node, second one to loop through the rest of the elements in the linked list. This solution takes O(N<sup>2</sup>) time.