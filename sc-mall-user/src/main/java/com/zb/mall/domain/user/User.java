package com.zb.mall.domain.user;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户信息表
 *
 * @version 1.0  2018-07-10
 */
@Setter
@Getter
public class User implements Serializable {

    private static final long serialVersionUID = 3361376448652548706L;

    /**
     * 代理主键
     */
    private Long id;

    /**
     * 用户ID，唯一
     */
    private String userId;

    /**
     * 登录用户名，唯一
     */
    private String username;

    /**
     * 手机号码
     */
    private String mobile;

    /**
     * 昵称
     */
    private String nickName;

    /**
     * 电子邮箱
     */
    private String email;

    /**
     * 登录密码
     */
    private String password;

    /**
     * 状态[0禁用/1正常]
     */
    private Boolean status;

    /**
     * 注册时间
     */
    private Date registerTime;

}