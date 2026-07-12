package org.example;

import org.example.config.MyConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App
{
    public static void main( String[] args )
    {

        ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        Student student = (Student) context.getBean(Student.class);
        student.setAge(12);
        System.out.println(student.getAge());
        student.writeExam();
    }
}
