package com.optum.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.optum.bo.StudentBO;
import com.optum.dao.StudentDAO;
import com.optum.dto.StudentDTO;

@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentDAO dao;

	@Override
	public void createUser(StudentDTO studentDTO) {
		int result = 0;
		StudentBO bo = null;

		// create StudentBO class object
		bo = new StudentBO();

		// copy StudentDTO object data into StudentBO object
		BeanUtils.copyProperties(studentDTO, bo);

		result = dao.saveRecord(bo);

		if (result != 0) {
			System.out.println("Student Record Saved Successfully");
		} else {
			System.out.println("Oops! Some problem occrured");
		}

	}// end of method

	@Override
	public List<StudentDTO> getAllStudent() {
		List<StudentDTO> listDTO = new ArrayList<StudentDTO>();
		List<StudentBO> listBO = null;

		listBO = dao.getAllUser();

		listBO.forEach(bo -> {
			StudentDTO dto = new StudentDTO();

			BeanUtils.copyProperties(bo, dto);

			listDTO.add(dto);
		});

		return listDTO;
	}

	@Override
	public StudentDTO retrieveStudent(int stdNo) {
		StudentBO bo = null;
		StudentDTO dto = null;

		dto = new StudentDTO();

		bo = dao.getStudent(stdNo);

		BeanUtils.copyProperties(bo, dto);

		return dto;
	}

	@Override
	public void updateUser(StudentDTO studentDTO) {
		int result = 0;
		StudentBO bo = null;

		// create StudentBO class object
		bo = new StudentBO();

		// copy StudentDTO object data into StudentBO object
		BeanUtils.copyProperties(studentDTO, bo);

		result = dao.updateRecord(bo);

		if (result != 0) {
			System.out.println("Student Record updated Successfully");
		} else {
			System.out.println("Oops! Some problem occrured");
		}

	}

	@Override
	public void deleteUser(int stdNo) {
		int result = 0;

		result = dao.deleteRecord(stdNo);

		if (result != 0) {
			System.out.println("Student Record deleted Successfully");
		} else {
			System.out.println("Oops! Some problem occrured");
		}
	}
}
