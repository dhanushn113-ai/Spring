package org.example;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;

@Data
public class Ganesh implements Worker{
    @Value("12")
    private int age;
    @Value("true")
    private boolean married;

    public Ganesh(){
        System.out.println("Inside Ganesh Constructor...");

    }

    public void work(){
        System.out.println("wok is done by ganesh...");
    }

    @Override
    public void displayDetails() {
        System.out.println("Age: "+age+" Married: "+married);
    }

}
