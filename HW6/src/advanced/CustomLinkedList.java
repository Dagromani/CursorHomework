package advanced;

public class CustomLinkedList<T> {

    private int size;
    private Node head;
    private Node tail;
    private int j = 3;

    private class Node {
        Node next;
        Node prev;
        int i;
        T value;

        Node(T val) {
            this.value = val;
        }

        public int getNodeIndex() {
            return i;
        }

        public T getNode() {
            return value;
        }

        public T getNodeByInd(int index) {
            Node current = head;
            while (current != null) {
                if (index == current.getNodeIndex()) {
                    return current.value;
                }
                current = current.next;
            }
            return null;
        }
    }

    public void add(int index, T ele) {
        if (index >= size - 1 || index < 0) {
            System.out.println("There is no element on such index");
        } else if (index == 0) {
            addFirst(ele);
        } else {
            Node present = head;
            int i = index;
            while (present != null) {
                if (present.i >= i & present.i < getSize()) {
                    present.i++;
                }
                present = present.next;
            }
            Node current = head;
            for (int j = 0; j < index - 1; j++) {
                if (current != null) {
                    current = current.next;
                }
            }
            Node node = new Node(ele);
            node.next = current.next;
            node.prev = current;
            current.next = node;
            node.i = index;
            if (node.next != null) {
                node.next.prev = node;
            }
            size++;
        }
    }

    public void addLast(T ele) {
        if (head == null) {
            Node node = new Node(ele);
            head = node;
            node.i = 0;
        } else if (tail == null) {
            Node node = new Node(ele);
            head.next = node;
            tail = node;
            tail.prev = head;
            node.i = 1;
        } else if (head.next == tail) {
            Node node = new Node(ele);
            head.next = tail;
            tail.prev = tail;
            tail.next = node;
            tail = node;
            node.i = 2;

        } else {
            Node node = new Node(ele);
            tail.prev = tail;
            tail.next = node;
            tail = node;
            node.i = node.i + j;
            j++;
        }
        size++;
    }

    public void addFirst(T ele) {
        if (head == null) {
            Node node = new Node(ele);
            head = node;
            node.i = 0;
        } else if (tail == null) {
            Node node = new Node(ele);
            head.prev = node;
            node.next = head;
            head.i = 1;
            node.i = 0;
            tail = head;
            head = node;
        } else {
            Node node = new Node(ele);
            node.next = head;
            head.prev = node;
            node.i = 0;
            Node current = head;
            while (current != null) {
                current.i = current.i + 1;
                current = current.next;
            }
            head = node;
        }
        size++;
    }

    public void removeFirst() {
        head = head.next;
        Node current = head;
        while (current != null) {
            current.i = current.i - 1;
            current = current.next;
        }

    }

    public T getFirst() {
        return head.getNode();
    }

    public T getLast() {
        return tail.getNode();
    }

    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.println(current.getNode() + "{" + current.getNodeIndex() + "}");
            current = current.next;
        }
    }

    public void getElement(int index) {
        Node current = head;
        while (current != null) {
            if (index == current.getNodeIndex()) {
                System.out.println(current.getNode());
            }
            current = current.next;
        }

    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }

    }
}
