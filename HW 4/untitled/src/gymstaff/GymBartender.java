package gymstaff;

public class GymBartender extends Person {


    public GymBartender(String name , int age) {
        super(name, age);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public int getAge() {
        return super.getAge();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    void greeting() {
        System.out.println(getName()+ ":" + "Good morning!What would you like to order?");
    }

    public void proteinShake() {
        System.out.println(getName()+ ":" + "Your protein shake is ready!");
    }
}
