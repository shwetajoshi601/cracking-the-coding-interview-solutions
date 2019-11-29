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
        // sc.close();
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

    Node addLists(Node l1, Node l2) {
        if(l1 == null && l2 == null) return new Node(0);

        Node res = null, temp = null, prev = null;
        int carry = 0;

        while(l1 != null || l2 != null) {
            int sum = carry + (l1 != null ? l1.data : 0) + (l2 != null ? l2.data : 0);
            
            carry = sum >= 10 ? 1 : 0;
            sum = sum % 10;

            temp = new Node(sum);

            if(res == null) res = temp;
            else prev.next = temp;

            prev = temp;

            if(l1 != null) l1 = l1.next;
            if(l2 != null) l2 = l2.next;
        }

        if(carry > 0) temp.next = new Node(carry);

        return res;
    }
       

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        LinkedList ll2 = new LinkedList();
        Node head1 = ll.create();
        System.out.println("Linked List 1");
        ll.printLL(head1);
        Node head2 = ll2.create();
        System.out.println("Linked List 2");
        ll2.printLL(head2);
        Node res = ll.addLists(head1, head2);
        System.out.println("Sum");
        ll.printLL(res);
    }
}