package Facade_Pattern;

import java.util.*;

class UserManagement {
    private Map<String, String> userCredentials;

    public UserManagement() {
        userCredentials = new HashMap<String, String>();
        userCredentials.put("username1", "password1");
        userCredentials.put("username2", "password2");
    }

    public boolean authenticateUser(String username, String password) {
        if (userCredentials.containsKey(username)) {
            return userCredentials.get(username).equals(password);
        } else {
            return false;
        }
    }
}
