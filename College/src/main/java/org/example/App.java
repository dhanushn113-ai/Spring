package org.example;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import javax.xml.namespace.QName;

/**
 * Hello world!
 *
 */


public class App 
{
    public static void main(String[] args)
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("Spring1.xml");
        Student student = (Student) context.getBean("std1");
        student.run();

    }
}
