package com.descomplica.FrameBlog.services.impl;

import com.descomplica.FrameBlog.models.User;
import com.descomplica.FrameBlog.repositories.UserRepository;
import com.descomplica.FrameBlog.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User save(final User user) {
        User existingUser = userRepository.findByUsername(user.getNome());
        if (Objects.nonNull(existingUser)) {
            throw new RuntimeException("Usuario Existente");
        }
        User newUser = new User(user.getId(), user.getNome(), user.getEmail(), user.getPassword(), user.getRole());
        newUser = userRepository.save(newUser);
        return newUser;
    }
}