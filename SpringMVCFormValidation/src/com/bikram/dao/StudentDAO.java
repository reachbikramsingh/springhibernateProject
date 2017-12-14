package com.bikram.dao;

import com.bikram.model.Student;

public interface StudentDAO {
	public abstract boolean saveStudent(Student student);

	public Student getStudentDetailsByEmailAndPassword(String email, String password);
}
