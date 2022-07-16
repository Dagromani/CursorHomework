import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        char[] array = new char[10];
        Random r = new Random();

        for (int i = 0; i < 10 ; i++) {
            char randChar = (char)(r.nextInt(26) + 'a');
            array[i] = randChar;


        }

        for (char x : array) {
              System.out.println(x);
        }



    }
}
