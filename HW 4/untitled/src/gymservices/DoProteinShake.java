package gymservices;

public class DoProteinShake extends Service {
    private int volume;

    public DoProteinShake(int price, String name) {
        super(price, name);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public int getPrice() {
        return super.getPrice();
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
