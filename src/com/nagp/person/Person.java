package com.nagp.person;

public class Person {
	
	protected String FirstName;
	protected String StrMiddleName;
	protected String LastName;
	protected String ContactNumber;
	protected String Address;
	
	public Person(String FirstName, String StrMiddleName,String LastName,String ContactNumber, String Address) {
		this.FirstName=FirstName;
		this.StrMiddleName=StrMiddleName;
		this.LastName=LastName;
		this.ContactNumber=ContactNumber;
		this.Address=Address;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getStrMiddleName() {
		return StrMiddleName;
	}
	public void setStrMiddleName(String strMiddleName) {
		StrMiddleName = strMiddleName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getContactNumber() {
		return ContactNumber;
	}
	public void setContactNumber(String contactNumber) {
		ContactNumber = contactNumber;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}	
	

}
