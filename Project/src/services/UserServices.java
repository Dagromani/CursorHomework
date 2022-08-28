package services;

import dao.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class UserServices {
    private BlockedUsers blockedUsers = BlockedUsers.getInstance();
    private OrdersDB ordersDB = OrdersDB.getInstance();
    private ConfirmedOrders confirmedOrders = ConfirmedOrders.getInstance();
    private UsersDB usersDB = UsersDB.getInstance();
    private Admin admin = new Admin();

    public HashMap<String, String> getNewUsers() {
        return usersDB.getUsers();
    }

    public String getNewUserPassword(String name) {
        return getNewUsers().get(name);
    }

    public boolean loginAsUser() {
        System.out.println("Enter user name:");
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        System.out.println("Enter password:");
        String password = scan.nextLine();
        if (userValidation(name, password) == true) {
            return true;
        } else if (checkIfUserIsBlocked(name, password) == true) {
            System.out.println("The user " + name + " is blocked!");
            return false;
        } else {
            System.out.println("Invalid name or password!Try again.");
            return false;
        }
    }

    public void registerNewUser() {
        System.out.println("Enter user name:");
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        System.out.println("Enter password:");
        String password = scan.nextLine();
        usersDB.addUser(name, password);
    }

    public boolean checkIfUserIsBlocked(String name, String password) {
        if (blockedUsers.getBlockedUsers().containsKey(name)) {
            return blockedUsers.getBlockedPassword(name).equals(password);
        } else {
            return false;
        }

    }

    public boolean userValidation(String name, String password) {
        if (usersDB.getUsers().containsKey(name)) {
            return usersDB.getUserPassword(name).equals(password);
        } else {
            return false;
        }
    }

    public boolean loginAsAdmin() {
        System.out.println("Enter admin name:");
        Scanner scan = new Scanner(System.in);
        String adminName = scan.nextLine();
        System.out.println("Enter password:");
        String password = scan.nextLine();
        return adminValidation(adminName, password);
    }

    public boolean adminValidation(String adminName, String password) {
        if (adminName.equals(admin.getUsername())) {
            return password.equals(admin.getPassword());
        }
        return false;
    }

    public boolean blockUser(String username, String password) {
        if (getNewUsers().containsKey(username)) {
            if (getNewUserPassword(username).equals(password)) {
                getNewUsers().remove(username, password);
                blockedUsers.blockUser(username, password);
                return true;
            }
        }
        return false;
    }

    public HashMap<String, String> getBlockedUsers() {
        return blockedUsers.getBlockedUsers();
    }

    public boolean unblockUser(String username, String password) {
        if (blockedUsers.getBlockedUsers().containsKey(username)) {
            if (blockedUsers.getBlockPassword(username).equals(password)) {
                getNewUsers().put(username, password);
                blockedUsers.getBlockedUsers().remove(username, password);
                return true;
            }
        }
        return false;
    }

    public void confirmOrder(int i) {
        if (i < ordersDB.getOrders().size() && i >= 0) {
            confirmedOrders.confirmOrder((ArrayList) ordersDB.getOrders().get(i));
        } else {
            System.out.println("Order not found.");
        }
    }

    public void unconfirmOrder(int i) {
        if (i < confirmedOrders.getConfirmedOrders().size() && i >= 0) {
            confirmedOrders.getConfirmedOrders().remove(i);
        } else {
            System.out.println("Order not found.");
        }

    }

    public void getConfirmedOrders() {
        for (int i = 0 ; i < confirmedOrders.getConfirmedOrders().size() ; i++) {
            System.out.println((i + 1) + ". " + confirmedOrders.getConfirmedOrders().get(i) + ". " + true);
        }
    }

}
