package com.baihoo.struts2.filter;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.URLDecoder;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import com.baihoo.struts2.MyModelDriven;

/**
 * 
 * @author Administrator
 *	自定義Struts2的過濾器
 */
public class StrutsFilter implements Filter {

	public void init(FilterConfig filterConfig) throws ServletException {

	}

	public void doFilter(ServletRequest req, ServletResponse resp,
			FilterChain chain) throws IOException, ServletException {

		// 1.强转
		HttpServletRequest request = (HttpServletRequest) req;
		HttpServletResponse response = (HttpServletResponse) resp;

		// 2.操作

		// 2.1 得到请求资源路径
			//		注意：
			//		maven web工程和普通Java 的web工程获取的上下文路不一致
			//		path = uri.substring(contextPath.length() + 1);
		String uri = request.getRequestURI().trim();
		String contextPath = request.getContextPath().trim();
		String path = "";
		if(uri.contains("/")) {
			if(uri.lastIndexOf("/")<uri.length()) {
				path = uri.substring(uri.lastIndexOf("/")+1, uri.length());
			}
		}else {
			path = uri.substring(contextPath.length() + 1);
		}
		System.out.println(path);
		// 2.2 使用path去struts.xml文件中查找某一个<action name=path>这个标签
		SAXReader reader = new SAXReader();

		try {
			// 得到struts.xml文件的document对象。
			String strutsXML = Thread.currentThread().getContextClassLoader().getResource("/struts.xml").getPath();
			//如果文件路径带有空格抛出异常---org.dom4j.DocumentException: 系统找不到指定的路径
			//因此得转码，UTF-8格式
			strutsXML = URLDecoder.decode(strutsXML,"UTF-8");
			Document document = reader.read(new File(strutsXML));
//			
//			Document document = reader.read(new File(this.getClass()
//					.getResource("/struts.xml").getPath()));
//			
			Element actionElement = (Element) document
					.selectSingleNode("//action[@name='" + path + "']"); // 查找<action
																			// name='hello'>这样的标签

			if (actionElement != null) {
				// 得到<action>标签上的class属性以及method属性
				String className = actionElement.attributeValue("class"); // 得到了action类的名称
				String methodName = actionElement.attributeValue("method");// 得到action类中的方法名称。

				// 2.3通过反射，得到Class对象，得到Method对象
				Class actionClass = Class.forName(className);
				Method method = actionClass.getDeclaredMethod(methodName);
					
				// 处理请求参数封装:

				Object actionObj = actionClass.newInstance();

				// 2.模型驱动
				if (actionObj instanceof MyModelDriven) {
					MyModelDriven mmd = (MyModelDriven) actionObj;

					BeanUtils.populate(mmd.getModel(),
							request.getParameterMap());
				} else {
					// 1.属性驱动
					BeanUtils.populate(actionObj, request.getParameterMap());//
				}
				
				// 2.4 让method执行.
//				String returnValue = (String) method.invoke(actionClass
//						.newInstance()); // 是让action类中的方法执行，并获取方法的返回值。
				String returnValue = (String) method.invoke(actionObj); // 是让action类中的方法执行，并获取方法的返回值。
				
				// 2.5
				// 使用returnValue去action下查找其子元素result的name属性值，与returnValue做对比。
				Element resultElement = actionElement.element("result");
				String nameValue = resultElement.attributeValue("name");

				if (returnValue.equals(nameValue)) {
					// 2.6得到了要跳转的路径。
					String skipPath = resultElement.getText();

					 System.out.println(skipPath);

					request.getRequestDispatcher(skipPath).forward(request,
							response);
					return;
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		} 

		// 3.放行
		chain.doFilter(request, response);

	}

	public void destroy() {

	}

}
