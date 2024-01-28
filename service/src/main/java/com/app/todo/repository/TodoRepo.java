package com.app.todo.repository;

import com.app.todo.models.TodoModel;
import org.springframework.data.jpa.repository.JpaRepository;


public interface TodoRepo extends JpaRepository<TodoModel, Long> {
}
