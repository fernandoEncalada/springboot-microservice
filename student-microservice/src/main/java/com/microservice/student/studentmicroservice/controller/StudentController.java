package com.microservice.student.studentmicroservice.controller;

import com.microservice.student.studentmicroservice.entities.Student;
import com.microservice.student.studentmicroservice.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/student")
public class StudentController {
    @Autowired
    private IStudentService studentService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void saveStudent(@RequestBody Student student) {
        studentService.save(student);
    }

    @GetMapping("/all")
    public ResponseEntity<?> findAllStudents() {
        return ResponseEntity.ok(studentService.findAll());
    }

    @GetMapping("/search/{id}")
    public ResponseEntity<?> findById(@PathVariable Long id) {
        return ResponseEntity.ok(studentService.findById(id));
    }

}
