package com.mycompany.project.services;

import com.mycompany.project.entities.User;

/**
 * Created by wojciech on 13.08.15.
 */
public interface UserService {

    void saveUser(User user);
    boolean findUser(User user);
    boolean checkLoginUser(User user);
    boolean changeUserPassword(String userEmail,String oldpassword,String newpassword);
}
