package com.intuit.service;

import com.intuit.dto.EmployeeDto;
import com.intuit.entity.Employee;
import com.intuit.exception.ResourceNotFoundException;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.http.ResponseEntity;

public interface EmployeeService {

    public List<Employee> getAllEmployees();

    public Optional<Employee> getEmployeeById(Long id);

    public Employee saveEmployee(Employee employee);

    public Employee updateEmployee(Long id, Employee employee) throws ResourceNotFoundException;

    public Employee partialUpdateEmployee(Long id, Map<String, Object> partialUpdateEmp) throws ResourceNotFoundException;

    public void deleteEmployee(Long id);
    
    public List<Employee> getAllPermanentEmpList(Boolean flag);

    List<Employee> searchEmployee(String query);

    EmployeeDto testModelMapper(Employee employee);

}