package com.example.config.util;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.net.URL;

@Configuration
public class RequstConfig implements WebMvcConfigurer {
    private URL GlobalConstant;

    /**
     * 跨域配置
     *       前后端分离必须配置，出现跨域之后前端无法访问后端接口
     * @author xx
     */
    @Override
    public void addCorsMappings(CorsRegistry registry){
        // 允许跨域访问资源定义： /rest/ 所有资源
        registry.addMapping("/**")
                // 只允许本地的指定端口访问
                .allowedOrigins("http://localhost:8080")
//                // 允许发送Cookie
                .allowCredentials(true);
//                // 允许所有方法
//                .allowedMethods("GET", "POST", "PUT", "DELETE", "HEAD");
    }
}
