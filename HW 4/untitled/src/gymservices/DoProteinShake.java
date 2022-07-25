package gymservices;

public class DoProteinShake extends Service {

    private int volume;


    public DoProteinShake(int price) {
        super(price);
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "DoProteinShake{" +
                "volume=" + volume +
                '}';
    }
}
