package com.jk;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by dell on 2017/5/22.
 */
@RestController
public class Hello2Controller {

    @RequestMapping("newHello")
    public String newHello(){
        return "hello2";
    }
}
