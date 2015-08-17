package com.mycompany.project.repository;

import com.mycompany.project.entities.User;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

/**
 * Created by wojciech on 13.08.15.
 */
@Repository
public class JpaUserRepositoryImpl implements  UserRepository {

    @PersistenceContext
    private EntityManager em;

    @Override
    @Transactional
    public void save(User user) {
        this.em.persist(user);
    }

    @Override
    public User findUserByEmail(String email) {
        Query query = this.em.createQuery("SELECT user FROM User user where user.email LIKE :email");
        query.setParameter("email", email);
        List<User> users = query.getResultList();
        if(users.size()==0)
        {
            return null;
        } else {
            return users.get(0);
        }

    }

    @Override
    @Transactional
    public boolean changeUserPasword(String email, String oldpassword, String newpassword) {

        try{
            Query query = this.em.createQuery("SELECT user FROM User user where user.email LIKE :email");
            query.setParameter("email", email);
            User user = (User) query.getSingleResult();
            if(user.getPassword().equals(oldpassword)) {
                try {
                    query = this.em.createQuery("UPDATE User user SET user.password =:newpassword where user.email LIKE :email");
                    query.setParameter("newpassword", newpassword);
                    query.setParameter("email", email);
                    query.executeUpdate();
                    return true;
                } catch (Exception e)
                {
                    System.out.println(e.getMessage());
                    return false;
                }
            }
        } catch (Exception e)
        {
            System.out.println(e.getMessage());
            return false;
        }
       return false;
    }

}
