package gymstaff;

public class GroupCoach extends Coaches {

    public GroupCoach(String name, int age) {
        super(name , age);
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
        System.out.println(getName()+ ":" + "Hello all!");
    }

    @Override
    void doTraining() {

        System.out.println(getName()+ ":" + "Let's go group.No pain, no gain!");

    }

    @Override
    void giveAdvice() {

        System.out.println(getName()+ ":" + "Do it like that.");

    }
}
