package com.nagp.student;

import com.nagp.person.Person;

public class Student extends Person{
	int RollNumber;
	int Marks;
	public Student(int RollNumber,int Marks,String FirstName, String StrMiddleName,String LastName,String ContactNumber, String Address) {
		super(FirstName,StrMiddleName,LastName,ContactNumber,Address);
		this.RollNumber=RollNumber;
		this.Marks=Marks;
	}
	public int getRollNumber() {
		return RollNumber;
	}
	
	public int getMarks() {
		return Marks;
	}
	public void setMarks(int marks) {
		Marks = marks;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + RollNumber;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (RollNumber != other.RollNumber)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Student [RollNumber=" + RollNumber + ", Marks=" + Marks + ", FirstName=" + FirstName
				+ ", StrMiddleName=" + StrMiddleName + ", LastName=" + LastName + ", ContactNumber=" + ContactNumber
				+ ", Address=" + Address + "]";
	}
	
}
