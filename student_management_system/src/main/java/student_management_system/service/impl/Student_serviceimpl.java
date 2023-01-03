package student_management_system.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import student_management_system.entity.Student;
import student_management_system.repository.Student_repository;
import student_management_system.service.Student_service;

@Service
public class Student_serviceimpl implements Student_service {
	private Student_repository studentrepositoy;
	

	public Student_serviceimpl(Student_repository studentrepositoy) {
		super();
		this.studentrepositoy = studentrepositoy;
	}


	@Override
	public List<Student> getALLStudent() {
		
		return studentrepositoy.findAll() ;
	}
	 
}
