package com.jk.demo.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * 创建一个实体类
 *
 * 如何持久化？
 * 1、使用@Entity进行实体类的持久化操作，当JPA检测到我们的实体类当中有
 *    @Entity 注解的时候，会在数据库中生成对应的表结构
 *
 * 如何指定主键以及主键的生成策略？
 * 2、使用@Id指定
 */
@Entity
public class Cat {

    /**
     * 使用@Id指定主键
     *
     * 使用代码@GeneratedValue(strategy = GenerationType.AUTO)
     * 指定主键的生成策略，mysql默认的是自增。
     */
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;//主键
    private String catName;//姓名
    private Integer catAge;//年龄

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }

    public Integer getCatAge() {
        return catAge;
    }

    public void setCatAge(Integer catAge) {
        this.catAge = catAge;
    }
}
