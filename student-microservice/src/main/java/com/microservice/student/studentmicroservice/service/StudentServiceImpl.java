package com.microservice.student.studentmicroservice.service;

import com.microservice.student.studentmicroservice.entities.Student;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentServiceImpl implements IStudentService{
    @Override
    public List<Student> findAll() {
        return null;
    }

    @Override
    public Student findById(Long id) {
        return null;
    }

    @Override
    public void save(Student student) {

    }

    @Override
    public List<Student> findByIdCourse(Long idCourse) {
        return null;
    }
}
