package org.example;

public class Student {


    private int age;
    private int roll;
    private Writer writer;

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void setWriter(Writer writer) {
        this.writer = writer;
    }

    public void writeExam(){
        writer.write();
    }
}
