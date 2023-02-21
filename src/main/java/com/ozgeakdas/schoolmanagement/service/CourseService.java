package com.ozgeakdas.schoolmanagement.service;


import com.ozgeakdas.schoolmanagement.mapper.CourseMapper;
import com.ozgeakdas.schoolmanagement.model.Course;
import com.ozgeakdas.schoolmanagement.repository.CourseRepository;
import com.ozgeakdas.schoolmanagement.requests.course.CreateCourseRequest;
import com.ozgeakdas.schoolmanagement.requests.course.UpdateCourseRequest;
import com.ozgeakdas.schoolmanagement.responses.course.CreateCourseResponse;
import com.ozgeakdas.schoolmanagement.responses.course.GetAllCourseResponse;
import com.ozgeakdas.schoolmanagement.responses.course.UpdateCourseResponse;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CourseService {
    CourseRepository courseRepository;
    CourseMapper mapper;


    public List<GetAllCourseResponse> getAll() {
        List<Course> courses = courseRepository.findAll();
        return mapper.toGetAllCourseResponse(courses);
    }


    public Course getById(int id) {
        return courseRepository.findById(id).orElse(null);
    }


    public CreateCourseResponse create(CreateCourseRequest request) {
        Course course = mapper.toCourse(request);


        courseRepository.save(course);

        return mapper.toCreateCourseResponse(course);
    }


    public UpdateCourseResponse update(UpdateCourseRequest request, int id) {
        Course course= courseRepository.findById(id).get();
        mapper.update(course, request);


        courseRepository.save(course);

        return mapper.toUpdateCourseResponse(course);
    }

    public void delete(int id) {
        courseRepository.deleteById(id);
    }
}
