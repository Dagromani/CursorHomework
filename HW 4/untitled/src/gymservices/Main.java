package gymservices;

public class Main {
    public static void main(String[] args) {
        GroupTraining yoga = new GroupTraining(100, "Yoga" , "medium");
        yoga.setDuration(60);
        System.out.println(yoga);
        System.out.println(yoga.getPrice());
        System.out.println(yoga.getDifficulty());
        DoProteinShake delicious = new DoProteinShake(10 , "Protein");
        delicious.setVolume(50);
        System.out.println(delicious);
        System.out.println(delicious.getPrice());
        PrivateTraining bodyBuilding = new PrivateTraining(200 , "Bodybuilding" , "hard");
        System.out.println(bodyBuilding);
        System.out.println(Service.increaseServicePriceBy20(yoga));
        System.out.println(Service.increaseServicePriceBy20(bodyBuilding));
        System.out.println(Service.increaseServicePriceBy20(delicious));
    }
}
