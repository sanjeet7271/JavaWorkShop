package com.nagp.runner;

import com.nagp.filereader.PasswordVerifications;
import com.nagp.person.MainMenu;

public class Runner {
	public static void main(String[] args) {
		PasswordVerifications bool = new PasswordVerifications();
		MainMenu menu=new MainMenu();
		if (bool.passwordVerify()) {
			menu.mainMenu();
		}
	}

}
