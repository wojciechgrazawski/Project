package com.mycompany.project.services;

import com.mycompany.project.entities.User;
import com.mycompany.project.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

/**
 * Created by wojciech on 13.08.15.
 */
@Service
public class UserServiceImpl implements  UserService{

    private UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    @Transactional
    public void saveUser(User user) {
      userRepository.save(user);
    }

    @Override
    @Transactional
    public boolean findUser(User user) {
        if(userRepository.findUserByEmail(user.getEmail())==null)
        {
            return false;
        }
        return true;
    }
    @Override
    @Transactional
    public boolean checkLoginUser(User user) {
        User user1 = userRepository.findUserByEmail(user.getEmail());
        if(user1!=null)
        {
            if(!user1.getPassword().equals(user.getPassword()))
            {
                return false;
            } else {
                return true;
            }
        }
        return false;
    }

    @Override
    @Transactional
    public boolean changeUserPassword(String userEmail, String oldpassword, String newpassword) {
       return userRepository.changeUserPasword(userEmail,oldpassword,newpassword);
    }
}