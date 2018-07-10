package com.zb.mall.service.user;

import com.zb.mall.domain.user.User;
import com.zb.mall.dto.user.UserRegisterRequestDto;

/**
 * Created by Administrator on 2018/7/10 0010.
 */
public interface UserOperService {

    /**
     * 用户注册
     *
     * @param userRegisterRequest
     * @return
     */
    User register(UserRegisterRequestDto userRegisterRequest);

    /**
     * 修改用户信息
     *
     * @param user
     * @return
     */
    User update(User user);
}
