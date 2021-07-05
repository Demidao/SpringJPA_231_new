package com.demidao.dao;

import com.demidao.models.User;
import org.springframework.stereotype.Repository;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class UserDAOImpl implements UserDAO {

    @PersistenceContext
    private EntityManager em;

    @Override
    public List<User> index() {
        return em.createQuery("select u from User u", User.class)
                .getResultList();

    }

    @Override
    public User show(long id) {
//        em.getTransaction().begin();
//        User out = em.find(User.class, id);
//        em.getTransaction().commit();
        return null;
    }

    @Override
    public void save(User user) {
//        em.persist(user);
//        em.flush();
    }

    @Override
    public void update(long id, User newUser) {
//        em.getTransaction().begin();
//        User updatedUser = em.find(User.class, show(id));
//        updatedUser.setName(newUser.getName());
//        updatedUser.setLastname(newUser.getLastname());
//        updatedUser.setAge(newUser.getAge());
//        updatedUser.setEmail(newUser.getEmail());
//        em.getTransaction().commit();
    }

    @Override
    public void delete(long id) {
//        em.getTransaction().begin();
//        em.remove(em.find(User.class, id));
//        em.getTransaction().commit();
    }
}
