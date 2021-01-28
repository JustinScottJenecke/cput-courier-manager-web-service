package org.api.couriermanager.entity.security;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Entity
public class User {

    // @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private String userID;

    @Column(nullable = false)
    private String userName;

    @Column(nullable = false)
    private String userPassword;

    private boolean active;
    private String roles;
    private String permissions;

    protected User() {
    }

    private User(Builder b) {
        this.userID = b.userID;
        this.userName = b.userName;
        this.userPassword = b.userPassword;
        this.active = b.active;
        this.roles = b.roles;
        this.permissions = b.permissions;
    }

    public String getUserID() { return userID; }

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

    public String getPermissions() {
        return permissions;
    }

    public List<String> getListOfRoles(){
        if (this.roles.length() > 0) {
            return Arrays.asList(this.roles.split(","));
        }
        return new ArrayList<>();
    }

    public List<String> getListOfPermissions(){
        if (this.permissions.length() > 0) {
            return Arrays.asList(this.permissions.split(","));
        }
        return new ArrayList<>();
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
        private String userID;

        private String userName;
        private String userPassword;
        private boolean active;
        private String roles;
        private String permissions;

        public Builder setUserID(String userID) {
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
        public Builder setPermissions(String permissions) {
            this.permissions = permissions;
            return this;
        }

        public Builder copy(User a){

            this.userID = a.userID;
            this.userName = a.userName;
            this.userPassword = a.userPassword;
            this.active =a.active;
            this.roles = a.roles;
            this.permissions = a.permissions;

            return this;
        }

        public User build() {
            return new User(this);
        }

    }
}
