package org.example;


import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class Student {
    private int age;
    @Value("41")
    private int roll;
//    @Autowired                      //fieldInjection
//    @Qualifier("pen")
    private Writer writer;

    public Student(){
        System.out.println("Student Constructor");
    }

   public void writeExam(){
       writer.write();
   }
    @Autowired
    @Qualifier("pencil")                         //SetterInjection
    public void setWriter(Writer writer) {
        this.writer = writer;
    }

    //@Autowired                                     //Constrictor Injection
    public Student(Writer writer) {
        this.writer = writer;
    }
}
