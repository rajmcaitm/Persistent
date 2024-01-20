package com.intuit.util;

import com.intuit.entity.Employee;
import com.intuit.enums.Gerder;
import com.intuit.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class DbInit {

    @Autowired
    private EmployeeRepository employeeRepository;

    @PostConstruct
    private void postConstruct() {
        Employee admin = new Employee(null, "dharya", "patel", "chaudhary", "khalilabd", 9984133844L, 500000.0, "Scientist", true, Gerder.male);
        Employee normalUser = new Employee(null, "dharya", "patel", "chaudhary", "khalilabd", 9984133844L, 500000.0, "Scientist", true, Gerder.male);
        //User admin = new User("admin", "admin password");
        //User normalUser = new User("user", "user password");
        employeeRepository.save(admin);
        employeeRepository.save(normalUser);
    }

    @PreDestroy
    public void preDestroy() {
        //dbConnection.close();
        System.out.println("User deleted!");
        //employeeRepository.delete();
    }
}