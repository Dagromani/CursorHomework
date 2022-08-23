package dao;

import java.util.HashMap;

public class UsersDB {

    private HashMap<String, String> users = new HashMap<>();

    public HashMap<String, String> getUsers() {
        return users;
    }

    public void addUser(String name, String password) {
        users.put(name, password);
    }

    public String getUserPassword(String name) {
        return users.get(name);
    }




}
