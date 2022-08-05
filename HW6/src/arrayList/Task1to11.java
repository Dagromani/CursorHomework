package arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task1to11 {
    public static void main(String[] args) {
        // Task1
        List<String> arrayList = new ArrayList<>();
        arrayList.add("yellow");
        arrayList.add("blue");
        arrayList.add("grey");
        arrayList.add("white");
        System.out.println(arrayList);
        System.out.println("");

        //Task2
        for (String string : arrayList) {
            System.out.println(string);
        }
        System.out.println("");

        //Task3
        arrayList.add(1 , "yellow");
        System.out.println(arrayList);
        System.out.println("");

        //Task4
        arrayList.get(0);
        System.out.println(arrayList.get(0));
        System.out.println("");

        //Task5
        arrayList.set(3 , "black");
        System.out.println(arrayList);
        System.out.println("");

        //Task6
        arrayList.remove(2);
        System.out.println(arrayList);
        System.out.println("");

        //Task7
        if (arrayList.contains("yellow")) {
            System.out.println("Array contain yellow");
        } else {
            System.out.println("Array does not contain yellow");
        }
        System.out.println("");

        //Task8
        Collections.sort(arrayList);
        System.out.println(arrayList);
        System.out.println("");

        //Task9
        List<String> arrayList2 = new ArrayList<>();
        arrayList2.add("123");
        arrayList2.add("456");
        arrayList2.add("789");
        arrayList2.add("000");
        Collections.copy(arrayList2 , arrayList);
        System.out.println(arrayList2);
        System.out.println("");

        //Task10
        Collections.shuffle(arrayList2);
        System.out.println(arrayList2);
        System.out.println("");

        //Task11
        Collections.reverse(arrayList2);
        System.out.println(arrayList2);
        System.out.println("");
    }
}
