
package com.zhan.raml.rest;

import com.zhan.raml.api.model.Todo;
import org.springframework.http.ResponseEntity;


/**
 * The Todos resource.
 * (Generated with springmvc-raml-parser v.0.8.6)
 * 
 */
public interface TodoController {


    /**
     * Returns a list of todos.
     * 
     */
    public ResponseEntity<?> getTodos();

    /**
     * Generate a new todo.
     * 
     */
    public ResponseEntity<?> createTodo(Todo todo);

}
