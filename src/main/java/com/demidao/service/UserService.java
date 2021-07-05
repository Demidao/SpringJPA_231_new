package com.demidao.service;

import com.demidao.models.User;

import java.util.List;

public interface UserService {

    List<User> index();

    User show(long id);

    void save(User user);

    void update(long id, User newUser);

    void delete(long id);
}
