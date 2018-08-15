package com.baihoo.ssm.mapper;

import com.baihoo.ssm.pojo.BhBrand;
import com.baihoo.ssm.pojo.BhBrandExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BhBrandMapper {
    long countByExample(BhBrandExample example);

    int deleteByExample(BhBrandExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BhBrand record);

    int insertSelective(BhBrand record);

    List<BhBrand> selectByExample(BhBrandExample example);

    BhBrand selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BhBrand record, @Param("example") BhBrandExample example);

    int updateByExample(@Param("record") BhBrand record, @Param("example") BhBrandExample example);

    int updateByPrimaryKeySelective(BhBrand record);

    int updateByPrimaryKey(BhBrand record);
    
    
}