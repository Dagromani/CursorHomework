package gymservices;

public class PrivateTraining extends Training {
    public PrivateTraining(int price , String name , String difficulty) {
        super(price, name , difficulty);
    }
    @Override
    public String getName() {
        return super.getName();
    }
    @Override
    public int getPrice() {
        return super.getPrice();
    }
    @Override
    public void setDuration(int duration) {
        super.setDuration(duration);
    }
    @Override
    public int getDuration() {
        return super.getDuration();
    }
    @Override
    public String toString() {
        return super.toString();
    }
    @Override
    public String getDifficulty() {
        return super.getDifficulty();
    }
}
