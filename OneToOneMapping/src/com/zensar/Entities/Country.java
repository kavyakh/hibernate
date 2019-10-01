package com.zensar.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

/**
 * @author Kavya KH
 * @Creation_date 27 sep 2019 2:56Pm
 * @Modification_Date 27 sep 2019 2:57Pm
 * @version 4.0
 * @copyright ZenSar Technologies.All rights are Reserved.
 * 
 */
@Entity
public class Country {
	 @Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
     private int countryId;
     private String name;
     private String language;
     private long population;
     @OneToOne
     @JoinColumn(name = "flag")
     private Flag flag;
	
     
    public int getCountryId() {
		return countryId;
	}
	public void setCountryId(int countryId) {
		this.countryId = countryId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public long getPopulation() {
		return population;
	}
	public void setPopulation(long population) {
		this.population = population;
	}
	public Flag getFlag() {
		return flag;
	}
	public void setFlag(Flag flag) {
		this.flag = flag;
	}
         
}

