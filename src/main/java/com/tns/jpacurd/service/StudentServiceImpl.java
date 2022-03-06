package com.tns.jpacurd.service;

import com.tns.jpacurd.dao.*;
import com.tns.jpacurd.entities.*;

public class StudentServiceImpl implements StudentService {

	private StudentDao dao;
	
	public StudentServiceImpl()
	{
		dao = new StudentDaoImpl();
		
	}

	@Override
	public void addStudent(Student_info student) {
		dao.beginTransaction();
		dao.addStudent(student);
		dao.commitTransaction();
		
	}

	@Override
	public void updateStudent(Student_info student) {
		dao.beginTransaction();
		dao.updateStudent(student);
		dao.commitTransaction();
		
	}

	@Override
	public void removeStudent(Student_info student) {
		dao.beginTransaction();
		dao.removeStudent(student);
		dao.commitTransaction();
		
	}

	@Override
	public Student_info findStudentById(int id) {
		Student_info student = dao.getStudentById(id);
		return student;
	}

}
