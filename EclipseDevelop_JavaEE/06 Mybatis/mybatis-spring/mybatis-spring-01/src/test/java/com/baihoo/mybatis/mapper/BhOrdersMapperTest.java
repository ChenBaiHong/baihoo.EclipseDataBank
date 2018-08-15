package com.baihoo.mybatis.mapper;

import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.baihoo.mybatis.pojo.BhOrders;
import com.baihoo.mybatis.pojoDto.BhOrdersDto;

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
public class BhOrdersMapperTest {
	@Autowired
	BhOrdersMapper bhOrdersMapper;
	/**
	 * 测试插入
	 */
	@Test
	public void testInsertBhOrders() {
		BhOrders bhOrders = new BhOrders("5", new Date(),246.2 , "1");
		BhOrders bhOrders2 = new BhOrders("5", new Date(),246.2 , "1");
		bhOrdersMapper.insertBhOrders(bhOrders);
		bhOrdersMapper.insertBhOrders(bhOrders2);
	}
	/**
	 * 测试更新
	 */
	@Test
	public void testUpdateBhOrders() {
	}
	/**
	 * 测试删除
	 */
	@Test
	public void testDeleteBhOrders() {
	}
	/**
	 * 测试：
	 * 		订单下含有多个订单项，一对多的关系 查询订单明细
	 */
	@Test
	public void testFindOrdersDetail() {
		BhOrdersDto bhOrdersDto = new BhOrdersDto();
		List<BhOrdersDto> list = bhOrdersMapper.findOrdersDetail(bhOrdersDto);
		
		list.forEach(e -> System.out.println(e));
	}
	/**
	 * 测试：
	 * 		懒加载查询订单用户及订单明细
	 */
	@Test
	public void testFindOrdersDetailLazyLoading() {
		BhOrdersDto bhOrdersDto = new BhOrdersDto();
		List<BhOrdersDto> list = bhOrdersMapper.findOrdersDetailLazyLoading(bhOrdersDto);
		
		System.out.println(list.get(0).getBhUserDto());
		System.out.println(list.get(0).getOiList());
	}
}
