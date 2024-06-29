package Linklist;

public class LL {
    private Node head;
    private Node tail;
    private int size;

    public LL() {
        this.size = 0;
    }

    public void insertLast(int val) {
        if (tail == null) {
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

    public void insert(int val, int idx) {
        if (idx == 0) {
            insertFirst(val);
            return;
        }
        if (idx == size) {
            insertLast(val);
            return;
        }
        Node temp = head;
        for (int i = 1; i < idx; i++) {
            temp = temp.next;

        }
        Node node = new Node(val, temp.next);
        temp.next = node;
        size++;

    }

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;
        if (tail == null) {
            tail = head;
        }
        size += 1;
    }

    public void printLL() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    private class Node {
        private int val;// value of node
        private Node next; // next value

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        // we know that arrays are contigous memory allocation
        // where linklist is not contigous memory allocation
        // in linklist every node point to the other next nodes
        // where every node contain val and next value points
        // linklist contion head and tail where head it point to the first node and the
        // tail is the last of the linklist

    }
}
