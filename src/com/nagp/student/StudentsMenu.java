package com.nagp.student;

import java.util.Scanner;

public class StudentsMenu {
	StudentsDetails sd = new StudentsDetails();
	//MainMenu menu=new MainMenu();
	@SuppressWarnings("resource")
	public void SMenu() {
		int choice;
		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("\n\n--------Student's Menu-----------\n");
			System.out.println("1.Add\n");
			System.out.println("2.Remove\n");
			System.out.println("3.Display\n");
			System.out.println("4.Exit\n");
			System.out.println("\nEnter your choice:\t");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				sd.studentEntry();
				break;
			case 2:
				sd.removeStudent();
				break;
			case 3:
				sd.displayStudentsDetails();
				break;
			case 4:
				
				return;
			default:
				System.out.println("\nInvalid choice, Please choose correct menu :");
				choice = sc.nextInt();
				break;
			}
		} while (choice != 3);
	}
}
