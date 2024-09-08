package com.egao.common.test.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * 
 * Created by AutoGenerator on 2020-08-13 09:08:35
 */
@TableName("t_lunbo")
public class Lunbo implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 名称
     */
    private String name;
    
    /**
     * 名称
     */
    private String url;

    /**
     * 排序
     */
    private Integer sort;

    

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

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    

    @Override
    public String toString() {
        return "Lunbo{" +
        ", id=" + id +
        ", name=" + name +
        ", sort=" + sort +
        ", url=" + url +
        "}";
    }

}
