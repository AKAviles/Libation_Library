package com.aaviles.cocktail.service;

import com.aaviles.cocktail.models.User;

import java.util.List;

public interface UserService {
    User saveUser(User user);
    List<User> getAllUsers();
    User getUserById(Long id);



    User getUserByEmail(String email);
    User updateUser(User user, Long id);
    void deleteUser(Long id);
}
