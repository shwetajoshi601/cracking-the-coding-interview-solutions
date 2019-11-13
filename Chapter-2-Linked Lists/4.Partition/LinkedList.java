import java.util.*;

class Node {
    Node next;
    int data;
    Node(int val) {
        data = val;
        next = null;
    }
}

class LinkedList {
    Node head;

    LinkedList() {
        head = null;
    }

    /**
     * Function to create a Linked List
     */
    Node create() {
        char ch;
        int value;
        Node n, p = null;

        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter data for the node:");
            value = sc.nextInt();

            n = new Node(value);

            if(head == null) {
                head = n;
                p = n;
            } else {
                p.next = n;
                p = n;
            }
            System.out.println("Add more nodes? ");
            ch = sc.next().charAt(0);
        } while(ch == 'y');
        sc.close();
        return head;
    }

    /**
     * Function to print a linked list
     */
    void printLL(Node head) {
        System.out.println("Linked List:");
        if(head == null) System.out.println("The Linked List is empty!!");
        else {
            Node p = head;
            while(p != null) {
                System.out.print(p.data + " ");
                p = p.next;
            }
        }
    }

    /**
     * Function to partition the LinkedList
     */
    Node partition(Node head, int x) {
        // create 3 linked lists to store elements <, =, > x
        Node smallHead = null; Node smallEnd = null;
        Node eqHead = null; Node eqEnd = null;
        Node largeHead = null; Node largeEnd = null;

        Node p = head;
        // loop through the original linked list
        while(p != null) {
            // element equal to x
            if(p.data == x) {
                // if equal LL is empty
                if(eqHead == null) {
                    eqHead = eqEnd = p;
                } else {
                    // add the element to the eq list
                    eqEnd.next = p;
                    eqEnd = eqEnd.next;
                }
                // element less than x
            } else if(p.data < x) {
                if(smallHead == null) {
                    smallHead = smallEnd = p;
                } else {
                    smallEnd.next = p;
                    smallEnd = smallEnd.next;
                }
            } else {
                // element greater than x
                if(largeHead == null) {
                    largeHead = largeEnd = p;
                } else {
                    largeEnd.next = p;
                    largeEnd = largeEnd.next;
                }
            }
            p = p.next;
        }
        // set the end of large LL
        if(largeEnd != null) largeEnd.next = null;
        // if small list is empty
        if(smallHead == null) {
            // if eq list is empty, return large LL
            if(eqHead == null) return largeHead;
            else {
                // join eq and large LLs
                eqEnd.next = largeHead;
                return eqHead;
            }
        }
        // if eq list is empty
        if(eqHead == null) {
            if(largeHead == null) return smallHead;
            else {
                smallEnd.next = largeHead;
                return smallHead;
            }
        }
        // if large list is empty
        if(largeHead == null) {
            if(eqHead == null) return smallHead;
            else {
                smallEnd.next = largeHead;
                return smallHead;
            }
        }

        //if none of the lists are empty
        smallEnd.next = eqHead;
        eqEnd.next = largeHead;
        return smallHead;
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        Node head = ll.create();
        ll.printLL(ll.head);
        head = ll.partition(head, 5);
        System.out.println("\nAfter partitioning:");
        ll.printLL(head);
    }
}