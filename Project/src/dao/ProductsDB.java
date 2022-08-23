package dao;

import java.util.ArrayList;
import java.util.List;

public class ProductsDB {

    private ArrayList<String> products = new ArrayList<>();

    public ProductsDB() {
        addProducts();
    }

    public ArrayList<String> getProducts() {
        return products;
    }

    public String getProduct(int i){
        return products.get(i);
    }

    public void showProductsList() {
        for (int i = 0; i < products.size() ; i++) {
            System.out.println(i + 1 + "." + products.get(i));
        }
    }

    public void addProducts() {
        products.add("Dumbbell 15 kg.");
        products.add("Dumbbell 25 kg.");
        products.add("Barbell.");
        products.add("Skipping rope.");
        products.add("Gymnastic rings.");
        products.add("Kettle bell 16 kg.");
        products.add("Kettle bell 24 kg.");
    }




}
