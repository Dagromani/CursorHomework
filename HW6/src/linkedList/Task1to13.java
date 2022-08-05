package linkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class Task1to13 {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();

        //Task1
        linkedList.addLast(15);
        System.out.println(linkedList);
        System.out.println("");

        //Task2
        linkedList.add(5);
        linkedList.add(4);
        linkedList.add(2);
        linkedList.add(8);
        for (Integer integer : linkedList) {
            System.out.println(integer);
        }
        System.out.println("");

        //Task3
        Iterator iterator = linkedList.listIterator(1);
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("");

        //Task4
        Iterator reverse = linkedList.descendingIterator();
        while (reverse.hasNext()) {
            System.out.println(reverse.next());
        }
        System.out.println("");

        //Task5
        linkedList.add(2 , 12);
        System.out.println(linkedList);
        System.out.println("");

        //Task6
        linkedList.addLast(13);
        linkedList.addFirst(9);
        System.out.println(linkedList);
        System.out.println("");

        //Task7
        linkedList.offerFirst(68);
        System.out.println(linkedList);
        System.out.println("");

        //Task8
        linkedList.offerLast(86);
        System.out.println(linkedList);
        System.out.println("");

        //Task9
        linkedList.add(5 , 44);
        linkedList.add(5 , 33);
        System.out.println(linkedList);
        System.out.println("");

        //Task10
        System.out.println(linkedList);
        System.out.println(linkedList.getFirst());
        System.out.println(linkedList.getLast());
        System.out.println("");

        //Task11
        for (int i = 0 ; i < linkedList.size() ; i++) {
            System.out.println("Index: " + i + ". Element: " + linkedList.get(i) + ".");
        }
        System.out.println("");

        //Task12
        for (int i = 0 ; i < linkedList.size() ; i++) {
            if (linkedList.get(i) == 13) {
                linkedList.remove(i);
            }
        }
        System.out.println(linkedList);
        System.out.println("");

        //Task13
        linkedList.removeFirst();
        linkedList.removeLast();
        System.out.println(linkedList);
    }
}
