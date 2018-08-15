package com.baihoo.ssm.service.impl;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baihoo.ssm.exception.CustomException;
import com.baihoo.ssm.mapper.BhProductMapper;
import com.baihoo.ssm.mapper.BhProductMapperCustom;
import com.baihoo.ssm.pojo.BhProduct;
import com.baihoo.ssm.pojoCustom.BhProductCustom;
import com.baihoo.ssm.pojoQto.BhProductQto;
import com.baihoo.ssm.service.BhProductService;
/**
 * 商品操作服務層
 * @author Administrator
 *
 */
@Service("bhProductService")
public class BhProductServiceImpl implements BhProductService {
	/**
	 * @param bhProductMapper product 	單表操作數據庫層mapper
	 * @param bhProductMapperCustom 		複雜表操作數據庫曾mapper
	 */
	@Autowired
	private BhProductMapper bhProductMapper;
	@Autowired
	private BhProductMapperCustom bhProductMapperCustom;
	

	/**
	 * 查詢商品列表
	 */
	public List<BhProductCustom> findProductList(BhProductQto bhProductDto) throws Exception{
		
		return bhProductMapperCustom.findProductList(bhProductDto);
	}

	/**
	 * 查詢商品列表詳細信息
	 */
	public List<BhProductCustom> findProductDetailList(BhProductQto bhProductDto) throws Exception{
		return bhProductMapperCustom.findProductDetailList(bhProductDto);
	}

	/**
	 * 根据商品id查找商品
	 */
	public BhProductCustom findBhProduct(Integer id, BhProductCustom bhProductCustom) throws Exception{
	
		if(id !=null) {
			bhProductCustom = bhProductMapperCustom.findProductById(id);
			if(bhProductCustom == null) {
				//如果查询的商品信息为空，抛出系统 自定义的异常
				throw new CustomException("查詢的商品不存在！");
			}
			//在这里随着需求的变量，需要查询商品的其它的相关信息，返回到controller
		}else {
			//否则我们就可以抛出异常调用者
			throw new CustomException("商品的主鍵id不能爲空！");
		}
		return bhProductCustom;
	}
	/**
	 * 根据商品id更新商品
	 */
	public int updateBhProduct(Integer id, BhProductCustom bhProductCustom) throws Exception{
		int success = 0 ;
		if(id !=null) {
			BhProduct bhProduct = new BhProduct();
			BeanUtils.copyProperties(bhProductCustom, bhProduct);
			success =  bhProductMapper.updateByPrimaryKey(bhProduct);
		}else {
			//否则我们就可以抛出异常调用者
			throw new CustomException("更新商品的主鍵id不能爲空！");
		}
		return success;
	}
}
