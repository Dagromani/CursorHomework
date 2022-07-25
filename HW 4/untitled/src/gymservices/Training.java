package gymservices;

public class Training extends Service {

    private int duration;

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public Training(int price) {
        super(price);
    }

    @Override
    public int getPrice() {
        return super.getPrice();
    }

    public int getDuration() {
        return duration;
    }

    @Override
    public String toString() {
        return "Training{" +
                "duration=" + duration +
                '}';
    }



}
