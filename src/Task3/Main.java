package Task3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList array = new ArrayList<>();
        array.add(1);
        array.add(2);
        array.add(-5);
        array.add(6);


        Gene example = new Gene(array);
        System.out.println("Highest number in array: " + example.highest());
        System.out.println("Lowest number in array: " + example.lowest());


    }
}
