package com.nagp.filereader;

import java.util.Scanner;

public class PasswordVerifications {
	static int attempt = 4;

	@SuppressWarnings("resource")
	public boolean passwordVerify() {
		ReadFile reader = new ReadFile();
		String dataPassword = reader.readPassword();
		System.out.println(dataPassword);

		boolean bool = false;
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter password to display Menu :");
		String userPassword = sc.nextLine();
		while (attempt != 0) {
			if (dataPassword.equals(userPassword)) {
				bool = true;
				break;
			} else {
				attempt--;
				System.out.println("You entered incorrect password, Try again");
				if (attempt != 0) {
					System.out.println("You have left attempt " + attempt);
					System.out.print("Please enter password to display Menu :");
					userPassword = sc.nextLine();
				}

			}

		}
		if (attempt == 0) {
			
			System.out.println("*****system blocked you, Try some other time*******");
		}
		return bool;

	}
}
