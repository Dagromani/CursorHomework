package gymstaff;

public class PrivateCoach extends Coaches {

    public PrivateCoach(String name , int age) {
        super(name, age);
    }



    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    void greeting() {
        System.out.println(getName()+ ":" + "Wass up, bro?");
    }

    @Override
    void doTraining() {

        System.out.println(getName()+ ":" + "(Doing training)");

    }

    @Override
    void giveAdvice() {

        System.out.println(getName()+ ":" + "(Giving advice)");

    }
}
