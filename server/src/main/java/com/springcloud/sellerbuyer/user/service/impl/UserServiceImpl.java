package com.springcloud.sellerbuyer.user.service.impl;

import com.springcloud.sellerbuyer.user.dataobject.UserInfo;
import com.springcloud.sellerbuyer.user.repository.UserInfoRepository;
import com.springcloud.sellerbuyer.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program: user
 * @description:
 * @author: JunOba
 * @create: 2018-12-19 22:15
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserInfoRepository userInfoRepository;

    /**
     * 通过openid来查询用户信息
     * @param openid
     * @return
     */
    @Override
    public UserInfo findByOpenid(String openid) {
        return userInfoRepository.findByOpenid(openid);
    }
}
