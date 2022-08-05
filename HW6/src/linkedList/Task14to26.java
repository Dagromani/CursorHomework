package linkedList;

import java.util.*;

public class Task14to26 {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(4);
        linkedList.add(5);
        linkedList.add(7);
        linkedList.add(2);

        //Task14
        linkedList.removeAll(linkedList);
        System.out.println(linkedList);
        System.out.println("");

        //Task15
        linkedList.add(1);
        linkedList.add(4);
        linkedList.add(5);
        linkedList.add(7);
        linkedList.add(2);
        Collections.swap(linkedList , 0 , 3);
        System.out.println(linkedList);
        System.out.println("");

        //Task16
        Collections.shuffle(linkedList);
        System.out.println(linkedList);
        System.out.println("");

        //Task17
        LinkedList<Integer> secondLinkedList = new LinkedList<>();
        secondLinkedList.add(9);
        secondLinkedList.add(500);
        secondLinkedList.add(227);
        linkedList.addAll(secondLinkedList);
        System.out.println(linkedList);
        System.out.println("");

        //Task18
        LinkedList<Integer> cloneList = new LinkedList<>();
        cloneList = (LinkedList<Integer>) linkedList.clone();
        System.out.println(cloneList);
        System.out.println("");

        //Task19
        System.out.println(linkedList.pop());
        System.out.println(linkedList);
        System.out.println("");

        //Task20
        System.out.println(linkedList.peekFirst());
        System.out.println("");

        //Task21
        System.out.println(linkedList.peekLast());
        System.out.println("");

        //Task22
        if (linkedList.contains(7)) {
            System.out.println("List contain " + 7);
        }
        System.out.println("");

        //Task23
        List<Integer> list = new ArrayList<>(linkedList);
        System.out.println(list);
        System.out.println("");

        //Task24
        System.out.println(linkedList.containsAll(cloneList));
        System.out.println(linkedList.containsAll(linkedList));
        System.out.println("");

        //Task25
        System.out.println(cloneList.isEmpty());
        cloneList.removeAll(cloneList);
        System.out.println(cloneList.isEmpty());
        System.out.println("");

        //Task26
        linkedList.set(4 , 1000);
        System.out.println(linkedList);
    }
}
