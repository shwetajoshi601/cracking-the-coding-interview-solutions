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
     * Function to find kth to last element in the LinkedList
     */
    Node findKthToLast(Node head, int k) {
        // Place two pointers at the beginning
        Node p=head;
        Node q=head;
        // Move q k-places ahead of p creating a window of k elements between p and q
        for(int i=0; i<k; i++) {
            // end of linked list
            if(q==null) return q;
            else q = q.next;
        }

        // Move both at the same pace
        // When q is at the last node, p will be at element (length-k)
        while(q != null) {
            p=p.next;
            q=q.next;
        }
        // return kth to last element
        return p;
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        Node head = ll.create();
        ll.printLL(ll.head);
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter the value of k: ");
        int k = sc.nextInt();
        if(k!=0) {
            Node kthToLast = ll.findKthToLast(head, k);
            System.out.println("Result: ");
            ll.printLL(kthToLast);
        } else System.out.println("Please enter k > 0");
        sc.close();
    }
}