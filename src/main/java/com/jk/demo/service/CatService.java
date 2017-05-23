package com.jk.demo.service;

import com.jk.demo.bean.Cat;
import com.jk.demo.repository.Cat2Repository;
import com.jk.demo.repository.CatRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.transaction.Transactional;

/**
 * Created by dell on 2017/5/22.
 */
@Service
public class CatService {

    @Resource
    private CatRepository catRepository;

    @Resource
    private Cat2Repository cat2Repository;

    /**
     * save,update,delete 方法需要绑定事务
     *
     * 使用@Transactional进行事务的绑定
     */
    //数据保存
    @Transactional
    public void save(Cat cat){
        catRepository.save(cat);
    }

    //删除数据
    @Transactional
    public void delete(Integer id){
        catRepository.delete(id);
    }

    //修改数据
    @Transactional
    public void update(){

    }

    //获取数据
    public Iterable<Cat> getAll(){
        return catRepository.findAll();
    }

    //根据catName进行查询
    public Iterable<Cat> findByCatName(String catName){
        Iterable<Cat> cats = cat2Repository.findByCatName(catName);
        return cats;
    }

    public Iterable<Cat> findMyCatName(String cn){
        System.out.println("This is mySelect.");
        return cat2Repository.findMyCatName(cn);
    }
}
