package com.demidao.service;

import com.demidao.models.User;

import java.util.List;

public interface UserService {

    public List<User> index();

    public User show(long id);

    public void save(User user);

    public void update(long id, User newUser);

    public void delete(long id);

}
