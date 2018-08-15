package com.baihoo.shiro.service;

import java.util.List;

import com.baihoo.shiro.pojo.BhCate;

public interface BhCateService {
    List<BhCate> findByAll() throws Exception;
    int updateByPrimaryKey(BhCate record) throws Exception;
}
