package com.yyt.weixinchengxu.dao;

import com.yyt.weixinchengxu.entity.weixinUser;

public interface weixinUserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(weixinUser record);

    int insertSelective(weixinUser record);

    weixinUser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(weixinUser record);

    int updateByPrimaryKey(weixinUser record);
}