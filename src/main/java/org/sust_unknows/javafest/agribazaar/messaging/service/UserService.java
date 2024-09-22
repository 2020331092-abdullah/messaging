package org.sust_unknows.javafest.agribazaar.messaging.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.sust_unknows.javafest.agribazaar.messaging.model.User;
import org.sust_unknows.javafest.agribazaar.messaging.repository.UserRepository;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public Optional<User> getUserById(String id) {
        return userRepository.findById(id);
    }

    public User saveUser(User user) {
        user.setChatIds(List.of()); // Initialize with an empty chat list
        System.out.println("User saved: " + user.getChatIds());
        return userRepository.save(user);
    }
}
