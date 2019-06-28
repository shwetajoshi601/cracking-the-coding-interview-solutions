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
    void create() {
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
    }

    /**
     * Function to print a linked list
     */
    void printLL() {
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
     * Function to remove duplicates from a linked list without using an extra buffer
     */
    void removeDups() {
        Node p = head;
        Node q = null;
        while( p!= null) {
            q = p;
            while(q.next != null) {
                if(q.next.data == p.data) {
                    q.next = q.next.next;
                } else q = q.next;
            }
            p = p.next;
        }
    }

    /**
     * Function to remove duplicates using a hash set
     */
    void removeDupsUsingHash() {
        HashSet<Integer> set = new HashSet<Integer>();
        Node prev = null;
        Node p = head;
        while(p != null) {
            if(set.contains(p.data)) {
                prev.next = p.next;
            } else {
                set.add(p.data);
                prev = p;
            }
            p = p.next;
        }
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.create();
        ll.printLL();
        ll.removeDups();
        System.out.println("\n--------------After removing duplicates--------------");
        ll.printLL();
        ll.removeDupsUsingHash();
        System.out.println("\n--------After removing duplicates using hashset------");
        ll.printLL();
    }
}