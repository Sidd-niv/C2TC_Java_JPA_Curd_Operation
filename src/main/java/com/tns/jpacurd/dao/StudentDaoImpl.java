package com.tns.jpacurd.dao;

import javax.persistence.EntityManager;
import com.tns.jpacurd.entities.*;

public class StudentDaoImpl implements StudentDao {

	private EntityManager entityManager;
	
	public StudentDaoImpl() 
	{
		entityManager = JPAUtil.getEntityManager();
	}

	@Override
	public Student_info getStudentById(int id) {
		Student_info student = entityManager.find(Student_info.class, id);
		return student;
	}

	@Override
	public void addStudent(Student_info student) {
		entityManager.persist(student);
		
	}

	@Override
	public void removeStudent(Student_info student) {
		entityManager.remove(student);
		
	}

	@Override
	public void updateStudent(Student_info student) {
		entityManager.merge(student);
		
	}

	@Override
	public void commitTransaction() {
		entityManager.getTransaction().commit();
		
	}

	@Override
	public void beginTransaction() {
		entityManager.getTransaction().begin();
	}
	
	

}
