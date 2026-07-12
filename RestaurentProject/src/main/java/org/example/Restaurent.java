package org.example;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;


@Data
public class Restaurent {

    @Autowired
    private Worker worker;

    public void workerName(){
        worker.work();
        worker.displayDetails();
    }



}
