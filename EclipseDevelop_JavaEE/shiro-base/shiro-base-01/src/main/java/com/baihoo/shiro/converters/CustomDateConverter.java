package com.baihoo.shiro.converters;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.core.convert.converter.Converter;
/**
 * 自定义日期转换格式
 * @author Administrator
 *
 */
public class CustomDateConverter implements  Converter<String, Date>{

	@Override
	public Date convert(String source) {
		try {
			if(source !=null && !"".equals(source.trim())) {
				SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
				return simpleDateFormat.parse(source);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
