package gymservices;

public class Main {
    public static void main(String[] args) {
        GroupTraining yoga = new GroupTraining(100, "hard");
        yoga.setDuration(60);

        System.out.println(yoga);
        System.out.println(yoga.getPrice());
        System.out.println(yoga.getDifficulty());

        DoProteinShake delicious = new DoProteinShake(10);
        delicious.setVolume(50);
        System.out.println(delicious);
        System.out.println(delicious.getPrice());

    }
}
