package com.zensar.Entitis;

import java.time.LocalDate;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
/**
 * @author  Kavya KH
 * @Creation_date 27 Sep 2019 11:27AM
 * @Modification_date 27 Sep 2019 2:18PM
 * @version 2.0
 * @copyright Zensar Technologies.All rights are reserved.
 * @description It is a persistence class
 *
 */
@Entity
@Table(name="emp_master_1")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Employee {
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	private int empId;
	private String name;
	private LocalDate joindate;
	private double salary;
	
public Employee(){
		

}

public Employee(int empId, String name, LocalDate joindate, double salary) {
	super();
	this.empId = empId;
	this.name = name;
	this.joindate = joindate;
	this.salary = salary;
}

public int getEmpId() {
	return empId;
}
public void setEmpId(int empId) {
	this.empId = empId;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public LocalDate getJoindate() {
	return joindate;
}
public void setJoindate(LocalDate joindate) {
	this.joindate = joindate;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
@Override
public String toString() {
	return "Employee [empId=" + empId + ", name=" + name + ", joindate=" + joindate + ", salary=" + salary + "]";
}
}

