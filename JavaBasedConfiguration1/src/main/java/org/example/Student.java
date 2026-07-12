package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

@Data
public class Student {
    private int age;
    private int roll;
    private Writer w;

    public Student(){
        System.out.println("Constructor calling.....");
    }

    public void show(){
        System.out.println("In Show Method.....");
    }
    public void writeExam(){
        w.write();
    }

    public void setWriter(Writer w) {
        this.w=w;
    }
}
