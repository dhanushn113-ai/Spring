package org.example;

import org.example.config.MyConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        Student s = (Student) context.getBean(Student.class);
        s.writeExam();
        System.out.println(s.getAge());

    }
}
