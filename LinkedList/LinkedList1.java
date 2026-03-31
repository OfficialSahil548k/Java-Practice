package LinkedList;

public class LinkedList1 {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this .next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    // METHODS

    // add at First
    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    // add at middle
        public void addMiddle(int idx, int data){
        if(idx==0){
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;
        while(i<idx-1){
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
}  

    // add at last
    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(tail == null){
            tail = head = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    // print all list
    public void printList(){
        Node temp = head;

        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    //remove from first
    public int removeFirst(){
        if(size==0){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }else if(size==1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    //remove from last
    public int removeLast(){
        if(size==0){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }else if(size==1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        Node temp = head;
        int i = 0;
        while(i<size-2){
            temp = temp.next;
            i++;
        }
        int val = temp.next.data;
        temp.next = null;
        tail = temp;
        size--;
        return val;
    }
    
    //remove from middle
    public int removeMiddle(int idx){
    if(head == null){
        System.out.println("List is empty");
        return -1;
    }
    if(idx == 0){
        return removeFirst();
    } 
    else if(idx == size - 1){
        return removeLast();
    }
    Node temp = head;
    int i = 0;
    while(i < idx - 1){
        if(temp == null || temp.next == null){
            System.out.println("Index out of bounds");
            return -1;
        }
        temp = temp.next;
        i++;
    }
    int val = temp.next.data;
    temp.next = temp.next.next;
    size--;
    return val;
    }

    //iterative search
    public int iterativeSearch(int key){
        Node temp = head;
        int i = 0; 
        while(temp!=null){
            int val = temp.data;
            if(val == key){
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }
    
    //Recursive search
    public int helper(Node head, int key){
        if(head==null){
            return -1;
        }else if(head.data == key){
            return 0;
        }
        int idx = helper(head.next,key);
        if(idx == -1){
            return idx;
        }
        return idx+1;
    }

    public int recursiveSearch(int key){
        return helper(head, key);
    }
    
    //Reverse the LL
    public void reverse(){
        Node prev = null;
        Node curr = tail = head;
        Node next = null;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }
    
    // Remove nth node from end
    public int removeNthNode(int n){
        // reverse();
        int val = removeMiddle(size-n);
        // reverse();
        return val;

    }
    
    // Slow-Fast approach
    public Node findMid(Node head){
        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    // check Palindrome
    public boolean checkPalindrome(){
        //base case
        if(head == null || head.next == null){
            return true;
        }

       // find mid
       Node mid = findMid(head);

       // reverse the 2nd half
        Node prev = null;
        Node curr = mid;
        Node next = null;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

       // check the left and right half
       Node right = prev;
       Node left = head;
       while(right != null){
        if(left.data != right.data){
            return false;
        }
        left = left.next;
        right = right.next;
       }
       return true;
    }
    public static void main(String[] args) {
        LinkedList1 ll = new LinkedList1();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(2);
        ll.addLast(1);
        // ll.addMiddle(2, 9);
        ll.printList();
        System.out.println("size of list : " +ll.size);
        // int val1 = ll.removeFirst();
        // System.out.println("value removed from First: " + val1);
        // int val2 = ll.removeLast();
        // System.out.println("value removed from last: " + val2);
        // int val3 = ll.removeMiddle(1);
        // System.out.println("value removed from middle: " + val3);
        // ll.printList();
        // System.out.println(" size of list : " +ll.size);
        // int pos1 = ll.iterativeSearch(9);
        // System.out.println(pos1);
        // int pos2 = ll.recursiveSearch(8);
        // System.out.println(pos2);
        // ll.reverse();
        // ll.printList();
        // int val4 = ll.removeNthNode(2);
        // System.out.println(val4);
        // ll.printList();
        System.out.println(ll.checkPalindrome());
    }
}