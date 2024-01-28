package com.app.todo.service;

import com.app.todo.models.TodoModel;
import com.app.todo.repository.TodoRepo;

import java.util.List;

public class TodoService {

    private final TodoRepo todoRepo;

    public TodoService (TodoRepo todoRepo){
        this.todoRepo = todoRepo;
    }

    public List<TodoModel> addTodo(List<TodoModel> newTodos){
        return todoRepo.saveAll(newTodos);
    }
}
