package com.zhan.raml.controller;


import com.zhan.raml.api.model.Todo;
import com.zhan.raml.rest.TodoController;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * Created by zhanyanjun on 2018/5/4.
 */
@Component
public class TodoControllerImpl implements TodoController {

    private static List<Todo> todos = new ArrayList<>();

    static {
        Todo todo1 = new Todo();
        todo1.setId(1);
        todo1.setTask("task1");
        todo1.setPriority(1);

        Todo todo2 = new Todo();
        todo2.setId(2);
        todo2.setTask("task2");
        todo2.setPriority(2);

        todos.add(todo1);
        todos.add(todo2);
    }

    @Override
    public ResponseEntity getTodos() {
        return ResponseEntity.ok(todos);
    }

    @Override
    public ResponseEntity createTodo(@RequestBody Todo todo) {
        Optional<Todo> existingTodo = todos.stream().filter(t -> t.getId().equals(todo.getId())).findFirst();
        if (existingTodo.isPresent()) {
            todos.remove(existingTodo.get());
            todos.add(todo);
            return ResponseEntity.ok().build();
        }
        int id = todos.stream().map(Todo::getId).sorted().findFirst().orElse(0) + 1;
        todo.setId(id);
        todos.add(todo);
        /*URI uri = UriComponentsBuilder.fromPath("/api/todos/{id}").buildAndExpand(id).toUri();
        return ResponseEntity.created(uri).build();*/
        return ResponseEntity.ok(todo);
    }
}
