package com.optum.service;

import java.util.List;

import com.optum.dto.StudentDTO;

public interface StudentService {
	public void createUser(StudentDTO studentDTO);
	public void updateUser(StudentDTO studentDTO);
	public void deleteUser(int stdNo);
	public List<StudentDTO> getAllStudent();
	public StudentDTO retrieveStudent(int stdNo);
}
