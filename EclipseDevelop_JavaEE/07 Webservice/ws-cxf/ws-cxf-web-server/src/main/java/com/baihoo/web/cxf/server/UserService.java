package com.baihoo.web.cxf.server;

import java.util.List;

import javax.jws.WebParam;
import javax.jws.WebService;

import com.baihoo.web.cxf.model.User;

/**
 * 
 * @author Administrator
 *
 */
@WebService //所用的webservice 服务类都要加“@WebService”,接口的形式上加在接口上
//@BindingType(SOAPBinding.SOAP12HTTP_BINDING)
public interface UserService {
	User getUserByName(@WebParam(name = "uName") String name);
    void setUser(User user);
    List<User> findByAll();
}
