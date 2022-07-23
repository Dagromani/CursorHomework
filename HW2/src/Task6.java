import java.util.Random;

public class Task6 {
    public static void main(String[] args) {
        int[] array = new int[10];
        Random randInt = new Random();
        for (int i = 0; i < 10; i++) {
            int randNumber = randInt.nextInt(100);
            array[i] = randNumber;
        }
        int sum = 0;
        for (int x : array) {
            sum = sum + x;
            System.out.println(x);
        }
        double average = (double)sum / array.length;
        System.out.println("Average : " + average);
    }
}
