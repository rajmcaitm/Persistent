package com.intuit.repository;

import com.intuit.entity.Employee;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

     @Query("SELECT e FROM Employee e WHERE " +
            "e.empFirstName LIKE CONCAT('%',:query, '%') " +
            "OR e.empMiddleName LIKE CONCAT('%',:query, '%') " +
            "Or e.empLastName LIKE CONCAT('%', :query, '%')")
    List<Employee> searchEmployee(String query);
    
    @Query(value = "SELECT * FROM Employee WHERE is_emp_permanent = ?1", nativeQuery=true)
    List<Employee> getAllPermanentEmpList(Boolean flag);
}
