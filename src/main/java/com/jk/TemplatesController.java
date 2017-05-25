package com.jk;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

/**
 * Created by dell on 2017/5/24.
 */

/**
 * 注意在thymeleafd模版文件中，标签是需要闭合的，3.0之前
 * 3.0之后不强制要求闭合
 *
 * 支持同时使用多个模版引擎，比如thymeleaf和freemarker可以并存。
 */
@Controller
@RequestMapping("/templates")
public class TemplatesController {

    /**
     * 映射地址是：/templates/hello
     */
    @RequestMapping("/hello")
    public String hello(Map<String, Object> map){
        map.put("name","lzh");
//        ModelAndView mv = new ModelAndView();
//        mv.setViewName("hello");
        return "hello";
    }

    @RequestMapping("/helloFtl")
    public String helloFtl(Map<String, Object> map){
        map.put("name","lzh");
        return "helloFtl";
    }
}
