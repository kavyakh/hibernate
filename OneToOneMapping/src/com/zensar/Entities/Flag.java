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
public class Flag {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private int flagId;
   private String flagName;
   private String description;
   //@OneToOne
    @OneToOne(mappedBy = "flag")
    private Country country;

    public int getFlagId() {
	return flagId;
   }
   public void setFlagId(int flagId) {
	this.flagId = flagId;
    }
    public String getFlagName() {
	return flagName;
   }
    public void setFlagName(String flagName) {
	this.flagName = flagName;
   }
    public String getDescription() {
	return description;
   }
   public void setDescription(String description) {
	this.description = description;
   }
    public Country getCountry() {
	return country;
   }
    public void setCountry(Country country) {
	this.country = country;
   }
   
   
}
