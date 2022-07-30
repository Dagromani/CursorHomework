package gymservices;

public abstract class Training extends Service implements Difficultyable {
    private int duration;
    private String difficulty;
    protected Training(int price , String name , String difficulty) {
        super(price,name);
        this.difficulty = difficulty;
    }
    public void setDuration(int duration) {
        this.duration = duration;
    }
    @Override
    public int getPrice() {
        return super.getPrice();
    }
    public String getName() {
        return super.getName();
    }
    public int getDuration() {
        return duration;
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
