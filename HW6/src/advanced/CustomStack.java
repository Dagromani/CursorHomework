package advanced;

public class CustomStack<T> extends CustomSinglyLinkedList<T> {

    public void push(T element) {
        super.add(element);
    }

    public void pop() {
        System.out.println(super.getLast());
        super.removeTail();
    }

    public T top() {
        return super.getLast();
    }

    @Override
    public boolean isEmpty() {
        return super.isEmpty();
    }

    @Override
    public T getFirst() {
        return super.getFirst();
    }

    @Override
    public int getSize() {
        return super.getSize();
    }

    @Override
    public void getElement(int index) {
        super.getElement(index);
    }

    @Override
    public void printList() {
        super.printList();
    }
}
