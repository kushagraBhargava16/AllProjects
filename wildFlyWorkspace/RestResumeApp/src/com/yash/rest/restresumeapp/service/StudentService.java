package com.yash.rest.restresumeapp.service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import com.yash.rest.restresumeapp.model.Student;
import com.yash.rest.restresumeapp.util.DBUtil;

public class StudentService {
	public Map<Integer, Student> students = new TreeMap<>();

	public StudentService() {
		/*
		 * Marks tenthMarksSt1 = new Marks(1, 1, "high school", 420); Marks
		 * twelthMarksSt1 = new Marks(2, 1, "higher school", 390); Marks
		 * tenthMarksSt2 = new Marks(3, 2, "high school", 450); Marks
		 * twelthMarksSt2 = new Marks(4, 1, "higher school", 400);
		 * 
		 * Map<Integer, Marks> marksSt1 = new HashMap(); Map<Integer, Marks>
		 * marksSt2 = new HashMap();
		 * 
		 * marksSt1.put(tenthMarksSt1.getMarksId(), tenthMarksSt1);
		 * marksSt1.put(twelthMarksSt1.getMarksId(), twelthMarksSt1);
		 * marksSt2.put(tenthMarksSt2.getMarksId(), tenthMarksSt2);
		 * marksSt2.put(twelthMarksSt2.getMarksId(), twelthMarksSt2);
		 * 
		 * Student student1 = new Student("kushagra", 1, "indore", marksSt1);
		 * 
		 * Student student2 = new Student("nikhil", 2, "dewas", marksSt2);
		 * 
		 * students.put(1, student1); students.put(2, student2);
		 */
	}

	public Student fetchStudentById(int studentId) {
		String sql = "select * from student where id='" + studentId + "'";
		ResultSet resultSet = DBUtil.select(sql);
		Student student = resultsetToStudent(resultSet);
		return student;
	}

	public List<Student> fetchStudentsByCity(String city) {
		String sql = "select * from student where city='" + city + "'";
		ResultSet resultSet = DBUtil.select(sql);
		List<Student> students = new ArrayList<>();
		try {
			while (resultSet.next()) {
				Student student = new Student();
				student.setStudentId(resultSet.getInt("id"));
				student.setName(resultSet.getString("name"));
				student.setCity(resultSet.getString("city"));
				students.add(student);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("error in StudentService");
			e.printStackTrace();
		}
		System.out.println(students);
		return students;
	}

	private Student resultsetToStudent(ResultSet resultSet) {
		Student student = new Student();
		try {
			while (resultSet.next()) {
				student.setStudentId(resultSet.getInt("id"));
				student.setName(resultSet.getString("name"));
				student.setCity(resultSet.getString("city"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("error in StudentService");
			e.printStackTrace();
		}
		return student;
	}

	public List<Student> fetchAllStudents() {
		String sql = "select * from student";
		ResultSet resultSet = DBUtil.select(sql);
		List<Student> students = new ArrayList<>();
		try {
			while (resultSet.next()) {
				Student student = new Student();
				student.setStudentId(resultSet.getInt("id"));
				student.setName(resultSet.getString("name"));
				student.setCity(resultSet.getString("city"));
				students.add(student);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("error in StudentService");
			e.printStackTrace();
		}
		System.out.println(students);
		return students;
		
	}

}
