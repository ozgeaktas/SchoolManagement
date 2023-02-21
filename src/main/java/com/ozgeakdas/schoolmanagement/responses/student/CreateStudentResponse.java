package com.ozgeakdas.schoolmanagement.responses.student;

import com.ozgeakdas.schoolmanagement.responses.course.CourseResponse;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CreateStudentResponse {
    private int id;
    private String name;
    private List<CourseResponse> courses;
}
