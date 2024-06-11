package me.sairu.service;

import me.sairu.domain.model.User;

public interface UserService {
    User findById(Long id);
    User create(User userToCreate);
}
