package com.waldoro.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;
import org.springframework.web.servlet.view.UrlBasedViewResolver;

/**
 * Created by wrokita on 08/11/2016.
 */
@Configuration
@ComponentScan("com.waldoro")
@EnableWebMvc
public class Config extends WebMvcConfigurerAdapter{


    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/resources/static/js/**")
        .addResourceLocations("/resources/static/js/");
        registry.addResourceHandler("/resources/static/css/**")
                .addResourceLocations("/resources/static/css/");
        registry.addResourceHandler("/resources/static/views/**")
                .addResourceLocations("/resources/static/views/");
        registry.addResourceHandler("/resources/static/**")
                .addResourceLocations("/resources/static/");
        registry.addResourceHandler("/webjars/**")
                .addResourceLocations("/webjars/");
    }

    @Bean
    public UrlBasedViewResolver setupViewResolver() {
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix("/WEB-INF/views/");
        resolver.setSuffix(".jsp");
        return resolver;
    }

    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }
}
