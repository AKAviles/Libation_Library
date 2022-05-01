package com.aaviles.cocktail.service.impl;

import com.aaviles.cocktail.exceptions.ResourceNotFoundException;
import com.aaviles.cocktail.models.User;
import com.aaviles.cocktail.repository.UserRepository;
import com.aaviles.cocktail.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UserServiceImpl() {
    }

    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User getUserById(Long id) {
        return userRepository.findById(id).orElseThrow(() ->
                new ResourceNotFoundException("User", "Id", id));
    }

    @Override
    public User getUserByEmail(String email) {
        return userRepository.findByEmailIs(email);
    }

    @Override
    @Transactional
    public User updateUser(User user, Long id) {
        // check if user with given ID is existing in db
        User existingUser = getUserById(id);
        existingUser.setUsername(user.getUsername());
        existingUser.setName(user.getName());
        existingUser.setEmail(user.getEmail());
        existingUser.setPassword(user.getPassword());
        existingUser.setAge(user.getAge());
        existingUser.setGender(user.getGender());
        // save existingUser to db
        userRepository.save(existingUser);
        return existingUser;
    }

    @Override
    public void deleteUser(Long id) {
        // check if user with given ID is existing in db
        User existingUser = getUserById(id);
        userRepository.delete(existingUser);
    }

    //TODO: Add methods to add/delete/update posts, favorite cocktails, and comments
}
