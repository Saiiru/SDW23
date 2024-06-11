package me.sairu.service;

import me.sairu.domain.model.User;

public interface UserService extends CrudService<Long, User> {
    User findByEmail(String email);
    User findByEmailAndPassword(String email, String password);

}
