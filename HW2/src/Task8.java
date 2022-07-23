import java.util.Random;

public class Task8 {
    public static void main(String[] args) {
        int[] array = new int[10];
        Random randInt = new Random();
        for (int i = 0; i < 10; i++) {
            int randNumber = randInt.nextInt(100);
            array[i] = randNumber;
        }
        for (int x = 0; x < 10; x++) {
            if (x % 2 == 0) {
                System.out.println(array[x]);
            }
        }
        System.out.println("");
        for (int y : array) {
            System.out.println(y);
        }
    }
}
