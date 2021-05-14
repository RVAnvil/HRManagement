package com.nagarro.hrManagement.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

import com.nagarro.hrManagement.constant.Constant;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {
    "com.nagarro.hrManagement"
})
public class WebMvcConfig extends  WebMvcConfigurerAdapter {
	
	
    @Bean
    public InternalResourceViewResolver resolver() {
    	
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setViewClass(JstlView.class);
        resolver.setPrefix(Constant.PATH_TO_JSP);
        resolver.setSuffix(".jsp");
        return resolver;
    }
    
	@Bean
	RestTemplate restTemplate() {
		RestTemplate restTemplate = new RestTemplate();
		return restTemplate;
	}
    

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry
            .addResourceHandler("/resources/**")
            .addResourceLocations("classpath:/static/");
    }

}
