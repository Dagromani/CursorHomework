package Task3;

import java.util.ArrayList;
import java.util.List;

public class Gene<T extends Comparable<T>> {

    public ArrayList<T> array;

    public Gene(ArrayList<T> array) {
        this.array = array;
    }

    public T highest() {
        T maxNumber = array.get(0);
        for (int i = 0; i < array.size(); i++) {
            if (maxNumber.compareTo(array.get(i)) < 0) {
                maxNumber = array.get(i);
            }
        }
        return maxNumber;
    }

    public T lowest() {
        T minNumber = array.get(0);
        for (int i = 0; i < array.size(); i++) {
            if (minNumber.compareTo(array.get(i)) > 0) {
                minNumber = array.get(i);
            }
        }
        return minNumber;
    }
}
