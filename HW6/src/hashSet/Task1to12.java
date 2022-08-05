package hashSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

public class Task1to12 {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();

        //Task1
        hashSet.add("o");
        hashSet.add("t");
        hashSet.add("r");
        hashSet.add("q");
        hashSet.add("w");
        System.out.println(hashSet);
        System.out.println("");

        //Task2
        for (String string : hashSet) {
            System.out.println(string);
        }
        System.out.println("");

        //Task3
        System.out.println(hashSet.size());
        System.out.println("");

        //Task4
        hashSet.removeAll(hashSet);
        System.out.println(hashSet);
        System.out.println("");

        //Task5
        System.out.println(hashSet.isEmpty());
        hashSet.add("o");
        hashSet.add("t");
        hashSet.add("r");
        hashSet.add("q");
        hashSet.add("w");
        System.out.println(hashSet.isEmpty());
        System.out.println("");

        //Task6
        HashSet<String> cloneSet = new HashSet<>();
        cloneSet = (HashSet<String>) hashSet.clone();
        System.out.println(cloneSet);
        System.out.println("");

        //Task7
        String[] array = new String[hashSet.size()];
        hashSet.toArray(array);
        for (String string : array){
            System.out.println(string);
        }
        System.out.println("");

        //Task8
        TreeSet<String> treeSet = new TreeSet<>(hashSet);
        System.out.println(treeSet);
        System.out.println("");

        //Task9
        List<String> arrayList = new ArrayList<>(hashSet);
        System.out.println(arrayList);
        System.out.println("");

        //Task10
        System.out.println(hashSet.containsAll(cloneSet));
        System.out.println("");

        //Task11
        cloneSet.remove("o");
        cloneSet.remove("q");
        hashSet.retainAll(cloneSet);
        System.out.println(hashSet);
        System.out.println("");

        //Task12
        hashSet.removeAll(hashSet);
        System.out.println(hashSet);
    }
}
