package advanced;

import java.util.Stack;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

//        CustomSinglyLinkedList<String> example = new CustomSinglyLinkedList<>();
//        example.add("aaa");
//        System.out.println(example.getLast());
//        example.getElement(0);

//        CustomLinkedList linkList = new CustomLinkedList();
//        linkList.add(0 , 7);
//        System.out.println(linkList.getLast());

//        CustomStack stack = new CustomStack();
//        stack.push(6);
//        stack.push(0);
//        stack.push(3);
//        stack.push(45);
//        stack.push(98);
//        System.out.println(stack.getSize());
//        System.out.println("");
//        stack.printList();
//        System.out.println("");
//        stack.pop();
//        stack.pop();
//        System.out.println("");
//        stack.printList();


//        CustomLinkedList linkList = new CustomLinkedList();
//        linkList.addLast(7);
//        linkList.addLast(56);
//        linkList.addLast(23);
//        linkList.addLast(76);
//        linkList.addLast(999);
//        linkList.printList();
//        System.out.println(linkList.getSize());
//        System.out.println("");
//        linkList.addFirst(666);
//        linkList.addFirst(333);
//        linkList.printList();
//        System.out.println(linkList.getSize());
//        System.out.println("");
//        linkList.removeFirst();
//        linkList.add(0 , 888);
//        linkList.add(4 , 444);
//        linkList.printList();

        CustomQueue example = new CustomQueue();
        example.enqueue(8);
        example.enqueue(1);
        example.enqueue(3);
        example.enqueue(4);
        example.printList();
        System.out.println("");
        System.out.println(example.isEmpty());
        example.dequeue();
        example.dequeue();
        example.printList();
    }
}
