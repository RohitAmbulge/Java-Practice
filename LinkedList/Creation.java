import java.util.Scanner;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    public void create() {
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();

        if (head == null) {
            head = new Node(data);
            head.next = null;
        } else {
            Node p = head;
            while (p.next != null) {
                p = p.next;
            }
            p.next = new Node(data);
            p.next.next = null;
        }
    }

    public void display(Node r) {
        while (r != null) {
            System.out.println(r.data);
            r = r.next;
        }
    }

}

public class Creation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter te size of : ");
        int size = sc.nextInt();

        LinkedList l = new LinkedList();
        for (int i = 1; i <= size; i++) {
            System.out.println("Enter the " + (i) + " Element in linkedList: ");
            l.create();
        }

        System.out.println("The linked list is : ");
        l.display(l.head);
    }
}