package com.intuit.dto;

import com.intuit.enums.Gerder;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

public class EmployeeDto {

    private Long empId;
    private String empFirstName;
    private String empMiddleName;
    private String empLastName;
    private String empAddress;
    private Long empMobileNo;
    private Double EmpSalary;
    private String empDept;
    private Boolean isEmpPermanent;

    @Enumerated(EnumType.STRING)
    private Gerder gerder;

    public Long getEmpId() {
        return empId;
    }

    public void setEmpId(Long empId) {
        this.empId = empId;
    }

    public String getEmpFirstName() {
        return empFirstName;
    }

    public void setEmpFirstName(String empFirstName) {
        this.empFirstName = empFirstName;
    }

    public String getEmpMiddleName() {
        return empMiddleName;
    }

    public void setEmpMiddleName(String empMiddleName) {
        this.empMiddleName = empMiddleName;
    }

    public String getEmpLastName() {
        return empLastName;
    }

    public void setEmpLastName(String empLastName) {
        this.empLastName = empLastName;
    }

    public String getEmpAddress() {
        return empAddress;
    }

    public void setEmpAddress(String empAddress) {
        this.empAddress = empAddress;
    }

    public Long getEmpMobileNo() {
        return empMobileNo;
    }

    public void setEmpMobileNo(Long empMobileNo) {
        this.empMobileNo = empMobileNo;
    }

    public Double getEmpSalary() {
        return EmpSalary;
    }

    public void setEmpSalary(Double empSalary) {
        EmpSalary = empSalary;
    }

    public String getEmpDept() {
        return empDept;
    }

    public void setEmpDept(String empDept) {
        this.empDept = empDept;
    }

    public Boolean getEmpPermanent() {
        return isEmpPermanent;
    }

    public void setEmpPermanent(Boolean empPermanent) {
        isEmpPermanent = empPermanent;
    }

    public Gerder getGerder() {
        return gerder;
    }

    public void setGerder(Gerder gerder) {
        this.gerder = gerder;
    }
}
