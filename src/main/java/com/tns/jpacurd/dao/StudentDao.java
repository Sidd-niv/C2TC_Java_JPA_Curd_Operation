package com.tns.jpacurd.dao;

import com.tns.jpacurd.entities.*;

public interface StudentDao {
	
	public abstract Student_info getStudentById(int id);
	
	public abstract void addStudent(Student_info student);
	
	public abstract void removeStudent(Student_info student);
	
	public abstract void updateStudent(Student_info student);
	
	public abstract void commitTransaction();
	
	public abstract void beginTransaction();

}
