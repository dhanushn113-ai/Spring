package org.example;

public class Student {
    private int age;
    private int roll;
    private Writer writer;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public void setWriter(Writer writer) {
        this.writer = writer;
    }

    public void show(){
        System.out.println("Inside show method.....");
    }
    public void writeExam(){
        writer.write();

    }
}
