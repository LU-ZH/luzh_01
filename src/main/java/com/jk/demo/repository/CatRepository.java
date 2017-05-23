package com.jk.demo.repository;

import com.jk.demo.bean.Cat;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by dell on 2017/5/22.
 */
public interface CatRepository extends CrudRepository<Cat,Integer>{
}
