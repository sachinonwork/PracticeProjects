package co.in.imager.model;


import org.springframework.stereotype.Component;

import java.util.Objects;

@Component
public class User {

    private String userId;
    private String password;

    public User() {

    }
    public User(String user, String password) {
        this.userId = user;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return Objects.equals(userId, user.userId) &&
                Objects.equals(password, user.password);
    }

    @Override
    public int hashCode() {

        return Objects.hash(userId, password);
    }
}

