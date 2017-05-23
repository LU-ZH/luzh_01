package com.jk;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.Date;

/**
 * 这是一个测试实体类
 *
 */
public class Demo {

    private Integer id;
    private String name;
    @JSONField(format = "yyyy-MM-dd HH:mm")
    private Date creatTime;//创建时间
    /**
     * 不想返回备注信息
     * serialize：是否需要序列化此参数
     */
    @JSONField(serialize = false)
    private String remarks;//备注信息

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public Date getCreatTime() {
        return creatTime;
    }

    public void setCreatTime(Date creatTime) {
        this.creatTime = creatTime;
    }
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
