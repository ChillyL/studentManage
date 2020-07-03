package com.chilly.demo.interceptor;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @auther ChillyLin
 * @date 2020/6/23
 *
 * 配置拦截器
 */

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {

        //定义拦截的位置
        registry.addInterceptor(new LoginInterceptor())
                .addPathPatterns("/course/**")   //定义需要拦截的路径
                .addPathPatterns("/department/**")
                .addPathPatterns("/student/**")
                .addPathPatterns("/teacher/**")
                .addPathPatterns("/user/**")
                .excludePathPatterns("/user/login");  //排除部分必须执行的


    }
}
