package com.xxx.common;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLIntegrityConstraintViolationException;

/**
 * 全局异常处理
 */


@ControllerAdvice(annotations = {RestController.class, Controller.class})//只要类上加了@RestController和@Controller注解的就会被捕获
@ResponseBody
@Slf4j
public class GlobalExceptionHandler {

    /**
     * 异常处理方法
     * @return
     */
    @ExceptionHandler(SQLIntegrityConstraintViolationException.class)
    public com.xxx.common.R<String> exceptionHandler(SQLIntegrityConstraintViolationException ex){
        log.error(ex.getMessage());

        if(ex.getMessage().contains("Duplicate entry")){
            String[] split = ex.getMessage().split(" ");
            String msg = split[2] + "已存在";
            return com.xxx.common.R.error(msg);
        }

        return com.xxx.common.R.error("未知错误");
    }

    /**
     * 异常处理方法
     * @return
     */
//    @ExceptionHandler(CustomException.class)
//    public com.xxx.common.R<String> exceptionHandler(CustomException ex){
//        log.error(ex.getMessage());
//
//        return com.xxx.common.R.error(ex.getMessage());
//    }

}
