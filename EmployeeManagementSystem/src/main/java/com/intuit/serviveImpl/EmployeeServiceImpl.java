package com.intuit.serviveImpl;

import com.intuit.dto.EmployeeDto;
import com.intuit.entity.Employee;
import com.intuit.exception.ResourceNotFoundException;
import com.intuit.repository.EmployeeRepository;
import com.intuit.service.EmployeeService;
import com.intuit.util.SystemLoggedInUserAuditorAware;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ReflectionUtils;

import java.lang.reflect.Field;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private final EmployeeRepository employeeRepository;
    
    @Autowired
    private final SystemLoggedInUserAuditorAware systemLoggedInUserAuditorAware;

    @Autowired
    private ModelMapper modelMapper;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository, SystemLoggedInUserAuditorAware systemLoggedInUserAuditorAware) {
        this.employeeRepository = employeeRepository;
		this.systemLoggedInUserAuditorAware = systemLoggedInUserAuditorAware;
    }

    public List<Employee> getAllEmployees() {
        List<Employee> employeeList = employeeRepository.findAll().stream().sorted(Comparator.comparing(Employee::getEmpFirstName)).collect(Collectors.toList());
        return employeeList;
    }

    public Optional<Employee> getEmployeeById(Long id) {
    	return employeeRepository.findById(id);
    }

    public Employee saveEmployee(Employee employee) {
        employee.setEmpFirstName(employee.getEmpFirstName().substring(0, 1).toUpperCase() + employee.getEmpFirstName().substring(1).toLowerCase());
        employee.setEmpMiddleName(employee.getEmpMiddleName().substring(0, 1).toUpperCase() + employee.getEmpMiddleName().substring(1).toLowerCase());
        employee.setEmpLastName(employee.getEmpLastName().substring(0, 1).toUpperCase() + employee.getEmpLastName().substring(1).toLowerCase());
        employee.setUpdatedBy(systemLoggedInUserAuditorAware.getCurrentAuditor().get());
        if (employee.getCreatedOn() == null) {
        	employee.setCreatedBy(systemLoggedInUserAuditorAware.getCurrentAuditor().get());
		}
        return employeeRepository.save(employee);
    }

    @Override
    public Employee updateEmployee(Long id, Employee employee) throws ResourceNotFoundException {
        Employee existingEmployee = employeeRepository
                .findById(id)
                .orElseThrow(() ->
                        new ResourceNotFoundException(String.format("Employee not found for Id %s", id)));

        existingEmployee.setEmpId(id);
        existingEmployee.setEmpFirstName(employee.getEmpFirstName());
        existingEmployee.setEmpMiddleName(employee.getEmpMiddleName());
        existingEmployee.setEmpLastName(employee.getEmpLastName());
        existingEmployee.setEmpDept(employee.getEmpDept());
        existingEmployee.setEmpAddress(employee.getEmpAddress());
        existingEmployee.setEmpSalary(employee.getEmpSalary());
        existingEmployee.setEmpMobileNo(employee.getEmpMobileNo());
        existingEmployee.setIsEmpPermanent(employee.getIsEmpPermanent());

        return saveEmployee(existingEmployee);
    }

    @Override
    public Employee partialUpdateEmployee(Long id, Map<String, Object> partialUpdateEmp) throws ResourceNotFoundException {
        Employee existingEmployee = employeeRepository.findById(id)
                .orElseThrow(() ->
                        new ResourceNotFoundException(String.format("Employee not found for Id %s", id)));

        partialUpdateEmp.forEach((key, value) -> {
            Field field = ReflectionUtils.findField(Employee.class, key);
            System.err.println(key+" : "+field);
            if (field != null) {
                field.setAccessible(true);
                System.err.println(value);
                ReflectionUtils.setField(field, existingEmployee, value);
            }
        });

        return saveEmployee(existingEmployee);
    }

    public void deleteEmployee(Long id) {
        employeeRepository.deleteById(id);
    }
    
    @Override
	public List<Employee> getAllPermanentEmpList(Boolean flag) {
    	System.err.print("flag: "+flag);
		return employeeRepository.getAllPermanentEmpList(flag);
	}

    @Override
    public List<Employee> searchEmployee(String query) {
        List<Employee> products = employeeRepository.searchEmployee(query);
        return products;
    }

    @Override
    public EmployeeDto testModelMapper(Employee employee) {
        Employee dbEmployee = saveEmployee(employee);
        return modelMapper.map(dbEmployee, EmployeeDto.class);
    }
}
