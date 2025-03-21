package com.b2b.spring.boot.demo.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class TodoRecord {

    private Long userId;
    private Long id;
    private String title;
    private Boolean completed;

}
