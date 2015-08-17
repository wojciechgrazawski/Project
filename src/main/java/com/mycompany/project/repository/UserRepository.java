package com.mycompany.project.repository;

import com.mycompany.project.entities.User;

/**
 * Created by wojciech on 13.08.15.
 */
public interface UserRepository {
    void save(User user);
    User findUserByEmail(String email);
    boolean changeUserPasword(String email,String oldpassword, String newpassword);
}
