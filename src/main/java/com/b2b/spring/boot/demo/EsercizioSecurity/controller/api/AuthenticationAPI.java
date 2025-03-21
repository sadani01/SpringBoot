package com.b2b.spring.boot.demo.EsercizioSecurity.controller.api;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping("/api/auth")
public interface AuthenticationAPI {

    @GetMapping("/login") //endpoint di login
    String login(@RequestParam String username, @RequestParam String password); //richiede 2 parametri

    @PreAuthorize("hasRole('USER')")
    @GetMapping("/userEnd")
    String userEnd(String role);

    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping("/adminEnd")
    String adminEnd(String role);
}
