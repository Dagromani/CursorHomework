package dao;

import java.util.ArrayList;

public class ConfirmedOrders {

    private static ConfirmedOrders confirmedOrdersObject;

    private ConfirmedOrders () {

    }

    public static ConfirmedOrders getInstance() {
        if(confirmedOrdersObject == null) {
            confirmedOrdersObject = new ConfirmedOrders();
        }
        return confirmedOrdersObject;
    }

    private ArrayList<ArrayList> confirmedOrders = new ArrayList<>();

    public ArrayList getConfirmedOrders() {
        return confirmedOrders;
    }

    public void confirmOrder(ArrayList order) {
        confirmedOrders.add(order);
    }
}
