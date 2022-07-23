import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        int[] array = new int[10];
        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            int randInt = r.nextInt(100);
            array[i] = randInt;
        }
        int maxNumber = Integer.MIN_VALUE;
        for (int x = 0; x < 10; x++) {
            if (array[x] > maxNumber) {
                maxNumber = array[x];
            }
            System.out.println(array[x]);
        }
        System.out.println("Max number : " + maxNumber);
    }
}
