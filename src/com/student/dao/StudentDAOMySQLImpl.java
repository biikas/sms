package com.student.dao;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
//import java.sql.Statement;
import java.util.List;

import com.sms.dto.Student;

public class StudentDAOMySQLImpl implements IStudentDAO {
	
	private Connection con=null;
	private PreparedStatement pst=null;
	private ResultSet rs= null;
	public static final String INS_COMMAND ="INSERT INTO student values(?,?,?,?)";
	
	
	public StudentDAOMySQLImpl() {
		try {
			con=DriverManager.getConnection(IStudentDAO.URL,IStudentDAO.USERNAME,IStudentDAO.PASSWORD);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Cannot establish a connection");
			e.printStackTrace();
		}
	}

	@Override
	public void addStudent(Student s) {
		//addingStudent
		int i =0;
		try {
			pst=con.prepareStatement(INS_COMMAND);
			pst.setInt(1, s.getId());
			pst.setString(2, s.getName());
			pst.setInt(3, s.getGrade());
			pst.setString(4, s.getSection());
			i = pst.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println();
		}
		if(i>1) {
			System.out.println("NewData Added");
		}
		
		
		
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
