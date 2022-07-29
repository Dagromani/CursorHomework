package Task1;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        MyList list = new MyList<>();
        list.add(5);
        list.add(1);
        list.add(2);
        list.add(0);
        list.add(-1);
        list.add(-2);
        for (int i = 0 ; i < list.arrayList.size() ; i++) {
            System.out.println(list.arrayList.get(i));
        }

        System.out.println("Max number: " + list.largest());
        System.out.println("Min number: " + list.smallest());
    }
}
