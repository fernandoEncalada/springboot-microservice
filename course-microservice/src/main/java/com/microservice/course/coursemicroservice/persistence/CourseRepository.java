package com.microservice.course.coursemicroservice.persistence;

import com.microservice.course.coursemicroservice.entities.Course;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends CrudRepository<Course, Long> {
}
