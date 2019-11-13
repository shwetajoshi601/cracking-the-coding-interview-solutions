# Problem Statement

Write code to partition a linked list around a value x, such that all nodes less than x, come before all nodes greater than or equal to x. If x is contained within the list, the values of x only need to be after the elements less than x. The partition element x can appear anywhere in the right partition, it does not need to appear between the left and right partitions.

For example,

    Input: LinkedList 3->5->8->5->10->2->1 [partition=5]
    Output: LinkedList 3->1->2->10->5->5->8

## Points to Remember

* Since the question mentions, the elements need not retain their order, we can solve this by maintaining 3 linked lists for elements less than the partition, equal to the partition and greater than the partition.
* Once the three lists have been created, concatenate them and return the new linked list.

## Running the code

    javac LinkedList.java
    java LinkedList

Enter the information prompted on the console.