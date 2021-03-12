package com.tiens.pojo;

import lombok.Data;
import lombok.ToString;

/**
 * @author baijing
 * @version 1.0
 * @date 2021/2/7 16:16
 */
@ToString
@Data
public class User {
    private int id;
    private String name;
    private String pwd;

    public User(){}
    public User(int id, String name, String pwd) {
        this.id = id;
        this.name = name;
        this.pwd = pwd;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", pwd='" + pwd + '\'' +
                '}';
    }
}
