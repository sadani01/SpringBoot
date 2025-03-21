package com.b2b.spring.boot.demo;

import com.b2b.spring.boot.demo.Client.FeignInterface;
import com.b2b.spring.boot.demo.Entity.TodoRecord;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

import java.util.List;
import java.util.Set;

@SpringBootApplication
@EnableFeignClients
public class Application {

  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);}

    @Autowired
    private FeignInterface feign;

    @PostConstruct
    public void todos(){
      Set<TodoRecord> listaOggetti = feign.getTodos();
      for (TodoRecord oggetto : listaOggetti){
        System.out.println(oggetto);
      }
    }

  }

