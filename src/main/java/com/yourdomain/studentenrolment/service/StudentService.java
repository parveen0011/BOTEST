package com.yourdomain.studentenrolment.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import javax.validation.constraints.Size;

import org.springframework.stereotype.Service;

import com.yourdomain.studentenrolment.student.Student;

@Service
public class StudentService {

	private List<Student> students= new ArrayList<>(Arrays.asList(
			new Student(1,"Aman","Jain","A", "India"),
			new Student(2,"Rahul","Sharma","B", "Pakistan")
			));

	public List<Student> getAllStudents() {
		return students;
	}

	public Student getStudent(int id) {
		return students.stream().filter(s->s.getId()==id).findFirst().get();
	}
	
	public List<Student> getStudentByClass(String class_) {
		return students.stream().filter(s->s.getClass_().equalsIgnoreCase(class_)).collect(Collectors.toList());
	}

	public void addStudent(Student student) {
		students.add(student);
	}

	public void updateStudent(int id, Student student) {
		for(int i=0; i< students.size(); i++) {
			Student s = students.get(i);
			if(s.getId()==id) {
				students.set(i, student);
				return;
			}
		}
	}

	public void deleteStudent(int id) {
		students.removeIf(t-> t.getId()==id);

	}
}
