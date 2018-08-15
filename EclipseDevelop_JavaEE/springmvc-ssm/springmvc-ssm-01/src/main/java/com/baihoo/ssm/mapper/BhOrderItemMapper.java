package com.baihoo.ssm.mapper;

import com.baihoo.ssm.pojo.BhOrderItem;
import com.baihoo.ssm.pojo.BhOrderItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BhOrderItemMapper {
    long countByExample(BhOrderItemExample example);

    int deleteByExample(BhOrderItemExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BhOrderItem record);

    int insertSelective(BhOrderItem record);

    List<BhOrderItem> selectByExample(BhOrderItemExample example);

    BhOrderItem selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BhOrderItem record, @Param("example") BhOrderItemExample example);

    int updateByExample(@Param("record") BhOrderItem record, @Param("example") BhOrderItemExample example);

    int updateByPrimaryKeySelective(BhOrderItem record);

    int updateByPrimaryKey(BhOrderItem record);
}