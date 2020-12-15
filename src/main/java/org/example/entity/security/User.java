package org.example.entity.security;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {

    // @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private int userID;

    private String userName;
    private String userPassword;
    private boolean active;
    private String roles;

    protected User() {
    }

    private User(Builder b) {
        this.userID = b.userID;
        this.userName = b.userName;
        this.userPassword = b.userPassword;
        this.active = b.active;
        this.roles = b.roles;
    }

    public int getUserID() {
        return userID;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public boolean isActive() {
        return active;
    }

    public String getRoles() {
        return roles;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "adminUserID='" + userID + '\'' +
                ", adminUsername='" + userName + '\'' +
                ", adminPassword='" + userPassword + '\'' +
                ", active=" + active +
                ", roles='" + roles + '\'' +
                '}';
    }

    public static class Builder{

        @GeneratedValue(strategy = GenerationType.AUTO)
        private int userID;

        private String userName;
        private String userPassword;
        private boolean active;
        private String roles;

        public Builder setUserID(int userID) {
            this.userID = userID;
            return this;
        }

        public Builder setUserName(String userName) {
            this.userName = userName;
            return this;
        }

        public Builder setUserPassword(String userPassword) {
            this.userPassword = userPassword;
            return this;
        }

        public Builder setActive(boolean active) {
            this.active = active;
            return this;
        }

        public Builder setRoles(String roles) {
            this.roles = roles;
            return this;
        }

        public Builder copy(User a){

            this.userID = a.userID;
            this.userName = a.userName;
            this.userPassword = a.userPassword;
            this.active =a.active;
            this.roles = a.roles;

            return this;
        }

        public User build() {
            return new User(this);
        }

    }
}
