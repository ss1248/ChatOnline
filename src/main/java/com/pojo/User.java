package com.pojo;

import lombok.Data;

import java.util.Date;
//实体类
@Data
public class User {
    private String userName;    //账号
    private String pwd;        //
    private String sex;     //性别
    private int age;        //年龄
    private String address; //所在地
    private Date createTime;    //注册时间
    private boolean state;   //状态
    private String personalLabel;   //个性标签

}
