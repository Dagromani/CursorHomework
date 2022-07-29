package Task3;

import java.util.ArrayList;
import java.util.List;

public class Gene <T>  {

    public ArrayList<T> array;

    public Gene(ArrayList<T> array) {

        this.array = array;

    }

    public int highest() {
        int maxNumber = (int) array.get(0);
        for (int i = 0; i < array.size(); i++) {
            if (maxNumber < (int) array.get(i)) {
                maxNumber = (int) array.get(i);
            }
        }
        return maxNumber;
    }

    public int lowest() {
        int minNumber = (int) array.get(0);
        for (int i = 0; i < array.size(); i++) {
            if (minNumber > (int) array.get(i)) {
                minNumber = (int) array.get(i);
            }
        }
        return minNumber;
    }

}
