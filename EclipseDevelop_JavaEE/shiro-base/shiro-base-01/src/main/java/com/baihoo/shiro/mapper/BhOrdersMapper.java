package com.baihoo.shiro.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.baihoo.shiro.pojo.BhOrders;
import com.baihoo.shiro.pojo.BhOrdersExample;

public interface BhOrdersMapper {
    long countByExample(BhOrdersExample example);

    int deleteByExample(BhOrdersExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BhOrders record);

    int insertSelective(BhOrders record);

    List<BhOrders> selectByExample(BhOrdersExample example);

    BhOrders selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BhOrders record, @Param("example") BhOrdersExample example);

    int updateByExample(@Param("record") BhOrders record, @Param("example") BhOrdersExample example);

    int updateByPrimaryKeySelective(BhOrders record);

    int updateByPrimaryKey(BhOrders record);
}