package com.baihoo.shiro.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.baihoo.shiro.pojo.BhProduct;
import com.baihoo.shiro.pojo.BhProductExample;

public interface BhProductMapper {
    long countByExample(BhProductExample example);

    int deleteByExample(BhProductExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BhProduct record);

    int insertSelective(BhProduct record);

    List<BhProduct> selectByExample(BhProductExample example);

    BhProduct selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BhProduct record, @Param("example") BhProductExample example);

    int updateByExample(@Param("record") BhProduct record, @Param("example") BhProductExample example);

    int updateByPrimaryKeySelective(BhProduct record);

    int updateByPrimaryKey(BhProduct record);
}