package com.example.springboot.service;

import com.example.springboot.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

    User show(int id);

    List<User> index();

    User save(User user);

    User update(User user, int id);

    void delete(int id);

}
