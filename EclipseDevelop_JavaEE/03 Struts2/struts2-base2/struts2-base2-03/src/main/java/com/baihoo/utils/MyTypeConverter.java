package com.baihoo.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

import org.apache.struts2.util.StrutsTypeConverter;

public class MyTypeConverter extends StrutsTypeConverter {

	// 接收页面传递的数据封装到javaBean.
	@Override
	public Object convertFromString(Map context, String[] values, Class toClass) {

		// System.out.println(context); //ognl.OgnlContext@faae2497
		// System.out.println(values[0]); //[Ljava.lang.String;@100c4d
		// System.out.println(toClass); //class java.util.Date

		String value = values[0];
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		Date date = null;

		try {
			date = sdf.parse(value);
		} catch (ParseException e) {

			// e.printStackTrace();
			throw new RuntimeException();
		}

		return date;
	}

	@Override
	public String convertToString(Map context, Object o) {
		return null;
	}

}
