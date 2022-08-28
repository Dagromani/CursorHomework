package dao;

import java.util.HashMap;

public class UsersDB {
    private static UsersDB usersDBObject;

    private HashMap<String, String> users = new HashMap<>();

    private UsersDB () {
    }

    public static UsersDB getInstance() {
        if(usersDBObject == null) {
            usersDBObject = new UsersDB();
        }
        return usersDBObject;
    }

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
