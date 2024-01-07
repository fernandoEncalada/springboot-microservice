package com.microservice.course.coursemicroservice.http.response;

import com.microservice.course.coursemicroservice.dto.StudentDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class StudentsByCourseResponse {

    private String courseName;
    private String teacher;
    private List<StudentDto> studentDtoList;

}
