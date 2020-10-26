package app.models;

import java.util.List;

public class UserViewModel {
    private String username;
    private String fullName;
    private List<String> allUsers;
    private boolean isLogged;
    private boolean isAdministrator;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public List<String> getAllUsers() {
        return allUsers;
    }

    public void setAllUsers(List<String> allUsers) {
        this.allUsers = allUsers;
    }

    public boolean isLogged() {
        return isLogged;
    }

    public void setLogged(boolean logged) {
        isLogged = logged;
    }

    public boolean isAdministrator() {
        return isAdministrator;
    }

    public void setAdministrator(boolean administrator) {
        isAdministrator = administrator;
    }

    public UserViewModel(String username, String fullName, List<String> allUsers, boolean isLogged, boolean isAdministrator) {
        this.username = username;
        this.fullName = fullName;
        this.allUsers = allUsers;
        this.isLogged = isLogged;
        this.isAdministrator = isAdministrator;


    }
}
