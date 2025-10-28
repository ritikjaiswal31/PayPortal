package com.payportal.user_service.service;

import com.payportal.user_service.entity.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

    User createUser(User user);
    Optional<User> getUserById(Long id);
    List<User> getAllUser();
}
