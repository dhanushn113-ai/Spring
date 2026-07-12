package org.example;

import lombok.Data;

@Data
public class Dhanush implements Worker{
    private int age;
    private boolean married;
    public Dhanush(){
        System.out.println("Inside Dhanush Constructor....");
    }
    public void work(){
        System.out.println("Work is done by Dhanush...");
    }

    @Override
    public void displayDetails() {
        System.out.println("Age: "+age+" Married: "+married);
    }
}
