package com.enbuys.springboot.bean;

import javax.persistence.*;

/**
 * @Author: Pace
 * @Data: 2019/10/29 14:46
 * @Version: v1.0
 */
@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 设置自增主键
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column // 如果不写默认属性名
    private String email;

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
