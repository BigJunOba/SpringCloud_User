package com.springcloud.sellerbuyer.user.repository;

import com.springcloud.sellerbuyer.user.dataobject.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @program: user
 * @description: 用户Repository
 * @author: JunOba
 * @create: 2018-12-19 22:07
 */
public interface UserInfoRepository extends JpaRepository<UserInfo, String> {

    UserInfo findByOpenid(String openid);
}
