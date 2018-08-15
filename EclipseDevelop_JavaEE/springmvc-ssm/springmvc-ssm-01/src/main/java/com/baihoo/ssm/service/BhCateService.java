package com.baihoo.ssm.service;

import java.util.List;

import com.baihoo.ssm.pojo.BhCate;

public interface BhCateService {
    List<BhCate> findByAll() throws Exception;
    int updateByPrimaryKey(BhCate record)throws Exception;
}
