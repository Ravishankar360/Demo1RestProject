package com.demo1Rest.controller;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo1Rest.entity.Course;
import com.demo1Rest.service.CourseServiceImpl;

@RestController
public class CourseRestController {
	
	@Autowired
	private CourseServiceImpl courseServiceImpl;
	
	@GetMapping("/getCourse")
	public List<Course> getCourse(){
		return this.courseServiceImpl.getCourse();
	}
	
	@PostMapping("/addCourse")
	public Course addCourse(@RequestBody Course course){
		return this.courseServiceImpl.addCourse(course);
	}
	
	@PostMapping("/updateCourse/{courseId}")
	public Course updateCourse(@RequestBody Course course){
		return this.courseServiceImpl.updateCourse(course);
	}
	
	@DeleteMapping("/deleteCourse/{courseId}")
	public ResponseEntity<HttpStatus> deleteCourse(@PathVariable Long parsecourseId){
		try {
			this.courseServiceImpl.deleteCourse(parsecourseId);
			return new ResponseEntity<>(HttpStatus.OK);
		}catch(Exception e){
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	
	
	

}
