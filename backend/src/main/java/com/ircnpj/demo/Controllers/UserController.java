package com.ircnpj.demo.Controllers;

import com.ircnpj.demo.Models.User;
import com.ircnpj.demo.Services.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller(value = "api/v1/user")
public class UserController {
  private UserService userService;

  @GetMapping
  public User getUser(Long idUser) {
    User user = userService.getUser(idUser);
    return user;
  }
  @PostMapping
  public ResponseEntity<?> createUser(User user) throws Exception {
    return ResponseEntity.ok().body(userService.createUser(user));
  }
}
