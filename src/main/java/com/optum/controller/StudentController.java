package com.optum.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.optum.dto.StudentDTO;
import com.optum.model.Student;
import com.optum.service.StudentService;

@Controller
public class StudentController {
	@Autowired
	private StudentService service;

	@RequestMapping(value = "/home")
	public String homePage(Map<String, Object> map) {
		map.put("listDTO", service.getAllStudent());
		
		return "home";
	}

	@RequestMapping(value = "/showForm")
	public String addForm() {
		return "add_form";
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String addRecord(Map<String, Object> map, Student student) {
		StudentDTO dto = null;

		// create StudentDTO class object
		dto = new StudentDTO();

		dto.setStdNo(Integer.parseInt(student.getStdNo()));
		dto.setStdName(student.getStdName());
		dto.setStdAge(Integer.parseInt(student.getStdAge()));
		dto.setStdAadharNo(Long.parseLong(student.getStdAadharNo()));

		service.createUser(dto);
		
		map.put("listDTO", service.getAllStudent());

		return "home";
	}
	
	@RequestMapping(value="/editForm",method=RequestMethod.POST)
	public String editRecordForm(Map<String, Object> map,@RequestParam("stdNo") String stdNo) {
		map.put("dto", service.retrieveStudent(Integer.parseInt(stdNo)));
		return "edit_form";
	}
	@RequestMapping(value="/deleteForm",method=RequestMethod.POST)
	public String deleteRecordForm(Map<String, Object> map,@RequestParam("stdNo") String stdNo) {
		map.put("dto", service.retrieveStudent(Integer.parseInt(stdNo)));
		return "delete_form";
	}
	
	@RequestMapping(value="/edit",method=RequestMethod.POST)
	public String editRecord(Map<String, Object> map,Student student) {
		StudentDTO dto = null;

		// create StudentDTO class object
		dto = new StudentDTO();

		dto.setStdNo(Integer.parseInt(student.getStdNo()));
		dto.setStdName(student.getStdName());
		dto.setStdAge(Integer.parseInt(student.getStdAge()));
		dto.setStdAadharNo(Long.parseLong(student.getStdAadharNo()));
		
		service.updateUser(dto);
		
		map.put("listDTO", service.getAllStudent());
		
		return "home";
	}
	@RequestMapping(value="/delete",method=RequestMethod.POST)
	public String deleteRecord(Map<String, Object> map,Student student) {
		
		service.deleteUser(Integer.parseInt(student.getStdNo()));
		
		map.put("listDTO", service.getAllStudent());
		
		return "home";
	}
	

}
