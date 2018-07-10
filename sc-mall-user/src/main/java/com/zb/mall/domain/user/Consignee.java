package com.zb.mall.domain.user;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

/**
 * 收货信息表
 *
 * @version 1.0  2018-07-10
 */
@Getter
@Setter
public class Consignee implements Serializable {

    private static final long serialVersionUID = 3109570512652029107L;

    /**
     * 代理主键
     */
    private Long id;

    /**
     * 用户ID
     */
    private String userId;

    /**
     * 收货人姓名
     */
    private String consigneeName;

    /**
     * 收货人手机号码
     */
    private String consigneeMobile;

    /**
     * 收货人地址
     */
    private String consigneeAddr;

    /**
     * 收货地址类型[家，公司，学校等]
     */
    private String type;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 修改时间
     */
    private Date modifyTime;

}