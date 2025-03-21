package com.b2b.spring.boot.demo.EsercizioSecurity.controller.api;

import com.b2b.spring.boot.demo.service.implementation.AuthenticationServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor  //Crea un costruttore solo per i final
public class AuthenticationController implements AuthenticationAPI {

    private final AuthenticationServiceImpl authenticationService;

    @Override
    public String login(String username, String password) {
        return this.authenticationService.login(username, password);
    }

    @Override
    public String userEnd(String role) {
        return "";
    }

    @Override
    public String adminEnd(String role) {
        return "";
    }

}
