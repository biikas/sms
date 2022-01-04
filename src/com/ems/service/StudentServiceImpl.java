package com.ems.service;

import java.util.List;

import com.sms.dto.Student;
import com.student.dao.IStudentDAO;
import com.student.dao.StudentDAOMySQLImpl;

public class StudentServiceImpl implements StudentService{
	
	
	IStudentDAO stuDAO = new StudentDAOMySQLImpl();
	
	@Override
	public void addStudent(Student s) {
		stuDAO.addStudent(s);
		
		
		
	}

	@Override
	public void deleteStudent(int stuid) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateStudent(Student s) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void findStudent(Student s) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Student> showAllStudent() {
		// TODO Auto-generated method stub
		return null;
	}

}
