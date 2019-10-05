package pl.adulek.aisd.lists;

public class SinglyLinkList {

    public static void main(String[] args) {
        SinglyLinkList list = new SinglyLinkList();
//        list.addAtFront(1);
////        list.addAtFront(10);
////        list.addAtFront(20);
////        list.addAtFront(30);
////        list.addAtFront(50);
////        list.print();
////
////        System.out.println("\n==========================");
////
////        list.deleteAtFront();
////        list.deleteAtFront();
////        list.print();
        list.insertSorted(15);
        list.insertSorted(10);
        list.insertSorted(30);
        list.insertSorted(25);
        list.insertSorted(45);
        list.insertSorted(5);
        list.insertSorted(20);
        list.print();
    }

    public void insertSorted(int number) {
        if(head == null) {
            head = new Node(number);
            size = 1;
            return;
        }
        if (head.value > number) {
            Node n = new Node(number);
            n.next = head;
            head = n;
            size ++;
            return;
        }
        Node next = head.next;
        Node prev = head;
        while(next != null && next.value < number) {
            prev = next;
            next = next.next;
        }
        prev.next = new Node(number);
        prev.next.next = next;
        size ++;

    }

    public void addAtFront(int number) {
        Node n = new Node(number);
        size++;
        n.next = head;
        head = n;
    }

    public void deleteAtFront() {
        size--;
        head = head.next;
    }

    public void print() {
        System.out.print("HEAD-->");
        Node n = head;
        while(n != null) {
            System.out.print(n.toString()+"-->");
            n = n.next;
        }
        System.out.print("end");
    }

    public int getSize() {
        return size;
    }

    private Node head;
    private int size;

    public class Node {
        public Node(int value) {
            this.value = value;
        }

        int value;
        Node next;

        @Override
        public String toString() {
            return "Node{" +
                    "value=" + value +
                    '}';
        }
    }
}
