package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static jdk.internal.org.jline.utils.Colors.s;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("springconfig.xml");
        Student student = (Student) context.getBean("springconfig");
        student.run();
        student.setAge(10);
        System.out.println(student.getAge());

        System.out.println( "Hello World!" );
    }
}
