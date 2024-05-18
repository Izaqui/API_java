package com.example.project_dev.service;

import com.example.project_dev.dominio.model.User;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);
}