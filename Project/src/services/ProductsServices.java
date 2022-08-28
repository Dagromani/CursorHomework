package services;

import dao.OrdersDB;
import dao.ProductsDB;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductsServices {

    private ArrayList<String> Order = new ArrayList<>();
    private ProductsDB productsDB = ProductsDB.getInstance();
    private OrdersDB ordersDB = OrdersDB.getInstance();

    public ArrayList<String> getOrder() {
        return Order;
    }

    public void productList() {
        productsDB.showProductsList();
    }

    public void addProductToOrder(int i) {
        Order.add(productsDB.getProduct(i));
    }

    public void addToOrdersDB(ArrayList currentOrder) {
        ordersDB.addOrder(currentOrder);
    }

    public void showOrdersDB() {
        for (int i = 0 ; i < ordersDB.getOrders().size() ; i++) {
            System.out.println((i + 1) + ". " + ordersDB.getOrders().get(i) + ". Status: " + ordersDB.getOrderStatus((ArrayList) ordersDB.getOrders().get(i)));
        }
    }

    public Boolean search(String specProduct) {
        for (int i = 0; i < productsDB.getProducts().size(); i++) {
            if (productsDB.getProducts().get(i).equalsIgnoreCase(specProduct)) {
                return true;
            }
        }
        return false;
    }

    public void addToOrdersDBWithName(String name) {
        getOrder().removeAll(getOrder());
        for (int i = 0; i < productsDB.getProducts().size(); i++) {
            if (productsDB.getProducts().get(i).equalsIgnoreCase(name)) {
                addProductToOrder(i);
                ArrayList<String> currentOrder = new ArrayList<>(Order);
                ordersDB.addOrder(currentOrder);
                ordersDB.assignStatusToOrder();
            }
        }
    }

    public void addProduct(String productName) {
        productsDB.addNewProduct(productName);
    }

    public void productEdit(int i) {
        System.out.println("Old name: " + productsDB.getProduct(i));
        System.out.println("Enter new name: ");
        Scanner scan = new Scanner(System.in);
        String newName = scan.nextLine();
        productsDB.removeProduct(i);
        productsDB.addNewProductOnSpecIndex(newName, i);
    }

    public void productOrder() {
        getOrder().removeAll(getOrder());
        while (true) {
            Scanner scan = new Scanner(System.in);
            int var = scan.nextInt();
            if (var == 0) {
                ArrayList<String> currentOrder = new ArrayList<>(Order);
                ordersDB.addOrder(currentOrder);
                ordersDB.assignStatusToOrder();
                break;
            }
            addProductToOrder(var - 1);
        }
    }
}
