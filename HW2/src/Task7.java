import java.util.Random;

public class Task7 {
    public static void main(String[] args) {
        int[] array = new int[10];
        Random randInt = new Random();

        for (int i = 0; i < 10; i++) {
            int randNumber = randInt.nextInt(100);
            array[i] = randNumber;
        }

        int maxNumber = Integer.MIN_VALUE;

        for (int x = 0; x < array.length; x++) {

            if (array[x] % 2 == 0 && array[x] > maxNumber) {
                maxNumber = array[x];


            }

        }

        System.out.println("Max even number: " + maxNumber);


    }
}
