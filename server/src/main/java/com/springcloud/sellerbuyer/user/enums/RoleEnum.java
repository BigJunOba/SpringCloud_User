package com.springcloud.sellerbuyer.user.enums;

import lombok.Getter;

/**
 * @program: user
 * @description: 角色枚举
 * @author: JunOba
 * @create: 2018-12-19 22:26
 */
@Getter
public enum RoleEnum {
    BUYER(1, "买家"),
    SELLER(2, "卖家")
    ;

    private Integer code;

    private String message;

    RoleEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }}
