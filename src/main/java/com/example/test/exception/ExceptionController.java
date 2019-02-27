package com.example.test.exception;

import org.springframework.boot.autoconfigure.web.servlet.error.AbstractErrorController;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
public class ExceptionController {

    @ResponseBody
    @ExceptionHandler(RuntimeException.class)
    public String defaultExceptionHandler(HttpServletRequest req, Exception e) {
        return "哈哈,报错了";
    }


}
