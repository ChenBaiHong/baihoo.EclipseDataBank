package com.baihoo.ssm.service;

import java.util.List;

import com.baihoo.ssm.pojo.BhBrand;

/**
 * 
 * @author Administrator
 *
 */
public interface BhBrandService {
    List<BhBrand> findByAll() throws Exception;
    int updateByPrimaryKey(BhBrand record) throws Exception;
}
