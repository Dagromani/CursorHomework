package Task1;

import java.util.ArrayList;
import java.util.List;

public class MyList<T extends Number & Comparable<T>> {

    public MyList() {
    }

    public List<T> arrayList = new ArrayList<>();

    public void add(T parameter) {
        arrayList.add(0, parameter);
    }

    public T largest() {
        T maxNumber = arrayList.get(0);
        for (int i = 0; i < arrayList.size(); i++) {
            if (maxNumber.compareTo(arrayList.get(i)) < 0) {
                maxNumber = arrayList.get(i);
            }
        }
        return maxNumber;
    }

    public T smallest() {
        T minNumber = arrayList.get(0);
        for (int i = 0; i < arrayList.size(); i++) {
            if (minNumber.compareTo(arrayList.get(i)) > 0) {
                minNumber = arrayList.get(i);
            }
        }
        return minNumber;
    }
}
