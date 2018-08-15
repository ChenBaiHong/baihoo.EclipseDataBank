package com.baihoo.mybatis.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.baihoo.mybatis.pojo.BhProduct;

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
public class BhProductMapperTest {

	@Autowired
	private BhProductMapper bhProductMapper;

	/**
	 * 测试插入
	 */
	@Test
	public void testInsertBhProduct() {
		BhProduct bhProduct1 = new BhProduct("豆豆", 123.12,  "1", "2");
		BhProduct bhProduct2 = new BhProduct("大米", 123.12,  "1", "2");
		BhProduct bhProduct3 = new BhProduct("香肠", 123.12,  "1", "2");
		BhProduct bhProduct4 = new BhProduct("火腿", 123.12,  "1", "2");
		bhProductMapper.insertBhProduct(bhProduct1);
		bhProductMapper.insertBhProduct(bhProduct2);
		bhProductMapper.insertBhProduct(bhProduct3);
		bhProductMapper.insertBhProduct(bhProduct4);
	}
	/**
	 * 测试更新
	 */
	@Test
	public void testUpdateBhProduct() {
	}
	/**
	 * 测试删除
	 */
	@Test
	public void testDeleteBhProduct() {
	}

}
