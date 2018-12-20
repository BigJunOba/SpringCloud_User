package com.springcloud.sellerbuyer.user.service;

import com.springcloud.sellerbuyer.user.dataobject.UserInfo;

/**
 * @program: user
 * @description: User Service
 * @author: JunOba
 * @create: 2018-12-19 22:09
 */
public interface UserService {

    /**
     * 通过openid来查询用户信息
     * @param openid
     * @return
     */
    UserInfo findByOpenid(String openid);
}
