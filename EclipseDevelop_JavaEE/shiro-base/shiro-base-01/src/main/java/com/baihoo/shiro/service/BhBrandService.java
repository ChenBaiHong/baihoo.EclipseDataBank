package com.baihoo.shiro.service;

import java.util.List;

import com.baihoo.shiro.pojo.BhBrand;

/**
 * 
 * @author Administrator
 *
 */
public interface BhBrandService {
    List<BhBrand> findByAll() throws Exception;
    int updateByPrimaryKey(BhBrand record) throws Exception;
}
