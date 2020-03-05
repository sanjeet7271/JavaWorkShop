package com.nagp.teacher;

import java.util.Scanner;

public class TeachersMenu {
	TeachersDetails td=new TeachersDetails();
	@SuppressWarnings("resource")
	public void tMenu() {
		int choice;

		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("\n\n--------Teacher's Menu-----------\n");
			System.out.println("1.Add\n");
			System.out.println("2.Remove\n");
			System.out.println("3.Display\n");
			System.out.println("4.Exit\n");
			System.out.println("\nEnter your choice:\t");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				 td.teacherEntry();
				break;
			case 2:
				td.removeTeacher();
				break;
			case 3:
				td.displayTeachersDetails();
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
