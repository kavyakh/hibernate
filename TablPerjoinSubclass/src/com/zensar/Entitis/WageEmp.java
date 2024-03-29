package com.zensar.Entitis;

import java.time.LocalDate;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author  Kavya KH
 * @Creation_date 27 Sep 2019 11:50AM
 * @Modification_date 27 Sep 2019 2:46PM
 * @version 3.0
 * @copyright Zensar Technologies.All rights are reserved.
 * @description It is a persistence class
 *
 */
@Entity
@Table(name = "wageemp_2")
public class WageEmp extends Employee {
   	  private int hours;
      private float rate;
      
    public WageEmp() {
    	  
      }

	public WageEmp(int empId, String name, LocalDate joindate, double salary, int hours, float rate) {
		super(empId, name, joindate, salary);
		this.hours = hours;
		this.rate = rate;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	public float getRate() {
		return rate;
	}

	public void setRate(float rate) {
		this.rate = rate;
	}

	@Override
	public String toString() {
		return "WageEmp [hours=" + hours + ", rate=" + rate + "]";
	}
 
}
