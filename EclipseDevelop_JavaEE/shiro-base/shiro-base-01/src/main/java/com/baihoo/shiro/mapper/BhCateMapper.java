package com.baihoo.shiro.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.baihoo.shiro.pojo.BhCate;
import com.baihoo.shiro.pojo.BhCateExample;

public interface BhCateMapper {
    long countByExample(BhCateExample example);

    int deleteByExample(BhCateExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BhCate record);

    int insertSelective(BhCate record);

    List<BhCate> selectByExample(BhCateExample example);

    BhCate selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BhCate record, @Param("example") BhCateExample example);

    int updateByExample(@Param("record") BhCate record, @Param("example") BhCateExample example);

    int updateByPrimaryKeySelective(BhCate record);

    int updateByPrimaryKey(BhCate record);
}