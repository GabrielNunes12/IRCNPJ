package com.ircnpj.demo.Services;

import com.ircnpj.demo.Models.User;
import com.ircnpj.demo.Repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.Objects;
import java.util.Optional;

@Service
public class UserService {
  private UserRepository userRepository;
  public User getUser(Long id) {
    User user = userRepository.findById(id).orElseThrow();
    return user;
  }

  public User createUser(User user) throws Exception {
    if(Objects.isNull(user)) {
      throw new Exception("User is null!");
    }
    User newUser = new User();
    user.setCnpj(user.getCnpj());
    user.setOccupation(user.getOccupation());
    user.setSalary(user.getSalary());
    userRepository.save(newUser);
    return newUser;
  }
}
