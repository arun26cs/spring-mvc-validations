package com.canalogies.customer;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Customer{

	private String firstName;
	
	@NotNull(message="is required")
	@Size(min=1,message="is required")
	private String lastName;
	
	@Min(value=1,message="it should be min 1 length")
	@Max(value=10,message="it should be min 10 length")
	private int freepasses;
	
	@NotNull(message="is required") 
	@Pattern(regexp = "^[a-z0-9]{5}",message="only 6 chars or digits long")
	private String postalCode;
	
	
	
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	public int getFreepasses() {
		return freepasses;
	}
	public void setFreepasses(int freepasses) {
		this.freepasses = freepasses;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
}
