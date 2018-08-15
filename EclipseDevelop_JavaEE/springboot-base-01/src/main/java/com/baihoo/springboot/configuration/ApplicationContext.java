package com.baihoo.springboot.configuration;

import org.springframework.beans.factory.config.YamlPropertiesFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.ClassPathResource;

/**
 * 
 * @author Administrator
 *
 */
@Configuration
public class ApplicationContext {

	// 加载YML格式自定义配置文件
	@Bean("configurer")
	public PropertySourcesPlaceholderConfigurer configurer() {
		PropertySourcesPlaceholderConfigurer configurer = new PropertySourcesPlaceholderConfigurer();
		YamlPropertiesFactoryBean yaml = new YamlPropertiesFactoryBean();
		//yaml.setResources(new FileSystemResource("customConfig.yml"));//File引入,不灵
		yaml.setResources(new ClassPathResource("customConfig.yml"));//classpath引入
		configurer.setProperties(yaml.getObject());
		return configurer;
	}
}
