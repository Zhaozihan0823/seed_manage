package com.seed.seed_manage.dao;

import com.seed.seed_manage.bean.TbUser;

public interface TbUserMapper {
    int deleteByPrimaryKey(Integer userno);

    int insert(TbUser record);

    int insertSelective(TbUser record);

    TbUser selectByPrimaryKey(Integer userno);

    int updateByPrimaryKeySelective(TbUser record);

    int updateByPrimaryKey(TbUser record);
}