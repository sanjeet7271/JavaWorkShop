package com.nagp.person;

import java.util.ArrayList;
import java.util.List;

import com.nagp.student.Student;
import com.nagp.student.StudentsDetails;
import com.nagp.teacher.Teacher;
import com.nagp.teacher.TeachersDetails;

public class PersonDetails {
	StudentsDetails std = new StudentsDetails();
	TeachersDetails tsd = new TeachersDetails();
	MainMenu mm = new MainMenu();

	public void getAllDetails() {
		List<Object> person = new ArrayList<>();
		List<Student> student = std.getStudentsDetails();
		List<Teacher> teacher = tsd.getTeachersDetails();
		for (int i = 0; i < student.size(); i++) {
			person.add(student.get(i));
		}
		for (int k = 0; k < teacher.size(); k++) {
			person.add(teacher.get(k));
		}
		if(!person.isEmpty()) {
		for (int j = 0; j < person.size(); j++) {
			System.out.println(person.get(j));
		}
		}else {
			System.out.println("Person database is empty!!");
			System.out.println("Please insert some student or Teachers data to display");
			mm.mainMenu();
		}
		
	}
}
