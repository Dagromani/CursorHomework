package gymservices;

public class GroupTraining extends Training implements Difficultyable {

    private String difficulty;

    @Override
    public int getPrice() {
        return super.getPrice();
    }

    @Override
    public void setDuration(int duration) {
        super.setDuration(duration);
    }

    public GroupTraining(int price, String difficulty) {
        super(price);
        this.difficulty = difficulty;
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
        return difficulty;
    }
}
