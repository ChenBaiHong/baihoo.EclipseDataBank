package com.baihoo.ssm.mapper;

import com.baihoo.ssm.pojo.BhUser;
import com.baihoo.ssm.pojo.BhUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

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