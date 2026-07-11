package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("SpringConfig.xml");
        Student student = (Student) context.getBean("std");
        student.setAge(20);
        student.setRoll(1);
        System.out.println(student.getAge());
        System.out.println(student.getRoll());
        student.writeExam();
        student.show();

    }
}
