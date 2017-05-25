package com.jk.config;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * 1.新建一个class，这里取名GlobalDefaultExceptionHandler
 * 2.在class上添加注解，@ControllerAdvice
 * 3.在class中添加一个方法
 * 4.在方法上添加@ExcetionHandler拦截相应的异常信息
 * 5.如果返回的是View -- 方法的返回值是ModelAndView
 * 6.如果返回的是String或者是Json数据，那么需要在方法上添加@ResponseBody
 */
@ControllerAdvice
public class GlobalDefaultExceptionHandler {

    @ResponseBody
    @ExceptionHandler(Exception.class)
    public String defaultExceptionHandler(HttpServletRequest req,Exception e){
        //返回的是String
        return "对不起，服务器繁忙。";
    }
}
