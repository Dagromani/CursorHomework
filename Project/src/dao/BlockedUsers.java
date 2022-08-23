package dao;

import java.util.HashMap;

public class BlockedUsers {

    private HashMap<String , String> blockedUsers = new HashMap<>();

    public HashMap<String , String> getBlockedUsers() {
        return blockedUsers;
    }

    public void blockUser(String username, String password) {
        blockedUsers.put(username , password);
    }

    public String getBlockPassword (String username) {
        return blockedUsers.get(username);
    }
}
