package org.example;

/**
 * Hello world!
 *
 */
public class Main
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Student s = new Student();
        s.setAge(12);
        System.out.println(s.getAge());
        System.out.println(s.toString());
    }
}
