package com.yourdomain.studentenrolment.student.cotroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.yourdomain.studentenrolment.student.Student;
import com.yourdomain.studentenrolment.service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	private StudentService studentService;

	@RequestMapping("/fetchStudents")
	public List<Student> getAllStudents() {
		return studentService.getAllStudents();
	}
	
	@RequestMapping("/fetchStudents/id={id}")
	public Student getStudent(@PathVariable int id) {
		return studentService.getStudent(id);
	}
	
	@RequestMapping("/fetchStudents/class={class_}")
	public List<Student> getStudentByClass(@PathVariable String class_) {
		return studentService.getStudentByClass(class_);
	}
	
	@RequestMapping(method=RequestMethod.POST, value= "/addStudent")
	public void addStudent(@RequestBody Student student) {
		studentService.addStudent(student);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value= "/updateStudent/id={id}")
	public void updateStudent(@RequestBody Student student, @PathVariable int id) {
		studentService.updateStudent(id, student);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value= "/deleteStudent/id={id}")
	public void deleteStudent(@PathVariable int id) {
		studentService.deleteStudent(id);
	}
}
