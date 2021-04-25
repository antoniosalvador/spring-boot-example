package com.examplespringboot.rest.model;

public class Client {

	private Integer id;
    private String fullName;    
    private String email;
    private String street;
    private String city;
    private String zipCode;
    private String telephone;
    
    public Client(Integer id, 
    		String fullName, 
    		String email, 
    		String street, 
    		String city, 
    		String zipCode, 
    		String telephone) 
    {
    	this.id = id;
    	this.fullName = fullName;
    	this.email = email;
    	this.street = street;
    	this.city = city;
    	this.zipCode = zipCode;
    	this.telephone = telephone;
    }
           
    public Integer getId() {
		return id;
	}
    
    public void setId(Integer id) {
		this.id = id;
	}
    
    public String getFullName() {
		return fullName;
	}
    
    public void setFullName(String fullName) {
		this.fullName = fullName;
	}
    
    public String getEmail() {
		return email;
	}
    
    public void setEmail(String email) {
		this.email = email;
	}
    
    public String getCity() {
		return city;
	}
    
    public void setCity(String city) {
		this.city = city;
	}
    
    public String getStreet() {
		return street;
	}
    
    public void setStreet(String street) {
		this.street = street;
	}
    
    public String getTelephone() {
		return telephone;
	}
    
    public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
    
    public String getZipCode() {
		return zipCode;
	}
       
    public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
}
