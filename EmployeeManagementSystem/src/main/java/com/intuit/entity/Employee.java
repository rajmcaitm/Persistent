package com.intuit.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.intuit.enums.Gerder;

@Entity
public class Employee extends BaseEntity implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
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

	public Boolean getIsEmpPermanent() {
		return isEmpPermanent;
	}

	public void setIsEmpPermanent(Boolean isEmpPermanent) {
		this.isEmpPermanent = isEmpPermanent;
	}

	public Gerder getGerder() {
		return gerder;
	}

	public void setGerder(Gerder gerder) {
		this.gerder = gerder;
	}

	public Employee() {
    }

	public Employee(Long empId, String empFirstName, String empMiddleName, String empLastName, String empAddress,
			Long empMobileNo, Double empSalary, String empDept, Boolean isEmpPermanent, Gerder gerder) {
		super();
		this.empId = empId;
		this.empFirstName = empFirstName;
		this.empMiddleName = empMiddleName;
		this.empLastName = empLastName;
		this.empAddress = empAddress;
		this.empMobileNo = empMobileNo;
		EmpSalary = empSalary;
		this.empDept = empDept;
		this.isEmpPermanent = isEmpPermanent;
		this.gerder = gerder;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empFirstName=" + empFirstName + ", empMiddleName=" + empMiddleName
				+ ", empLastName=" + empLastName + ", empAddress=" + empAddress + ", empMobileNo=" + empMobileNo
				+ ", EmpSalary=" + EmpSalary + ", empDept=" + empDept + ", isEmpPermanent=" + isEmpPermanent
				+ ", gerder=" + gerder + "]";
	}

}
