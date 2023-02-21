package com.ozgeakdas.schoolmanagement.mapper;

import com.ozgeakdas.schoolmanagement.model.Course;
import com.ozgeakdas.schoolmanagement.requests.course.CreateCourseRequest;
import com.ozgeakdas.schoolmanagement.requests.course.UpdateCourseRequest;
import com.ozgeakdas.schoolmanagement.responses.course.CreateCourseResponse;
import com.ozgeakdas.schoolmanagement.responses.course.GetAllCourseResponse;
import com.ozgeakdas.schoolmanagement.responses.course.UpdateCourseResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CourseMapper {
    @Mapping(source = "student.name", target = "studentName")
    GetAllCourseResponse toGetAllCourseResponse(Course course);
    List<GetAllCourseResponse> toGetAllCourseResponse(List<Course> courses);
    @Mapping(source = "studentId", target = "student.id")
    Course toCourse(CreateCourseRequest request);
    @Mapping(source = "student.id", target = "studentId")
    CreateCourseResponse toCreateCourseResponse(Course course);

    void update(@MappingTarget Course course, UpdateCourseRequest request);
    @Mapping(source = "student.id", target = "studentId")
    UpdateCourseResponse toUpdateCourseResponse(Course course);
}
