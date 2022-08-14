package advanced;

public class CustomQueue extends CustomLinkedList{

    public void enqueue(Object ele) {
        super.addLast(ele);
    }

    public void dequeue() {
        System.out.println(getFirst());
        super.removeFirst();
    }

    @Override
    public void printList() {
        super.printList();
    }

    @Override
    public int getSize() {
        return super.getSize();
    }

    @Override
    public boolean isEmpty() {
        return super.isEmpty();
    }
}
