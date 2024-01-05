package com.microservice.course.coursemicroservice.service;

import com.microservice.course.coursemicroservice.entities.Course;

import java.util.List;

public interface ICourseService {

    List<Course> findAll();

    Course findById(Long id);

    void save(Course course);
}
