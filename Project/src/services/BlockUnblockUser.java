package services;

import dao.BlockedUsers;
import dao.UsersDB;

public class BlockUnblockUser {
    private Validation validation = new Validation();
    private BlockedUsers blockedUsers = new BlockedUsers();

    public boolean blockUser(String username , String password) {
        if (validation.getNewUsers().containsKey(username)) {
            if (validation.getNewUserPassword(username).equals(password)) {
                validation.getNewUsers().remove(username , password);
                blockedUsers.blockUser(username , password);
                return true;
            }
        }
        return false;
    }

    public boolean unblockUser (String username , String password) {
        if (blockedUsers.getBlockedUsers().containsKey(username)) {
            if (blockedUsers.getBlockPassword(username).equals(password)) {
                validation.getNewUsers().put(username , password);
                blockedUsers.getBlockedUsers().remove(username, password);
                return true;
            }
        }
        return false;
    }
}
