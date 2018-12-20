package com.springcloud.sellerbuyer.user.dataobject;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @program: user
 * @description: 用户信息表
 * @author: JunOba
 * @create: 2018-12-19 22:05
 */
@Data
@Entity
public class UserInfo {

    @Id
    private String id;

    private String username;

    private String password;

    private String openid;

    private Integer role;
}
