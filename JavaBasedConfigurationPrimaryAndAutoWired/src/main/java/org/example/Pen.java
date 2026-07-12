package org.example;

public class Pen implements Writer {
    public Pen(){
        System.out.println("Inside Pen Constructor....");
    }
    public void write(){
        System.out.println("Writing using Pen.....");
    }

}
