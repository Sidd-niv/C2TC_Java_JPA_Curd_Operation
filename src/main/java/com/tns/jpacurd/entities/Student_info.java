package com.tns.jpacurd.entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="Student_info")
public class Student_info implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private int studId;
	
	private String studName;

	public int getStudId() {
		return studId;
	}

	public void setStudId(int studId) {
		this.studId = studId;
	}

	public String getStudName() {
		return studName;
	}

	public void setStudName(String studName) {
		this.studName = studName;
	}
	
	

}
