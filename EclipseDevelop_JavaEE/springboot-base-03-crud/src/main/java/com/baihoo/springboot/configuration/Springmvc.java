package com.baihoo.springboot.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.ConversionService;
import org.springframework.core.convert.support.DefaultConversionService;

import com.baihoo.springboot.convertor.CustomDateConverter;

/**
 * 
 * @author Administrator
 *
 */
@Configuration
public class Springmvc {

    /**
     * 
     * 通過轉換器服務類，添加自定義的轉換器
     * {@link ConversionServiceDeducer}
     * @return
     */
    @Bean
    public ConversionService conversionService() {
        DefaultConversionService service = new DefaultConversionService();
        service.addConverter(new CustomDateConverter());
        return service;
    }
}