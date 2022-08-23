package services;

import dao.Admin;
import dao.BlockedUsers;
import dao.UsersDB;

import java.util.HashMap;
import java.util.Scanner;

public class Validation {
    private BlockedUsers blockedUsers = new BlockedUsers();
    private UsersDB usersDB = new UsersDB();
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
        if (userValidation(name , password) == true) {
            return true;
        } else {
            return false;
        }

    }

    public void registerNewUser(){
        System.out.println("Enter user name:");
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        System.out.println("Enter password:");
        String password = scan.nextLine();
        usersDB.addUser(name , password);
    }

    public boolean userValidation(String name , String password){
        if (usersDB.getUsers().containsKey(name)) {
            if (usersDB.getUserPassword(name).equals(password)) {
                return true;
            } else {
                return false;
            }
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
        if (adminValidation(adminName , password) == true) {
            return true;
        } else {
            return false;
        }
    }

    public boolean adminValidation(String adminName , String password) {
        if (adminName.equals(admin.getUsername())) {
            if (password.equals(admin.getPassword())) {
                return true;
            }
        }
        return false;
    }

    public boolean blockUser(String username , String password) {
        if (getNewUsers().containsKey(username)) {
            if (getNewUserPassword(username).equals(password)) {
                getNewUsers().remove(username , password);
                blockedUsers.blockUser(username , password);
                return true;
            }
        }
        return false;
    }

    public HashMap<String , String> getBlockedUsers() {
        return blockedUsers.getBlockedUsers();
    }

    public boolean unblockUser (String username , String password) {
        if (blockedUsers.getBlockedUsers().containsKey(username)) {
            if (blockedUsers.getBlockPassword(username).equals(password)) {
                getNewUsers().put(username , password);
                blockedUsers.getBlockedUsers().remove(username, password);
                return true;
            }
        }
        return false;
    }


}
