package com.b2b.spring.boot.demo.Client;

import com.b2b.spring.boot.demo.Entity.TodoRecord;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Set;

@FeignClient(url = "https://jsonplaceholder.typicode.com/todos", value= "todos")
public interface FeignInterface {

    @GetMapping()
    Set<TodoRecord> getTodos();
}
