package gymstaff;

public class Main {
    public static void main(String[] args) {

        PrivateCoach niko = new PrivateCoach("Niko" , 23);
        System.out.println(niko);;
        niko.giveAdvice();

        GroupCoach andre = new GroupCoach("Andre" , 30);
        System.out.println(andre.getAge());
        andre.doTraining();
        System.out.println(andre.getName());

        GymBartender olja = new GymBartender("Olga" , 25);
        olja.proteinShake();
        olja.greeting();
    }
}
