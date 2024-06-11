package me.sairu.service.impl;

import me.sairu.domain.model.User;
import me.sairu.domain.repository.UserRepository;
import me.sairu.service.UserService;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User findById(Long id) {
        return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public User create(User userToCreate) {
        if (userToCreate.getId() != null && userRepository.existsById(userToCreate.getId())) {
            throw new IllegalArgumentException("User already exists");
        }
//         else if (userRepository.existsByAccountNumber(userToCreate.getAccountNumber())) {
//            throw new IllegalArgumentException("Account number already exists");
//        }

        return userRepository.save(userToCreate);
    }
}
