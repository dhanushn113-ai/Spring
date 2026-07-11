package org.example;

public class Student {
    private int age;
    private int roll;
    private Pen pen;

    public void setAge(int age){
        System.out.println("Setter method is called by Spring...");
        this.age = age;
    }
    public int getAge(){
        return age;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }
    public int getRoll(){
        return roll;
    }
    public void setPen(Pen pen) {
        this.pen = pen;
    }
    public Pen getPen() {
        return pen;
    }
    public void show() {
        System.out.println("In Show Method....");
    }
    public void writeExam(){
        pen.write();

    }

}
