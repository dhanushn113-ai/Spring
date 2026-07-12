package org.example;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
public class Balakrishna implements Worker{
    private int age;
    private boolean married;
    public Balakrishna() {
        System.out.println("Inside BalaKrishna Constructor....");
    }

    @Override
    public void work(){
        System.out.println("Work is done by Balakrishna....");
    }

    @Override
    public void displayDetails() {
        System.out.println("Age: "+age+" Married: "+married);
    }
}
