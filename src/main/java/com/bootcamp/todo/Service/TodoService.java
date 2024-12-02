package com.bootcamp.todo.Service;

import com.bootcamp.todo.Model.Todo;
import com.bootcamp.todo.Repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {
    @Autowired
    private final TodoRepository todoRepository;

    public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }
    public List<Todo> findAll() {
        return todoRepository.findAll();
    }
}
