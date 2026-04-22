package LinkedList;

public class DoublyLL {
    public static class Node {
        int data;
        Node next,prev;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    // add in first
    public static void addFirst(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            size++;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
        size++;
    }

    // remove from first
    public static void removeFirst() {
        if (head == null){
            System.out.println("List is empty");
            return;
        }
        if (head == tail) {
            head = tail = null;
            size--;
        } else {
            head = head.next;
            head.prev = null;
            size--;
        }
    }

    // add at last
    public static void addLast(int data) {
        Node newNode = new Node(data);
        if (tail == null) {
            head = tail = newNode;
            size++;
            return;
        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = tail.next;
        size++;
    }

    // remove from last
    public static void removeLast() {
        if (tail == null){
            System.out.println("List is empty.");
            return;
        }
        if (head == tail) {
            head = tail = null;
            size--;
        } else {
            tail = tail.prev;
            tail.next = null;
            size--;
        }
    }

    //reverse
    public static void reverse(){
        Node curr = head;
        Node prev = null;
        Node next;
        while(curr != null){
            next = curr.next;
            curr.next=prev;
            curr.prev=next;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    //print list
    public static void print(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" <--> ");
            temp = temp.next;
        }
        System.out.println("null");
        System.out.println("size of list : "+size);
    }


    public static void main(String[] args) {
        addFirst(1);
        addLast(2);
        addLast(3);
        addLast(4);
        addLast(5);
        print();
        removeLast();
        print();
        reverse();
        print();
    }
}
