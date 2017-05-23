package com.jk;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.UnsupportedEncodingException;
import java.util.Date;

/**
 * Created by dell on 2017/5/18.
 */

/**
 * @RestController
 * 等于@Controller 和 @RequestBody
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello(){
        return "Hello world.";
    }

    //SpringBoot默认使用json解析框架jackson
    @RequestMapping("getDemo")
    public Demo getDemo(){
        Demo demo = new Demo();
        demo.setId(1);
        demo.setName("王五");
        demo.setCreatTime(new Date());
        demo.setRemarks("这是备注");
        return demo;
    }

    @RequestMapping("/hello2")
    public String hello2(){
        return "Hello world.2017.5";
    }

    @RequestMapping("/hello3")
    public String hello3(){
        return "Hello world.2017.5.22";
    }
}
//-javaagent:.\lib\springloaded-1.2.4.RELEASE.jar -noverify
//这是loader的配置