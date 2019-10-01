package com.zensar.Entities;

import java.sql.Blob;
import java.sql.Clob;
import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



/**
 * @author Kavya KH
 * @Creation_date 26th Sep 2019 2.55pm
 * @modification  26th Sep 2019 2.55pm
 * @version 1.0
 * @copyright Zensar Technologies. All rights are reserved.
 * @description It is persistance class
   
 */
@Entity
@Table (name="customer")

public class Customer {
   @Id 
   @Column (name="cId")
   private int customerId;
   private Name customerName;
   private int age;
   private String gender;
   private String address;
   private LocalDate birthdate;
   private Blob profilephoto;
   private Clob description;
   
   public Customer() {
	// TODO Auto-generated constructor stub
}



public Customer(int customerId, Name customerName, int age, String gender, String address) {
	super();
	this.customerId = customerId;
	this.customerName = customerName;
	this.age = age;
	this.gender = gender;
	this.address = address;
	this.birthdate = birthdate;
	this.profilephoto = profilephoto;
	this.description = description;
}

public int getCustomerId() {
	return customerId;
}

public void setCustomerId(int customerId) {
	this.customerId = customerId;
}

public Name getCustomerName() {
	return customerName;
}

public void setCustomerName(Name customerName) {
	this.customerName = customerName;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

public String getGender() {
	return gender;
}

public void setGender(String gender) {
	this.gender = gender;
}


public String getAddress() {
	return address;
}


public void setAddress(String address) {
	this.address = address;
}



public LocalDate getBirthdate() {
	return birthdate;
}



public void setBirthdate(LocalDate birthdate) {
	this.birthdate = birthdate;
}



public Blob getProfilephoto() {
	return profilephoto;
}



public void setProfilephoto(Blob profilephoto) {
	this.profilephoto = profilephoto;
}

public Clob getDescription() {
	return description;
}

public void setDescription(Clob description) {
	this.description = description;
}



@Override
public String toString() {
	return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", age=" + age + ", gender="
			+ gender + "]";
}
   
}
