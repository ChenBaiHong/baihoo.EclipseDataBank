package com.baihoo.mybatis.mapper;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.baihoo.mybatis.pojo.BhOrderItem;
import com.baihoo.mybatis.pojoDto.BhOrderItemDto;

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
public class BhOrderItemMapperTest {
	@Autowired
	BhOrderItemMapper bhOrderItemMapper;

	/**
	 * 测试插入
	 */
	@Test
	public void testInsertBhOrderItem() {
		BhOrderItem bhOrderItem = new BhOrderItem("1",123.1, 123.1, "1", "1");
		BhOrderItem bhOrderItem2 = new BhOrderItem("1",123.1, 123.1, "2", "1");
		BhOrderItem bhOrderItem3 = new BhOrderItem("1",123.1, 123.1, "3", "2");
		BhOrderItem bhOrderItem4 = new BhOrderItem("1",123.1, 123.1, "4", "2");
		bhOrderItemMapper.insertBhOrderItem(bhOrderItem);
		bhOrderItemMapper.insertBhOrderItem(bhOrderItem2);
		bhOrderItemMapper.insertBhOrderItem(bhOrderItem3);
		bhOrderItemMapper.insertBhOrderItem(bhOrderItem4);
	}
	/**
	 * 测试更新
	 */
	@Test
	public void testUpdateBhOrderItem() {
	}
	/**
	 * 测试删除
	 */
	@Test
	public void testDeleteBhOrderItem() {
	}
	/**
	 * 测试订单项，复杂一对一查询
	 */
	@Test
	public void testFindOrderItemDetail(){
		BhOrderItemDto bhOrderItemDto = new BhOrderItemDto();
		List<BhOrderItemDto> list = bhOrderItemMapper.findOrderItemDetail(bhOrderItemDto);
		list.forEach(e -> System.out.println(e));
	}
	/**
	 * 通过定id查询订单项
	 */
	@Test
	public void testFindByOid() {
		List<BhOrderItemDto> list = bhOrderItemMapper.findByOid("1");
		list.forEach(e -> System.out.println(e));
	}
}
