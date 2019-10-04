package pl.adulek.aisd.lists;

public class SinglyLinkList {

    public static void main(String[] args) {
        SinglyLinkList list = new SinglyLinkList();
        list.addAtFront(1);
        list.addAtFront(10);
        list.addAtFront(20);
        list.addAtFront(30);
        list.addAtFront(50);
        list.print();

        System.out.println("\n==========================");

        list.deleteAtFront();
        list.deleteAtFront();
        list.print();
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
