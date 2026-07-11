package org.example;

public class Student {
    private int age;
    private int roll;
    private Writer writer;

    public Student(int age, int roll, Writer writer) {
        System.out.println("Parameterized constructor called.....");
        this.age = age;
        this.roll = roll;
        this.writer = writer;
    }
    public void writeExam(){
        writer.write();

    }
    public Student(){

    }

}
