package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
   
	@Autowired
	ControllerInterface student;
	
	@GetMapping("/get")
	public List<Student> getall() {
		return student.getall();
	}
	
	@DeleteMapping("/del/{sid}")
	public Student delete(@PathVariable int sid)
	{
		return student.del(sid);
	}
}
