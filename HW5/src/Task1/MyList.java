package Task1;

import java.util.ArrayList;
import java.util.List;

public class MyList<T extends Number> {

    public MyList() {
    }

    public List<T> arrayList = new ArrayList<>();

    public void add(T parameter) {
        arrayList.add(0, parameter);
    }

    public int largest() {
        int maxNumber = (int) arrayList.get(0);
        for (int i = 0; i < arrayList.size(); i++) {
            if (maxNumber < (int) arrayList.get(i)) {
                maxNumber = (int) arrayList.get(i);
            }
        }
        return maxNumber;
    }

    public int smallest() {
        int minNumber = (int) arrayList.get(0);
        for (int i = 0; i < arrayList.size(); i++) {
            if (minNumber > (int) arrayList.get(i)) {
                minNumber = (int) arrayList.get(i);
            }
        }
        return minNumber;
    }

}
