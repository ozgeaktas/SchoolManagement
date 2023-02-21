package com.ozgeakdas.schoolmanagement.controller;

import com.ozgeakdas.schoolmanagement.model.Course;
import com.ozgeakdas.schoolmanagement.requests.course.CreateCourseRequest;
import com.ozgeakdas.schoolmanagement.requests.course.UpdateCourseRequest;
import com.ozgeakdas.schoolmanagement.responses.course.CreateCourseResponse;
import com.ozgeakdas.schoolmanagement.responses.course.GetAllCourseResponse;
import com.ozgeakdas.schoolmanagement.responses.course.UpdateCourseResponse;
import com.ozgeakdas.schoolmanagement.service.CourseService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/courses")
public class CourseController {
    private final CourseService courseService;

    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    @GetMapping
    public List<GetAllCourseResponse> getAll() {
        return courseService.getAll();
    }

    @GetMapping("/{id}")
    public Course getById(@PathVariable int id) {
        return courseService.getById(id);
    }

    @PostMapping
    @ResponseStatus(code = org.springframework.http.HttpStatus.CREATED)
    public CreateCourseResponse create(@RequestBody CreateCourseRequest course) {
        return courseService.create(course);
    }

    @PutMapping("/{id}")
    public UpdateCourseResponse update(@RequestBody UpdateCourseRequest course, @PathVariable int id) {
        return courseService.update(course, id);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(code = org.springframework.http.HttpStatus.NO_CONTENT)
    public void delete(@PathVariable int id) {
        courseService.delete(id);
    }

}
