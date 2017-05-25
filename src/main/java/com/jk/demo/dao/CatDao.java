package com.jk.demo.dao;

import com.jk.demo.bean.Cat;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * Created by dell on 2017/5/23.
 */

/**
 * 使用@Repository注解，标注这是一个持久化操作对象。
 */
@Repository
public class CatDao {

    @Resource
    private JdbcTemplate jdbcTemplate;

    public List<Cat> selectByCatName(String catName){
        /**
         * 1.定义一个Sql语句
         * 2.定义一个RowMapper
         * 3.执行查询方法
         */
        String sql = "select * from cat where cat_name=?";
        RowMapper<Cat> rowMapper = new BeanPropertyRowMapper<>(Cat.class);
        List<Cat> cats = jdbcTemplate.query(sql, rowMapper, catName);
        return cats;
    }


    public Cat selectOneCatById(Integer id) {
        String sql = "select * from cat where id=?";
        RowMapper<Cat> rowMapper = new BeanPropertyRowMapper<>(Cat.class);
        Cat cat = jdbcTemplate.queryForObject(sql, rowMapper, id);
        return cat;
    }
}
