package com.baihoo.mybatis.mapper;

import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.baihoo.mybatis.pojo.BhUser;
import com.baihoo.mybatis.pojoDto.BhUserDto;
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
public class BhUserMapperTest{
	@Autowired
	private BhUserMapper bhUserMapper;
	/**
	 * 测试插入用户
	 */
	@Test
	public void testInsertBhUser() {
		BhUser bhUser = new BhUser();
		bhUser.setAddress("china");
		bhUser.setBirth(new Date());
		bhUser.setPassword("123");
		bhUser.setUsername("提娜迪");
		bhUserMapper.insertBhUser(bhUser);
		System.out.println(bhUser.getId());
	}
	/**
	 * 测试更新用户
	 */
	@Test
	public void testUpdateBhUser() {
		BhUser bhUser = new BhUser();
		bhUser.setId("5");
		bhUser.setAddress("china");
		bhUser.setBirth(new Date());
		bhUser.setPassword("123");
		bhUser.setUsername("蚩尤");
		bhUserMapper.updateBhUser(bhUser);
	}
	/**
	 * 测试删除用户
	 */
	@Test
	public void testDeleteBhUser() {
		BhUser bhUser = new BhUser();
		bhUser.setId("2");
		bhUserMapper.deleteBhUser(bhUser);
	}
	/**
	 * 测试一对多查询，查询用户及订单明细
	 */
	@Test
	public void testFindBhUserDtoDetail() {
		BhUserDto bhUserDto = new BhUserDto();
		List<BhUserDto> list = bhUserMapper.findBhUserDtoDetail(bhUserDto);
		list.forEach(e -> System.out.println(e));
	}
	/**
	 * 测试一对多查询，查询用户及订单明细
	 * 	证明mybatis的SqlSession默认是一级缓存
	 */
	@Test
	public void testFindBhUserDtoDetailCache() {
		BhUserDto bhUserDto = new BhUserDto();
		List<BhUserDto> list = bhUserMapper.findBhUserDtoDetail(bhUserDto);
		list.forEach(e -> System.out.println(e));
		
		//如若中有对对象的增删改操作，SqlSession就会清空一级缓存
		
		List<BhUserDto> list2 = bhUserMapper.findBhUserDtoDetail(bhUserDto);
		list2.forEach(e -> System.out.println(e));
	}
	@Test
	public void testFindById() {
		BhUserDto user = bhUserMapper.findById("5");
		System.out.println(user);
	}

}
