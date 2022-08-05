package advanced.sinlglyLinkedList;

public class CustomSinglyLinkedList<T extends CustomSinglyLinkedList.Node<CustomSinglyLinkedList.Node>> implements Listable<T> {

    private int size;
    private Node<T> head;
    private Node<T> tail;

    public CustomSinglyLinkedList() {
        size = 10;
    }

    protected class Node<T> {
        public Node<T> next;
        public T value;

        Node(T val){
            this.value = val;
        }

        public void showNode() {
            System.out.println(value);
        }
    }

    public int getSize(){
        return size;
    }

    @Override
    public T get(int i) {
        return null;
    }

    @Override
    public void add(T t) {

        Node<T> newNode = new Node(t);
        newNode.value = t;
        newNode.next = head;
        head = newNode;
        size++;
    }

    @Override
    public void remove(T t) {

    }

    public void showList() {

        Node current = head;
        while (current != null) {
            current.showNode();
            current = current.next;
        }

    }
}
