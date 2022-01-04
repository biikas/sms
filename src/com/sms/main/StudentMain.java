package com.sms.main;

import com.ems.service.StudentService;
import com.ems.service.StudentServiceImpl;
import com.sms.dto.Student;

public class StudentMain {
	public static void main(String args[]) {
		StudentService sService=	new StudentServiceImpl();
		sService.addStudent(new Student(1,"bikas", 10, "A"));
		sService.addStudent(new Student(2,"bikaas", 1, "B"));
		sService.addStudent(new Student(3,"bikaaas", 2, "C"));
		sService.addStudent(new Student(4,"bikaaaas", 3,"D"));
		sService.addStudent(new Student(5,"bikaaaaas", 9, "E"));
	}
}
