import java.util.*;

class Node {
    Node next;
    char data;
    Node(char val) {
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
        char value;
        Node n, p = null;

        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter data for the node:");
            value = sc.next().charAt(0);

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

    void deleteNode(Node n) {
        // Node cannot be deleted if it is the last node
        if(n == null || n.next == null) System.out.println("Node cannot be deleted.");
        // point to the next node
        Node q = n.next;
        // copy data of the next node in the node to be deleted 
        n.data = q.data;
        // delete the next node
        n.next = q.next;
        q.next = null;
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

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        Node head = ll.create();
        ll.printLL(head);
        System.out.println("\nDeleting : " + head.next.next.data);
        ll.deleteNode(head.next.next);
        ll.printLL(head);
    }
}