package com.tns.jpacurd.client;

import com.tns.jpacurd.entities.*;
import com.tns.jpacurd.service.*;

public class Client {

	public static void main(String[] args) {
		
		Student_info student = new Student_info();
		
		StudentService services = new StudentServiceImpl();
		
		// CURD Operations
		
		// Create Operation
//		student.setStudId(2);
//		student.setStudName("Aditya");
//		services.addStudent(student);
		
		// Read Operation
//		try {
//			student = services.findStudentById(4);
//			System.out.println("ID:"+student.getStudId());
//			System.out.println("Name:"+student.getStudName()); 
//		}catch (NullPointerException ex) {
//			System.out.println(ex.getMessage()+" "+ex.getClass());
//		}

		
		// Update Operation
//		student = services.findStudentById(1);
//		student.setStudName("Siddhant Nivilkar");
//		services.updateStudent(student);
		
		// Delete operation
//		student = services.findStudentById(4);
//		services.removeStudent(student);
		
		


	}

}
