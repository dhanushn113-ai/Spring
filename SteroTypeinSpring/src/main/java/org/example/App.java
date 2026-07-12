package org.example;

import org.example.config.MyConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        Student student = context.getBean(Student.class);
        student.setAge(23);
        System.out.println(student.getAge());
        System.out.println(student.getRoll());
        student.writeExam();
    }
}
