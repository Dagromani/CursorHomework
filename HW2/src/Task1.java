import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] array = new int[10];
        for (int i = 0; i < 10; i++) {
            int newRand = rand.nextInt(10000);
            if (newRand % 2 == 0) {
                array[i] = newRand;
            } else {
                array[i] = newRand + 1;
            }
        }
        for (int x : array) {
            System.out.println(x);
        }
    }
}
