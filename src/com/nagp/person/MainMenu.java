package com.nagp.person;

import java.util.Scanner;

import com.nagp.student.StudentsMenu;
import com.nagp.teacher.TeachersMenu;

public class MainMenu {
	@SuppressWarnings("resource")
	public void mainMenu() {
		int choice = 0;
		StudentsMenu sm = new StudentsMenu();
		TeachersMenu tm = new TeachersMenu();
		PersonDetails pd = new PersonDetails();
		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("\n\n--------Menu-----------\n");
			System.out.println("1.Students\n");
			System.out.println("2.Teachers\n");
			System.out.println("3.Display\n");
			System.out.println("4.Exit\n");
			System.out.println("-----------------------");
			System.out.println("\nEnter your choice:\t");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				sm.SMenu();
				break;
			case 2:
				tm.tMenu();
				break;
			case 3:
				pd.getAllDetails();
				break;
			case 4:
				return;

			default:
				System.out.println("\nInvalid choice, Please choose correct choice :");
				System.out.println();
				choice = sc.nextInt();
				break;
			}
		} while (choice != 3);
	}
}
