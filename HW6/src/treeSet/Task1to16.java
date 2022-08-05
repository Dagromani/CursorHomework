package treeSet;

import java.util.Iterator;
import java.util.TreeSet;

public class Task1to16 {
    public static void main(String[] args) {
        //Task1
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("blue");
        treeSet.add("black");
        treeSet.add("red");
        treeSet.add("pink");
        System.out.println(treeSet);
        System.out.println("");

        //Task2
        for (String string : treeSet) {
            System.out.println(string);
        }
        System.out.println("");

        //Task3
        TreeSet<String> newTree = new TreeSet<>(treeSet);
        System.out.println(newTree);
        System.out.println("");

        //Task4
        Iterator reverse = treeSet.descendingIterator();
        while(reverse.hasNext()) {
            System.out.println(reverse.next());
        }
        System.out.println("");

        //Task5
        System.out.println(treeSet.first());
        System.out.println(treeSet.last());
        System.out.println("");

        //Task6
        TreeSet<String> newestTree = new TreeSet<>();
        newestTree = (TreeSet<String>) treeSet.clone();
        System.out.println(newestTree);
        System.out.println("");

        //Task7
        System.out.println(treeSet.size());
        System.out.println("");

        //Task8
        System.out.println(treeSet.containsAll(newestTree));
        System.out.println("");

        //Task9
        TreeSet<Integer> numbers = new TreeSet<>();
        TreeSet<Integer> lessThan = new TreeSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(-6);
        numbers.add(10);
        numbers.add(80);
        numbers.add(54);
        lessThan = (TreeSet<Integer>) numbers.headSet(7);
        System.out.println(lessThan);
        System.out.println("");

        //Task10
        System.out.println(numbers.ceiling(10));
        System.out.println(numbers.ceiling(20));
        System.out.println("");

        //Task11
        System.out.println(numbers.floor(54));
        System.out.println(numbers.floor(3));
        System.out.println("");

        //Task12
        System.out.println(numbers.higher(10));
        System.out.println("");

        //Task13
        System.out.println(numbers.lower(2));
        System.out.println("");

        //Task14
        System.out.println(numbers);
        System.out.println(numbers.pollFirst());
        System.out.println(numbers);
        System.out.println("");

        //Task15
        System.out.println(numbers.pollLast());
        System.out.println(numbers);
        System.out.println("");

        //Task16
        numbers.remove(10);
        System.out.println(numbers);
    }
}
