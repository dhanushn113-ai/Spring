package org.example;

public class Student {
    private int age;
    private Writer writer;

    public Writer getWriter() {
        return writer;
    }

    public void setWriter(Writer writer) {
        this.writer = writer;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void run(){

        System.out.println("hello");
    }
    public void writer(){
        Pen.write();
    }


}
