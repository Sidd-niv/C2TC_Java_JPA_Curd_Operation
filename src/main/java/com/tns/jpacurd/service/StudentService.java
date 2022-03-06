package com.tns.jpacurd.service;

import com.tns.jpacurd.entities.Student_info;

public interface StudentService 
{
	public abstract void addStudent(Student_info student);
	
	public abstract void updateStudent(Student_info student);
	
	public abstract void removeStudent(Student_info student);
	
	public abstract Student_info findStudentById(int id);

}
