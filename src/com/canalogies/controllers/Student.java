package com.canalogies.controllers;

import java.util.LinkedHashMap;

public class Student {

	private String firstName;
	private String secondName;
	private String country;
	private LinkedHashMap<String, String> countryOptions;
	public String languageKnown;
	private LinkedHashMap<String, String> languageOptions;
	private String[] operatingSystem;
	
	public String[] getOperatingSystem() {
		return operatingSystem;
	}
	public void setOperatingSystem(String[] operatingSystem) {
		this.operatingSystem = operatingSystem;
	}
	public LinkedHashMap<String, String> getLanguageOptions() {
		return languageOptions;
	}
	public String getLanguageKnown() {
		return languageKnown;
	}
	public void setLanguageKnown(String languageKnown) {
		this.languageKnown = languageKnown;
	}
	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getSecondName() {
		return secondName;
	}
	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}
	
	public Student() {
		countryOptions=new LinkedHashMap<String, String>();
		countryOptions.put("Br", "Brazil");
		countryOptions.put("Gr", "Germany");
		countryOptions.put("In", "India");
		countryOptions.put("Pk", "Pakistan");
		
		languageOptions = new LinkedHashMap<String, String>();
		languageOptions.put("c++", "c++");
		languageOptions.put("java", "java");
	}
}
