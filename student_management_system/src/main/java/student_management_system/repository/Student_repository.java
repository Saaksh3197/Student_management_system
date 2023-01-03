package student_management_system.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import student_management_system.entity.Student;

public interface Student_repository extends JpaRepository<Student,Integer> {
	

}
