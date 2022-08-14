package advanced;

public class CustomSinglyLinkedList <T> {

    private int size;
    private Node head;
    private Node tail;
    private int j = 1;

    private class Node {
        Node next;
        int i;
        T value;
        Node(T val) {
            this.value = val;
        }
        public T getNode() {
            return value;
        }

        public int getNodeIndex(){
            return i;
        }
    }

    public void add(T element) {
        if (head == null) {
            Node node = new Node(element);
            head = node;
            tail = node;
            node.i = 0;
        } else if (tail == null){
            Node node = new Node(element);
            tail = node;
            head.next = tail;
            node.i = 1;
        } else {
            Node node = new Node(element);
            tail.next = node;
            tail = node;
            node.i = node.i + j;
            j++;
        }
        size++;
    }

    public T getFirst() {
        return head.getNode();
    }

    public T getLast() {
        return tail.getNode();
    }

    public void removeTail() {
        Node current = head;
        while(current != null) {
            if (current.i == size - 2) {
                current.next = null;
                tail = current;
            }
            current = current.next;
        }
        size = size - 1;
    }

    public int getSize() {
        return size;
    }

    public void getElement(int index) {
        Node current = head;
        while(current != null) {
            if(index == current.getNodeIndex()) {
                System.out.println(current.getNode());
            }
            current = current.next;
        }
    }

    public void printList() {
        Node current = head;
        while(current != null) {
            System.out.println(current.getNode() + "{" + current.i + "}");
            current = current.next;
        }
    }

    public boolean isEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }
}
