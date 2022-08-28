package dao;

import java.util.ArrayList;

public class OrdersDB {
    private ConfirmedOrders confirmedOrders = ConfirmedOrders.getInstance();
    private static OrdersDB ordersDBObject;

    private OrdersDB () {

    }

    public static OrdersDB getInstance() {
        if(ordersDBObject == null) {
            ordersDBObject = new OrdersDB();
        }
        return ordersDBObject;
    }

    private ArrayList<ArrayList> orders = new ArrayList<>();
    private ArrayList<Boolean> ordersStatus = new ArrayList<>();

    public ArrayList getOrders() {
        return orders;
    }

    public void addOrder(ArrayList order) {
        orders.add(order);
    }

    public void assignStatusToOrder() {
        ordersStatus.add(false);
    }

    public boolean getOrderStatus(ArrayList order) {
        return confirmedOrders.getConfirmedOrders().contains(order);
    }
}
