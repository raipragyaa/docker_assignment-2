package com.assignment.todo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TodoController {

  @RequestMapping("/todo")
  public String todos() {
    return "{my todos: { first : Complete assignments}";
  }
}
