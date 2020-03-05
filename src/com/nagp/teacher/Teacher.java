package com.nagp.teacher;

import com.nagp.person.Person;

public class Teacher extends Person {
	int employeeId;
	double salary;
	double bonus;

	public Teacher(int employeeId, double salary, double bonus, String FirstName, String StrMiddleName, String LastName,
			String ContactNumber, String Address) {
		super(FirstName, StrMiddleName, LastName, ContactNumber, Address);
		this.employeeId = employeeId;
		this.salary = salary;
		this.bonus = bonus;

	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	@Override
	public String toString() {
		return "Teacher [employeeId=" + employeeId + ", salary=" + salary + ", bonus=" + bonus + ", FirstName="
				+ FirstName + ", StrMiddleName=" + StrMiddleName + ", LastName=" + LastName + ", ContactNumber="
				+ ContactNumber + ", Address=" + Address + "]";
	}

}
