package com.zb.mall.mapper.user;

import com.zb.mall.domain.user.User;

public interface UserMapper {

    int insert(User record);

    User selectByPrimaryKey(Long id);

    int update(User record);
}