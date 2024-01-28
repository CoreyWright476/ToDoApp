package com.app.todo.controllers;

import com.app.todo.models.TodoModel;
import com.app.todo.service.TodoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("todo")
public class TodoController {

    TodoService todoService;

    @PostMapping("add")
    public ResponseEntity<Map<String, String>> addTodo(@RequestBody List<TodoModel> newTodos){
        List<TodoModel> savedTodos = todoService.addTodo(newTodos);

        return null;
    }
}
