package com.nagp.teacher;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class TeachersDetails {
	public static List<Teacher> teacherList = new ArrayList<>();

	@SuppressWarnings({ "unused", "resource" })
	public void teacherEntry() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter Employee ID :");
		int employeeID = sc.nextInt();
		System.out.print("Please enter Employee Salary :");
		double salary = sc.nextDouble();
		System.out.print("Please enter Employee Bonus :");
		double bonus = sc.nextDouble();
		sc.nextLine();
		System.out.print("Please enter student's first name :");
		String sName = sc.nextLine();
		System.out.print("Please enter student's middle name :");
		String mName = sc.nextLine();
		System.out.print("Please enter student's last name :");
		String lName = sc.nextLine();
		System.out.print("Please enter contact :");
		String contact = sc.nextLine();
		System.out.print("Please enter address :");
		String address = sc.nextLine();

		Teacher te = new Teacher(employeeID, salary, bonus, sName, mName, lName, contact, address);

		teacherList.add(te);
		displayTeachersDetails();
	}

	@SuppressWarnings("resource")
	public void removeTeacher() {
		Scanner sc = new Scanner(System.in);
		if (teacherList.size() > 0) {
			System.out.println("Please enter Teacher Emloyee ID to remove");
			int roll = sc.nextInt();
			for (int i = 0; i < teacherList.size(); i++) {
				if (roll == teacherList.get(i).getEmployeeId()) {
					System.out.println("employee " + teacherList.get(i) + " is removed successfully from the database");
					teacherList.remove(i);
					break;
				} else {
					System.out.println("employee ID does'nt not exit please enter correct employee ID");
					removeTeacher();
				}

			}
			displayTeachersDetails();
		} else {
			System.out.println("Teacher data is empty, please enter some data into database!!");

		}
	}

	public void displayTeachersDetails() {
		if (teacherList.size() > 0) {
			for (int i = 0; i < teacherList.size(); i++) {
				System.out.println(teacherList.get(i));
			}
		} else {
			System.out.println("student data is empty, please enter some data into database!!");
			teacherEntry();
		}
	}
	public List<Teacher> getTeachersDetails(){
		return teacherList;
		
	}
}
