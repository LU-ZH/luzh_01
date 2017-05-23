package com.jk.demo.controller;

import com.jk.demo.bean.Cat;
import com.jk.demo.service.CatService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by dell on 2017/5/22.
 */
@RestController
@RequestMapping("/cat")
public class CatController {

    @Resource
    private CatService catService;

    @RequestMapping("/save")
    public String save(){
        Cat cat = new Cat();
        cat.setCatAge(3);
        cat.setCatName("jack");
        catService.save(cat);
        return "save ok.";
    }

    @RequestMapping("/delete")
    public String delete(){
        catService.delete(1);
        return "delete ok.";
    }

    @RequestMapping("/getAll")
    public Iterable<Cat> getAll(){
        Iterable<Cat> cats = catService.getAll();
        return cats;
    }

    @RequestMapping("/findByCatName")
    public Iterable<Cat> findByCatName(String catName){
        Iterable<Cat> cats = catService.findByCatName(catName);
        return cats;
    }

    @RequestMapping("/findMyCatName")
    public Iterable<Cat> findMyCatName(String cn){
        Iterable<Cat> cats = catService.findMyCatName(cn);
        return cats;
    }
}
