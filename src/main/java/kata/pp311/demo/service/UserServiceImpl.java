package kata.pp311.demo.service;

import kata.pp311.demo.model.User;
import kata.pp311.demo.repository.UserRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {this.userRepository = userRepository;}

    @Override
    public List<User> allUsers() {return userRepository.findAll();}

    @Override
    public void add(User user) {userRepository.save(user);}

    @Override
    public void delete(Long id) {userRepository.deleteById(id);}

    @Override
    public User getById(Long id) {return userRepository.findById(id).orElse(null);}
}