package com.baihoo.web.cxf.server2;

import java.util.UUID;

import javax.jws.WebService;
import javax.xml.ws.BindingType;
import javax.xml.ws.soap.SOAPBinding;

import com.baihoo.web.cxf.model.User;
@WebService //所用的webservice 服务类都要加“@WebService”,接口的形式上加在接口上
@BindingType(SOAPBinding.SOAP12HTTP_BINDING)
public class UserService2 {
	//spring 調用中，出現的類不能實現的問題，那麽構造方法就要寫
	public UserService2() {
		super();
	}


	public User getUserByName(String name) {
		 User user = new User();
        user.setId(UUID.randomUUID().toString().replace("-", ""));
        user.setName(name);
        user.setAddress("china . chengdu");
        user.setEmail(name + "@gmail.com");
		return user;
	}

	
	public void setUser(User user) {
		System.out.println("================= Server setUser =================");
	    System.out.println("设置用户信息：" + user);
	}

}
