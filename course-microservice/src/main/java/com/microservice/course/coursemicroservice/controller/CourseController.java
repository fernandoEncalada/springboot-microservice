package com.microservice.course.coursemicroservice.controller;

import com.microservice.course.coursemicroservice.entities.Course;
import com.microservice.course.coursemicroservice.service.ICourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/courses")
public class CourseController {

    @Autowired
    private ICourseService courseService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void saveCourse(@RequestBody Course student) {
        courseService.save(student);
    }

    @GetMapping("/all")
    public ResponseEntity<?> findAllCourses() {
        return ResponseEntity.ok(courseService.findAll());
    }

    @GetMapping("/search/{id}")
    public ResponseEntity<?> findById(@PathVariable Long id) {
        return ResponseEntity.ok(courseService.findById(id));
    }

    @GetMapping("/search-students/{idCourse}")
    public ResponseEntity<?> findStudentsByCouse(@PathVariable Long idCourse) {
        return ResponseEntity.ok(courseService.findStudentsByIdCourse(idCourse));
    }
}
