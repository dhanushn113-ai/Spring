package org.example.config;

import org.example.Pen;
import org.example.Pencil;
import org.example.Student;
import org.example.Writer;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class MyConfig {

    @Bean
    public Student student(@Qualifier("pen") Writer writer){
        Student st = new Student();
        st.setAge(23);
        st.setWriter(writer);
        return st;
    }
    @Bean
    @Primary
    public Pen pen(){
        return new Pen();
    }
    @Bean
    @Primary
    public Pencil pencil(){
        return new Pencil();
    }


}
