package com.aoligei.moonlight.entity;

import java.io.Serializable;
import io.swagger.annotations.ApiModel;

/**
 * <p>
 * 
 * </p>
 *
 * @author yuyang
 * @since 2022-09-27
 */
@ApiModel(value = "Mystu对象", description = "")
public class Mystu implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;

    private String name;

    private String sex;


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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Mystu{" +
        "id=" + id +
        ", name=" + name +
        ", sex=" + sex +
        "}";
    }
}
