package com.demidao.service;

import com.demidao.dao.UserDAO;
import com.demidao.dao.UserDAOImpl;
import com.demidao.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    UserDAO dao = new UserDAOImpl();

    @Override
    public List<User> index() {
        return dao.index();
    }

    @Override
    public User show(long id) {
        return dao.show(id);
    }

    @Override
    public void save(User user) {
        dao.save(user);
    }

    @Override
    public void update(long id, User newUser) {
        dao.update(id, newUser);
    }

    @Override
    public void delete(long id) {
        dao.delete(id);
    }
}
