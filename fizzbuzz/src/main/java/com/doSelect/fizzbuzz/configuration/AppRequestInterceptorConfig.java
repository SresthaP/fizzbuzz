package com.doSelect.fizzbuzz.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@Configuration
public class AppRequestInterceptorConfig implements WebMvcConfigurer{
	
	
	
	@Bean
    public RequestTrackingInterceptor requestTrackingInterceptor() {
		
        return new RequestTrackingInterceptor();
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(requestTrackingInterceptor());
    }

}
