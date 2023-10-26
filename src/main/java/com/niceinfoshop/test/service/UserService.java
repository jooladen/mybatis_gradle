package com.niceinfoshop.test.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.niceinfoshop.test.model.User;

//@Service
public interface UserService {
	List<User> getUserAll();
	List<User> getUserAll2();
    User getUserById(Long id);
    void createUser(User user);
    void createUser2(User user);
    void updateUser(User user);
    void deleteUser(Long id);
}