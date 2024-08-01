package com.example.job.notification.Service;

import com.example.job.notification.Entity.User;
import com.example.job.notification.Repository.UserRepository;
import org.jvnet.hk2.annotations.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;
@Service

public class UserService {


        @Autowired
        private UserRepository userRepository;

        public List<User> getAllUsers() {
            return userRepository.findAll();
        }

        public Optional<User> getUserById(Long id) {
            return userRepository.findById(id);
        }

        public User saveUser(User user) {
            return userRepository.save(user);
        }

        public void deleteUser(Long id) {
            userRepository.deleteById(id);
        }
    }
