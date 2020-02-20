package com.seed.seed_manage.dao;

import com.seed.seed_manage.bean.TbEmp;

public interface TbEmpMapper {
    int deleteByPrimaryKey(Integer empid);

    int insert(TbEmp record);

    int insertSelective(TbEmp record);

    TbEmp selectByPrimaryKey(Integer empid);

    int updateByPrimaryKeySelective(TbEmp record);

    int updateByPrimaryKey(TbEmp record);
}