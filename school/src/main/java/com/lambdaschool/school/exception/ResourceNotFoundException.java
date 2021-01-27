package com.lambdaschool.school.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException
{
    public ResourceNotFoundException(String message)
    {
        super(message + " Please Try Again ");
    }

    public ResourceNotFoundException(String message,
                                     Throwable cause)
    {
        super(message + " Please Try Again ",
              cause);
    }
}
