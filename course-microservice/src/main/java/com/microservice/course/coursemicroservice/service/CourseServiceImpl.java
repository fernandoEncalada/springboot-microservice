package com.microservice.course.coursemicroservice.service;

import com.microservice.course.coursemicroservice.client.StudentClient;
import com.microservice.course.coursemicroservice.dto.StudentDto;
import com.microservice.course.coursemicroservice.entities.Course;
import com.microservice.course.coursemicroservice.http.response.StudentsByCourseResponse;
import com.microservice.course.coursemicroservice.persistence.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImpl implements ICourseService {
    @Autowired
    private CourseRepository courseRepository;
    @Autowired
    private StudentClient studentClient;

    @Override
    public List<Course> findAll() {
        return (List<Course>) courseRepository.findAll();
    }

    @Override
    public Course findById(Long id) {
        return courseRepository.findById(id).orElseThrow();
    }

    @Override
    public void save(Course course) {
        courseRepository.save(course);
    }

    @Override
    public StudentsByCourseResponse findStudentsByIdCourse(Long idCourse) {

        Course course = courseRepository.findById(idCourse).orElse(new Course());

        List<StudentDto> students = studentClient.findAllStudentsByCourse(course.getId());

        return StudentsByCourseResponse.builder()
                .courseName(course.getName())
                .teacher(course.getTeacher())
                .studentDtoList(students)
                .build();
    }
}
