package org.example.factory.security;

import org.example.entity.security.User;

public class userFactory {

    public static User createUser(int userID,
                                  String userName,
                                  String userPassword,
                                  boolean active,
                                  String roles){

        User user = new User.Builder()
                .setUserID(userID)
                .setUserPassword(userPassword)
                .setActive(active)
                .setRoles(roles)
                .build();

        return user;

    }
}
