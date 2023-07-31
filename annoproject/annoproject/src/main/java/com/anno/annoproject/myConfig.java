package com.anno.annoproject;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages= {"mypack"})
public class myConfig {

    @Bean
    public Employee getnewemployee(){
        return new Employee();
    }

}
