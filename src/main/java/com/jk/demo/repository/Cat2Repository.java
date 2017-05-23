package com.jk.demo.repository;

import com.jk.demo.bean.Cat;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;


/**
 * Created by dell on 2017/5/22.
 */
public interface Cat2Repository extends Repository<Cat, Integer> {

    /**
     * 1.查询方法以 get | find | read 开头
     * 2.涉及查询条件时，条件的属性用条件关键字连接，要注意的是条件属性以首字母大写
     */

    //根据catName进行查询
    public Iterable<Cat> findByCatName(String catName);

    /**
     * 如何缩写JPQL语句
     * Hibernate -- HQL语句
     * JPQL语句和HQL语句类似
     */
    @Query("from Cat where catName=:cn")
    public Iterable<Cat> findMyCatName(@Param("cn")String catName);
}
