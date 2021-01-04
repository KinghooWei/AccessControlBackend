package com.example.cms;


import com.example.cms.filter.JwtAuthenticationFilter;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@MapperScan("com.example.cms.mapper")
public class DemoApplication {
    // 拦截请求 token 请求里面没有token 都拦截
    @Bean
    public FilterRegistrationBean jwtFilter () {

        final FilterRegistrationBean registrationBean = new FilterRegistrationBean();
        JwtAuthenticationFilter jwtAuthenticationFilter = new JwtAuthenticationFilter();
        registrationBean.setFilter(jwtAuthenticationFilter);
        return registrationBean;

    }
    public static void main(String[] args) {
//        FaceReg.initialModel("e:/jna/build/weights");

        SpringApplication.run(DemoApplication.class, args);
    }

}
