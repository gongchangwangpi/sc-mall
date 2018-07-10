package com.zb.mall.dto.user;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.io.Serializable;

/**
 * Created by Administrator on 2018/7/10 0010.
 */
@Getter
@Setter
public class UserRegisterRequestDto implements Serializable {

    private static final long serialVersionUID = 6738691468164448110L;


    /**
     * 登录用户名，唯一
     */
    @NotEmpty(message = "用户名不能为空")
    @Pattern(regexp = "^[a-zA-z][a-zA-z0-9]{5,19}$", message = "用户为6-20位字母数字组合")
    private String username;

    /**
     * 手机号码
     */
    @Pattern(regexp = "1[0-9]{10}", message = "请输入正确的手机号码")
    private String mobile;

    /**
     * 昵称
     */
    @Size(min = 2, max = 20, message = "昵称长度为[2-20]位")
    private String nickName;

    /**
     * 电子邮箱
     */
    @Email(message = "请输入正确的邮箱地址")
    private String email;

    /**
     * 登录密码
     */
    @NotEmpty(message = "密码不能为空")
//    @Pattern(regexp = "", message = "仅支持6-20位普通字符密码")
    private String password;

}
