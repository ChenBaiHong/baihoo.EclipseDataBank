package com.baihoo.shiro.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.baihoo.shiro.pojo.BhUser;
import com.baihoo.shiro.pojo.BhUserExample;

public interface BhUserMapper {
    long countByExample(BhUserExample example);

    int deleteByExample(BhUserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BhUser record);

    int insertSelective(BhUser record);

    List<BhUser> selectByExample(BhUserExample example);

    BhUser selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BhUser record, @Param("example") BhUserExample example);

    int updateByExample(@Param("record") BhUser record, @Param("example") BhUserExample example);

    int updateByPrimaryKeySelective(BhUser record);

    int updateByPrimaryKey(BhUser record);
}