package com.b2b.spring.boot.demo.EsercizioSecurity.service;

public interface AuthenticationService {

    String userEnd(String role);

    String adminEnd(String role);
}
