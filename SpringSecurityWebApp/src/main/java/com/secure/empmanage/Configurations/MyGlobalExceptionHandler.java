package com.secure.empmanage.Configurations;

import org.springframework.http.HttpStatus;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.NoHandlerFoundException;

@ControllerAdvice
public class MyGlobalExceptionHandler {

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(EmployeeNotFound.class)
    public String notFound() {
        return "errorpage";
    }

    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler(NoHandlerFoundException.class)
    public String pageNotFound() {
        return "pagenotfound";
    }

    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler(HttpRequestMethodNotSupportedException.class)
    public String methodNotSupported()
    {
        return "pagenotfound";
    }

    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler(BugNotFound.class)
    public String bugNotFound()
    {
        return "errorpage";
    }

    @ResponseBody
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(EmployeeAlreadyExists.class)
    public String alreadyExists()
    {
        return "Employee Already Exists";
    }
}
