# Problem Statement

Write an algorithm to return Kth to last elements of a singly Linked List.

## Points to Remember

In this problem, we assume that when k=1, we return the last element. When k=2, we return the second last to element and so on. 
* If we knew the length of the Linked List, the solution is straightforward, the last k elements would begin from the element at (length- k).
* However, we assume that we do not know the length of the LinkedList. In this solution, two pointers are used. Place both at the head initially. Move one pointer(say q) "k" places ahead of the first one (say p). This will create a window of k elements between the two pointers. Now move both the pointers at the same pace. At a point, when q moves ahead of the last element(length), p will be at element (length-k)

    ```
        k = 2
        p       q
        10  20  30  40  50

                    p       q
        10  20  30  40  50  null
    ```
