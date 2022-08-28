package dao;

import java.util.HashMap;

public class BlockedUsers {

    private static BlockedUsers blockedUsersObject;

    private BlockedUsers () {

    }

    public static BlockedUsers getInstance() {
        if(blockedUsersObject == null) {
            blockedUsersObject = new BlockedUsers();
        }
        return blockedUsersObject;
    }

    private HashMap<String, String> blockedUsers = new HashMap<>();

    public HashMap<String, String> getBlockedUsers() {
        return blockedUsers;
    }

    public void blockUser(String username, String password) {
        blockedUsers.put(username, password);
    }

    public String getBlockPassword(String username) {
        return blockedUsers.get(username);
    }

    public String getBlockedPassword(String name) {
        return blockedUsers.get(name);
    }
}
