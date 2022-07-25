package gymservices;

public class Service {

    private int price;

    public Service(int price) {
        this.price = price;

    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Service{" +
                "price=" + price +
                '}';
    }
}
