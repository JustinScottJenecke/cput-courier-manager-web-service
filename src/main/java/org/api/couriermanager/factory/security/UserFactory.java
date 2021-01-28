package org.api.couriermanager.factory.security;

import org.api.couriermanager.entity.security.User;

public class UserFactory {

    public static User createUser(String userID,
                                  String userName,
                                  String userPassword,
                                  boolean active,
                                  String roles,
                                  String permissions){

        User user = new User.Builder()
                .setUserID(userID)
                .setUserName(userName)
                .setUserPassword(userPassword)
                .setActive(active)
                .setRoles(roles)
                .setPermissions(permissions)
                .build();

        return user;

    }
}
