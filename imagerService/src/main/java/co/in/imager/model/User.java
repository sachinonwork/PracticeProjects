package co.in.imager.model;


import org.springframework.stereotype.Component;


@Component
public class User {

    private String userId;
    private String password;

    public User(String userName, String password) {
        this.userId = userName;
        this.password = password;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

