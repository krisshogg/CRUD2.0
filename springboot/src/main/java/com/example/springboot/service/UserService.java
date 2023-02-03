package com.example.springboot.service;

import com.example.springboot.model.User;
import com.example.springboot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    public User show(int id) {
        return userRepository.getOne(id);
    }


    public List<User> index() {
        return userRepository.findAll();
    }


    public void save(User user) { userRepository.save(user); }

    /*@Override
    public void update(int id, User updateUser) { userRepository.update(id, updateUser); }*/

    public void delete(int id) { userRepository.deleteById(id); }

}