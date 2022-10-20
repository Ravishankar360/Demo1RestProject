package com.demo1Rest.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo1Rest.entity.Course;

// @Repository (This is not mandatory)
public interface CourseDao extends JpaRepository<Course, Long>{

}
