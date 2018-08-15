package com.baihoo.mybatis.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.baihoo.mybatis.pojo.BhBrand;

/**
 * Mybatis整合spring开发的测试
 * 
 * @author Administrator
 * 
		 第三种方式：
		 		MapperScannerConfigurer：mapper的扫描器，将包下边的mapper接口自动创建代理对象，
														自动创建到spring容器中，bean的id是mapper的类名（首字母小写）
	
		 <bean class="org.mybatis.spring.mapper.MapperScannerConfigurer">

		 			使用sqlSessionFactoryBeanName，类型直接是value值。
		 				为什么不配置sqSessionFactory,因为容易出现多个sqlSessionFactory冲突，
		 			并且setSqlSessionFactory在MapperScannerConfigurer中是过时方法

		 		<property name="sqlSessionFactoryBeanName" value="sqlSessionFactory"></property>

		 		配置扫描包的路径
					如果要扫描多个包，中间使用半角逗号分隔

		 		<property name="basePackage" value="com.baihoo.mybatis.mapper"></property>
		 </bean>			
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/applicationContext.xml")
public class BhBrandMapperTest {
	@Autowired
	private BhBrandMapper bhBrandMapper;
	/**
	 * 测试插入
	 */
	@Test
	public void testInsertBhBrand() {
		BhBrand bhBrand = new BhBrand("京东到家" ,"哦哦哦");
		BhBrand bhBrand2 = new BhBrand("联邦蔬菜" ,"哦哦哦");
		bhBrandMapper.insertBhBrand(bhBrand);
		bhBrandMapper.insertBhBrand(bhBrand2);
	}
	/**
	 * 测试更新
	 */
	@Test
	public void testUpdateBhBrand() {
		BhBrand bhBrand = new BhBrand("京东到家" ,"哦哦哦");
		bhBrand.setId("1");
		bhBrandMapper.updateBhBrand(bhBrand);
	}
	/**
	 * 测试删除
	 */
	@Test
	public void testDeleteBhBrand() {
		BhBrand bhBrand = new BhBrand("1");
		bhBrandMapper.deleteBhBrand(bhBrand);
	}

}
