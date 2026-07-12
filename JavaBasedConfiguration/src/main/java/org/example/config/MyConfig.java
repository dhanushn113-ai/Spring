package org.example.config;

import org.example.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration

public class MyConfig {
    @Bean(name="s1")
    public Student student(){
        return new Student();
    }

}
