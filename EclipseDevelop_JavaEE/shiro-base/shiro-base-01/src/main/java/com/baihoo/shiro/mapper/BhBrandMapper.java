package com.baihoo.shiro.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.baihoo.shiro.pojo.BhBrand;
import com.baihoo.shiro.pojo.BhBrandExample;

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