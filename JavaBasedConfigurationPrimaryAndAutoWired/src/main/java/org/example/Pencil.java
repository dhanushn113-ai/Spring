package org.example;

public class Pencil implements Writer {
    public Pencil(){
        System.out.println("Inside Pencil Constructor...");
    }
    public void write(){
        System.out.println("Writing using Pencil");
    }
}
