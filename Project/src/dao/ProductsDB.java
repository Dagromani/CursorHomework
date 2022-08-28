package dao;

import java.util.ArrayList;

public class ProductsDB {
    private static ProductsDB productDBObject;

    private ProductsDB () {
        init();
    }

    public static ProductsDB getInstance() {
        if(productDBObject == null) {
            productDBObject = new ProductsDB();
        }
        return productDBObject;
    }

    private ArrayList<String> products = new ArrayList<>();

    public ArrayList<String> getProducts() {
        return products;
    }

    public String getProduct(int i) {
        return products.get(i);
    }

    public void showProductsList() {
        for (int i = 0; i < products.size(); i++) {
            System.out.println(i + 1 + "." + products.get(i));
        }
    }

    public void init() {
        products.add("Dumbbell 15 kg");
        products.add("Dumbbell 25 kg");
        products.add("Barbell");
        products.add("Skipping rope");
        products.add("Gymnastic rings");
        products.add("Kettle bell 16 kg");
        products.add("Kettle bell 24 kg");
    }

    public void addNewProduct(String productName) {
        products.add(productName);
    }

    public void addNewProductOnSpecIndex(String productName, int i) {
        products.add(i, productName);
    }

    public void removeProduct(int i) {
        products.remove(i);
    }


}
