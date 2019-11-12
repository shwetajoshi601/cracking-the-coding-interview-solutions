# Problem Statement

Implement an algorithm to delete a node in the middle (i.e. any node but the first and last node not the exact middle) of a singly linked list, given only access to that node.
For example,

    Input: Node c from the LinkedList a->b->c->d->e->f
    Output: Nothing is returned but the new linked list looks like a->b->d->e->f

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

    Final list: a   b   d   e   f

## Running the code

    javac LinkedList.java
    java LinkedList

Enter the information prompted on the console.