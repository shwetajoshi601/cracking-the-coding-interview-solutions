import java.util.*;

class Node {
    Node next;
    int data;
    Node(int val) {
        data = val;
        next = null;
    }
}

class LinkedList2 {
    Node head;

    LinkedList2() {
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

    void push(int data) {
        Node n = new Node(data);

        n.next = head;
        head = n;
    }

    Node addListsInOrder(Node first, Node second) {
        // Your code here
        Stack<Integer> st1 = new Stack<Integer>();
        Stack<Integer> st2 = new Stack<Integer>();
        LinkedList2 res = new LinkedList2();
        //res.push(1);
        
        // create a stack for each linked list
        while(first != null) {
            st1.push(first.data);
            first = first.next;
        }
        
        /*System.out.println("Stack 1: ");
        while(!st1.empty()) System.out.println(st1.pop());*/

        while(second != null) {
            st2.push(second.data);
            second = second.next;
        }
        
        /*System.out.println("Stack 2: ");
        while(!st2.empty()) System.out.println(st2.pop());*/

        int carry = 0;
        int sum = 0;
        // adding elements in both lists
        while(!st1.empty() && !st2.empty()) {
            sum = st1.pop() + st2.pop() + carry;
            //System.out.println("Adding: " + (sum % 10));
            res.push(sum % 10);
            carry = sum / 10;
        }
        
        while(!st1.empty()) {
            sum = st1.pop() + carry;
            //System.out.println("Adding: " + (sum % 10));
            res.push(sum % 10);
            carry = sum / 10;
        }
        
        while(!st2.empty()) {
            sum = st2.pop() + carry;
            //System.out.println("Adding: " + (sum % 10));
            res.push(sum % 10);
            carry = sum / 10;
        }
        
        if(carry > 0) {
            //System.out.println("Adding: " + (carry % 10));
            res.push(carry % 10);
        }

        return res.head;
    }
       

    public static void main(String[] args) {
        LinkedList2 ll = new LinkedList2();
        LinkedList2 ll2 = new LinkedList2();
        Node head1 = ll.create();
        System.out.println("Linked List 1");
        ll.printLL(head1);
        Node head2 = ll2.create();
        System.out.println("Linked List 2");
        ll2.printLL(head2);
        Node res = ll.addListsInOrder(head1, head2);
        System.out.println("Sum");
        ll.printLL(res);
    }
}