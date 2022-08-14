package arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task12to22 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("a");
        arrayList.add("b");
        arrayList.add("c");
        arrayList.add("d");
        arrayList.add("e");
        arrayList.add("f");
        arrayList.add("g");

        //Task12
        List<String> arrayListPortion = arrayList.subList(0 , 2);
        System.out.println(arrayListPortion);
        System.out.println("");

        //Task13
        System.out.println(arrayListPortion.containsAll(arrayList));
        System.out.println("");

        //Task14
        System.out.println(arrayList);
        Collections.swap(arrayList , 0 , 4);
        System.out.println(arrayList);
        System.out.println("");

        //Task15
        arrayList.addAll(arrayListPortion);
        System.out.println(arrayList);
        System.out.println("");

        //Task16
        List<String> arrayListClone = (List<String>) arrayList.clone();
        System.out.println(arrayListClone);
        System.out.println("");

        //Task17
        arrayListClone.removeAll(arrayListClone);
        System.out.println(arrayListClone);
        System.out.println("");

        //Task18
        System.out.println(arrayListClone.isEmpty());
        System.out.println(arrayList.isEmpty());
        System.out.println("");

        //Task19
        arrayList.trimToSize();
        System.out.println(arrayList);
        System.out.println("");

        //Task20
        arrayList.ensureCapacity(20);
        arrayList.add("qre");
        System.out.println(arrayList);
        System.out.println("");

        //Task21
        arrayList.set(1 , "specified element");
        System.out.println(arrayList);
        System.out.println("");

        //Task22
        for (int i = 0 ; i < arrayList.size() ; i++){
            System.out.println(arrayList.get(i));
        }
        System.out.println("");
    }
}
