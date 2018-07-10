package com.zb.mall.mapper.user;

import com.zb.mall.domain.user.Consignee;

public interface ConsigneeMapper {

    int deleteByPrimaryKey(Long id);

    int insert(Consignee record);

    int insertSelective(Consignee record);

    Consignee selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Consignee record);

    int updateByPrimaryKey(Consignee record);
}