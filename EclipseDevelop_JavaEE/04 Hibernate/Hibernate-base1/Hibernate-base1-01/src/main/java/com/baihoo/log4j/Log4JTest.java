package com.baihoo.log4j;

import org.apache.log4j.Logger;
import org.junit.Test;

/**
 * 日志记录的类:
 * @author Administrator
 *
 */
public class Log4JTest {
	
	private Logger logger = Logger.getLogger(Log4JTest.class);
	
	@Test
	public void demo1(){
		logger.fatal("致命错误");
		logger.error("普通错误");
		logger.warn("警告信息");
		logger.info("普通信息");
		logger.debug("调试信息");
		logger.trace("堆栈信息");
	}
}
