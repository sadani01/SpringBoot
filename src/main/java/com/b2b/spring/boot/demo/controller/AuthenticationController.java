package com.b2b.spring.boot.demo.controller;

import com.b2b.spring.boot.demo.controller.api.AuthenticationAPI;
import com.b2b.spring.boot.demo.service.implementation.AuthenticationServiceImpl;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor  //Crea un costruttore solo per i final
public class AuthenticationController implements AuthenticationAPI {

  private final AuthenticationServiceImpl authenticationService;

    @Override
  public String login(String username, String password) {
    return this.authenticationService.login(username, password);
  }

}
