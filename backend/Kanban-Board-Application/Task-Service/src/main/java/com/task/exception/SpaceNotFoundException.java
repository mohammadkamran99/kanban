package com.task.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND,reason = "Space Not Found")
public class SpaceNotFoundException extends Exception{
    public SpaceNotFoundException(String sdmskdne) {
    }
}
