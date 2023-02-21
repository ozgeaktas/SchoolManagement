package com.ozgeakdas.schoolmanagement.mapper;

import com.ozgeakdas.schoolmanagement.model.Student;
import com.ozgeakdas.schoolmanagement.requests.student.CreateStudentRequest;
import com.ozgeakdas.schoolmanagement.requests.student.UpdateStudentRequest;
import com.ozgeakdas.schoolmanagement.responses.student.CreateStudentResponse;
import com.ozgeakdas.schoolmanagement.responses.student.GetAllStudentResponse;
import com.ozgeakdas.schoolmanagement.responses.student.UpdateStudentResponse;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

import java.util.List;

@Mapper(componentModel = "spring")
public interface StudentMapper {
    GetAllStudentResponse toGetAllStudentResponse(Student student);
    List<GetAllStudentResponse> toGetAllStudentResponse(List<Student> students);
    Student toStudent(CreateStudentRequest request);
    CreateStudentResponse toCreateStudentResponse(Student student);
    void update(@MappingTarget Student student, UpdateStudentRequest request);
    UpdateStudentResponse toUpdateStudentResponse(Student student);
}
