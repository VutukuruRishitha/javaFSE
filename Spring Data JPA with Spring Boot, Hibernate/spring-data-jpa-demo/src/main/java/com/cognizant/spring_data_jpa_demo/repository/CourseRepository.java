package com.cognizant.spring_data_jpa_demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cognizant.spring_data_jpa_demo.model.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Integer> {

}