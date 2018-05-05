package com.zhan.raml.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Created by zhanyanjun on 2018/5/4.
 */
@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "No Todo with given id found")
public class TodoNotFoundException extends RuntimeException {
}
