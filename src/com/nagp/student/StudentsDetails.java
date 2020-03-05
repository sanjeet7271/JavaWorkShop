package com.nagp.student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class StudentsDetails {
	private static List<Student> studentList = new ArrayList<>();

	@SuppressWarnings("resource")
	public void studentEntry() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter the roll :");
		int roll = sc.nextInt();
		System.out.print("Please enter the marks :");
		int marks = sc.nextInt();
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

		Student st = new Student(roll, marks, sName, mName, lName, contact, address);
		studentList.add(st);
		displayStudentsDetails();
	}

	@SuppressWarnings("resource")
	public void removeStudent() {

		Scanner sc = new Scanner(System.in);
		if (studentList.size() > 0) {
			System.out.println("Please enter student roll number to remove");
			int roll = sc.nextInt();

			for (int i = 0; i < studentList.size(); i++) {
				if (roll == studentList.get(i).getRollNumber()) {
					System.out.println("student " + studentList.get(i) + " is removed successfully from the database");
					studentList.remove(i);
					break;
				} else {
					System.out.println("Roll number doest not exit please enter correct rollnumber");
					removeStudent();
				}
				displayStudentsDetails();
			}
		} else {
			System.out.println("student data is empty, please enter some data into database!!");
		}

	}

	public void displayStudentsDetails() {
		if (studentList.size() > 0) {
			for (int i = 0; i < studentList.size(); i++) {
				System.out.println(studentList.get(i));
			}
		} else {
			System.out.println("student data is empty, please enter some data into database!!");
			studentEntry();
		}
	}

	public List<Student> getStudentsDetails() {

		return studentList;

	}

}
