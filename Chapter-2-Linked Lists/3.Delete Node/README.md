# Problem Statement

Write an algorithm to return Kth to last elements of a singly Linked List.

## Points to Remember

* In this problem, we do not get access to the head node of the linked list.You are only given access to the "n"th node to be deleted.
* This can be solved by copying the data of the next node to the node to be deleted, and then deleting the next node.
* Note that this problem cannot be solved if the node to be deleted is the last node of the linked list. Hence, we print an error message.

For example, consider the node to be deleted with value "c".

    
    Step1: Place a pointer "p" on the next node
              n  p
        a  b  c  d  e  f

    Step 2: Copy the data of the next node to node n.
              n  p
        a  b  d  d  e  f

    Step 3: Set n.next to p.next
              n---->| 
        a  b  d  d  e  f

    Final list: a   b   c   d   e   f
