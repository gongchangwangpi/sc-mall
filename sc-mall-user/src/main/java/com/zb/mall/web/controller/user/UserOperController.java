package com.zb.mall.web.controller.user;

import com.zb.mall.commons.dto.RestResultDto;
import com.zb.mall.domain.user.User;
import com.zb.mall.dto.user.UserRegisterRequestDto;
import com.zb.mall.service.user.UserOperService;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2018/7/10 0010.
 */
@RequestMapping(value = "/user")
@RestController
public class UserOperController {

    @Resource
    private UserOperService userOperService;

    @GetMapping(value = "/register")
    public RestResultDto register(@Validated UserRegisterRequestDto userRegisterRequest) {
        User register = userOperService.register(userRegisterRequest);

        return RestResultDto.success(register);
    }

}
