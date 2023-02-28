package com.jpa.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jpa.entity.Course;
@Repository
public interface CourseRepository extends CrudRepository<Course, Long> {

	
	

}
