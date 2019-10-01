package com.zensar.Entities;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import com.sun.istack.Nullable;

/**
 * @author Kavya KH
 * @Creation_date 26th Sep 2019 2.48pm
 * @modification  26th Sep 2019 2.48pm
 * @version 1.0
 * @copyright Zensar Technologies. All rights are reserved.
 
 */
@Embeddable
public class Name {
	@Column (name="first",length = 30)
	private String FirstName;
	@Column (name="middle",length = 30)
	//@Nullable(false)
	private String MiddleName;
	private String LastName;
	
 public Name() {
	
}
		
    public Name(String firstName, String middleName, String lastName) {
		super();
		this.FirstName = firstName;
		this.MiddleName = middleName;
		this.LastName = lastName;
	}


  public void setFirstName(String firstName) {
		FirstName = firstName;
	}
  
	public String getMiddleName() {
		return MiddleName;
	}
	public void setMiddleName(String middleName) {
		MiddleName = middleName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	@Override
	public String toString() {
		return "Name [FirstName=" + FirstName + ", MiddleName=" + MiddleName + ", LastName=" + LastName + "]";
	}

}

