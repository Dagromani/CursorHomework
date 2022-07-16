import java.sql.SQLOutput;
import java.util.Random;

public class Task7 {
    public static void main(String[] args) {
        int[] array = new int[10];
        Random randInt = new Random();

        for (int i = 0 ; i < 10 ; i++) {
            int randNumber = randInt.nextInt(100);
            array[i] = randNumber;
        }
        int maxNumber = 0;

        for (int x : array) {
            System.out.println(x);
            if (x > maxNumber & x % 2 == 0) {
                maxNumber = x;

            }

        }
        System.out.println("Max even number: " + maxNumber);
    }
}
