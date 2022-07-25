package gymstaff;

public abstract class Coaches extends Person {

    public Coaches(String name,int age) {
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

    }

    abstract void doTraining();

    abstract void giveAdvice();


}
