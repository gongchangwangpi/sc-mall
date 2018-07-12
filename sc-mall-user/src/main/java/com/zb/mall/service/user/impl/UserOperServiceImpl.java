package com.zb.mall.service.user.impl;

import com.zb.mall.commons.utils.encrypt.MD5;
import com.zb.mall.domain.user.User;
import com.zb.mall.mapper.user.UserMapper;
import com.zb.mall.service.user.UserOperService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Date;

/**
 * Created by Administrator on 2018/7/10 0010.
 */
@Service(value = "userOperService")
public class UserOperServiceImpl implements UserOperService {

    @Resource
    private UserMapper userMapper;

    @Override
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public User register(User user) {

        user.setPassword(MD5.md5(user.getPassword(), null));
        user.setRegisterTime(new Date());

        userMapper.insert(user);

        return user;
    }

    @Override
    public User update(User user) {
        return null;
    }
}
