package org.example;
import org.example.db.Testtable;
import org.example.service.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class Main {
    public static void main(String[] args) throws Exception {
        ApplicationContext context = SpringApplication.run(Main.class, args);
        UserService us = context.getBean(UserService.class);

//        List<Testtable> tt = us.getAll();
//        System.out.println(tt.get(0).getAge());
        Testtable testtable = new Testtable();
        testtable.setAge(21112);
        testtable.setName("Stray2228");
        testtable.setSurname("Понасенков");

        us.updateAllBySurname(testtable, "Понасенков");
//        us.insert(t);
    }
}