package gymservices;

public abstract class Service {
    private int price;
    private String name;

    protected Service(int price , String name) {
        this.price = price;
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public static String increaseServicePriceBy20(Service service){
        return service.getName() + " now costs :" + (service.getPrice() + 20);
    }

    @Override
    public String toString() {
        return "Service{" +
                "price=" + price +
                ", name='" + name + '\'' +
                '}';
    }
}
