package com.niceinfoshop.test.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.niceinfoshop.test.model.User;

@Mapper
public interface UserMapper {
	List<User> getUserAll();
	List<User> getUserAll2();
    User getUserById(Long id);
    void insertUser(User user);
    void insertUser2(User user);
    void updateUser(User user);
    void deleteUser(Long id);
}