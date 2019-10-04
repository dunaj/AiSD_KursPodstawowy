package pl.adulek.aisd.lists;

public class DoublyLinkList<T> {

    public static void main(String[] args) {
        DoublyLinkList<Integer> list = new DoublyLinkList<>();
        list.addAtFront(50);
        list.addAtFront(40);
        list.addAtFront(30);
        list.addAtFront(20);
        list.addAtFront(10);
        System.out.println(list);
        list.deleteAtFront();
        list.deleteAtFront();
        System.out.println(list);
        list.deleteAtFront();
        list.deleteAtFront();
        list.deleteAtFront();
        list.deleteAtFront();
        System.out.println(list);
        list.addAtEnd(10);
        list.addAtEnd(20);
        list.addAtEnd(30);
        list.addAtEnd(40);
        System.out.println(list);
        System.out.println("Deleting: "+ list.deleteAtEnd());
        list.deleteAtEnd();
        list.deleteAtEnd();
        list.deleteAtEnd();
        list.deleteAtEnd();
        System.out.println(list);

    }

    public void addAtFront(T t) {
        Node<T> node = new Node<>(t);
        if(head == null) {
            head = tail = node;
            size = 1;
        } else {
            head.setPrev(node);
            node.setNext(head);
            head = node;
            size++;
        }
    }

    public Node<T> deleteAtFront() {
        Node<T> node = head;
        if(head == null) {
            return null;
        }
        if (head == tail) {
            head = null;
            tail = null;
            return node;
        }
        head = head.getNext();
        head.setPrev(null);
        node.setNext(null);
        size--;
        return node;
    }

    public void addAtEnd(T t) {
        Node<T> node = new Node<>(t);
        if(head == null) {
            head = tail = node;
            size = 1;
        } else {
            tail.setNext(node);
            node.setPrev(tail);
            tail = node;
            size++;
        }
    }

    public Node<T> deleteAtEnd() {
        Node<T> node = tail;
        if(head == null) {
            return null;
        }
        if (head == tail) {
            head = null;
            tail = null;
            return node;
        }
        tail = tail.getPrev();
        tail.setNext(null);
        node.setPrev(null);
        size--;
        return node;
    }

    @Override
    public String toString() {
        StringBuilder build = new StringBuilder();
        Node<T> n = head;
        build.append("HEAD");
        while (n != null) {
            build.append("<=>");
            build.append(n.toString());
            n = n.next;
        }
        build.append("==>END");
        return build.toString();
    }

    private Node<T> head;
    private Node<T> tail;
    private int size;

    public class Node<T> {
        private T value;
        private Node<T> next;
        private Node<T> prev;

        @Override
        public String toString() {
            return "Node{value=" + value + '}';
        }

        public Node(T value) {
            this.value = value;
        }

        public T getValue() {
            return value;
        }

        public void setValue(T value) {
            this.value = value;
        }

        public Node<T> getNext() {
            return next;
        }

        public void setNext(Node<T> next) {
            this.next = next;
        }

        public Node<T> getPrev() {
            return prev;
        }

        public void setPrev(Node<T> prev) {
            this.prev = prev;
        }
    }
}
