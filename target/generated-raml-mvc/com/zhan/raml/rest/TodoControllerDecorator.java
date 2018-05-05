
package com.zhan.raml.rest;

import javax.validation.Valid;
import com.zhan.raml.api.model.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


/**
 * The Todos resource.
 * (Generated with springmvc-raml-parser v.0.8.6)
 * 
 */
@RestController
@RequestMapping(value = "/todos", produces = "application/json")
public class TodoControllerDecorator
    implements TodoController
{

    @Autowired
    private TodoController todoControllerDelegate;

    /**
     * Returns a list of todos.
     * 
     */
    @RequestMapping(value = "", method = RequestMethod.GET)
    public ResponseEntity<?> getTodos() {
        return this.todoControllerDelegate.getTodos();
    }

    /**
     * Generate a new todo.
     * 
     */
    @RequestMapping(value = "", method = RequestMethod.POST)
    public ResponseEntity<?> createTodo(
        @Valid
        @RequestBody
        Todo todo) {
        return this.todoControllerDelegate.createTodo(todo);
    }

}
