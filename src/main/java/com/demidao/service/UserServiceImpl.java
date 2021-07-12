package com.demidao.service;

import com.demidao.models.User;
import com.demidao.util.FishData;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @PersistenceContext
    private EntityManager em;

    @Override
    public List<User> index() {
        List<User> out = em.createQuery("from User u", User.class)
                .getResultList();
        if (out.isEmpty()) {
            for (User user : FishData.getInitUserList()) {
                save(user);
            }
            out = FishData.getInitUserList();
        }
        return out;
    }

    @Override
    public User show(long id) {
        return em.find(User.class, id);
    }

    @Override
    public void save(User user) {
        em.persist(user);
        em.flush();
    }

    @Override
    public void update(long id, User newUser) {
        em.merge(newUser);
        em.flush();
    }

    @Override
    public void delete(long id) {
        User user = show(id);
        if (user == null) {
            throw new NullPointerException("User with id=" + id + " not found");
        }
        em.remove(user);
        em.flush();
    }
}
