package com.demo1Rest.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.demo1Rest.entity.Course;

//@Service
public interface CourseService {

	public List<Course> getCourse();

	public Course addCourse(Course course);

	public Course updateCourse(Course course);

	public void deleteCourse(long parseLong);

}
