package com.example.demo;

import java.util.*;

@org.springframework.stereotype.Service
public class Service implements ControllerInterface {
	

	List <Student> students=null;
	
	Service(){
		students=new ArrayList <Student>();
		
		students.add(new Student(1,"abhinav","mca"));
		students.add(new Student(2,"akshay","mca"));
		students.add(new Student(3,"sumit","btech"));
	}

	@Override
	public List<Student> getall() {
		// TODO Auto-generated method stub
		return students;
	}

	@Override
	public Student del(int sid) {
		// TODO Auto-generated method stub
		
		Student s=null;
		for(Student ss : students) {
			if(ss.getId()==sid) {
				s=ss;
				students.remove(ss);
				return s;
			}
		}
		return s;
	
	}
	

	
}
