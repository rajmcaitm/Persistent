package com.intuit.job;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import com.intuit.entity.Employee;
import com.intuit.enums.Gerder;
import com.intuit.repository.EmployeeRepository;
import com.intuit.serviveImpl.EmployeeServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Scheduler {

    @Autowired
    private EmployeeServiceImpl employeeServiceImpl;
    
    @Autowired
    private EmployeeRepository employeeRepository;

    @Scheduled(fixedRate = 6000)// every one min
    public void cronJobScheduler() {

        addData();
        List<Employee> empList = employeeRepository.findAll();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        Date now = new Date();
        String strDate = sdf.format(now);
        empList.forEach(list -> System.err.println("test: " + strDate + " : " + list));
    }

    public void addData() {
        Employee emp = new Employee(null, "dharya", "patel", "chaudhary", "khalilabd", 9984133844L, 500000.0, "Scientist", true, Gerder.male);
        employeeServiceImpl.saveEmployee(emp);
    }
}