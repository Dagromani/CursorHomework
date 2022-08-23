package services;

import dao.ProductsDB;

import java.util.ArrayList;

public class Order {

    private ArrayList<String> order = new ArrayList<>();
    private ProductsDB productsDB = new ProductsDB();

    public ArrayList<String> getOrder() {
        return order;
    }

    public void productList() {
        productsDB.showProductsList();
    }

    public void addToOrder(int i) {
        order.add(productsDB.getProduct(i));
    }

    public String search(String specProduct) {
        for (int i = 0; i < productsDB.getProducts().size() ; i++) {
            if (productsDB.getProducts().get(i).equalsIgnoreCase(specProduct)) {
                return productsDB.getProducts().get(i);
            }
        }
        return "Product not found.";
    }




}
