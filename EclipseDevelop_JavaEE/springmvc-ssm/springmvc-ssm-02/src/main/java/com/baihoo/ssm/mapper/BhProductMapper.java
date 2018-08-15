package com.baihoo.ssm.mapper;

import com.baihoo.ssm.pojo.BhProduct;
import com.baihoo.ssm.pojo.BhProductExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

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