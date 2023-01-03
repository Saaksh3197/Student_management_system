package student_management_system.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import student_management_system.service.Student_service;

@Controller
public class Student_Controller {
	private Student_service student_service;

	public Student_Controller(Student_service student_service) {
		super();
		this.student_service = student_service;
	}
	
	@GetMapping("list of students")
	 public String listStudent(Model model) {
		return "Student";
	}
	

}
