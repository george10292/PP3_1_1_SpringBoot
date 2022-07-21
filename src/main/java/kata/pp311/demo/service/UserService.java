package kata.pp311.demo.service;

import kata.pp311.demo.model.User;

import java.util.List;

public interface UserService {
    List<User> allUsers();

    void add(User user);

    void delete(Long id);

    User getById(Long id);
}