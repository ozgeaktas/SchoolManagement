package com.ozgeakdas.schoolmanagement.service;

import com.ozgeakdas.schoolmanagement.mapper.StudentMapper;
import com.ozgeakdas.schoolmanagement.model.Student;
import com.ozgeakdas.schoolmanagement.repository.StudentRepository;
import com.ozgeakdas.schoolmanagement.requests.student.CreateStudentRequest;
import com.ozgeakdas.schoolmanagement.requests.student.UpdateStudentRequest;
import com.ozgeakdas.schoolmanagement.responses.student.CreateStudentResponse;
import com.ozgeakdas.schoolmanagement.responses.student.GetAllStudentResponse;
import com.ozgeakdas.schoolmanagement.responses.student.UpdateStudentResponse;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class StudentService {
    StudentRepository studentRepository;
    StudentMapper mapper;


    public List<GetAllStudentResponse> getAll() {
        List<Student> students = studentRepository.findAll();
        return mapper.toGetAllStudentResponse(students);
    }


    public Student getById(int id) {
        return studentRepository.findById(id).orElse(null);
    }


    public CreateStudentResponse create(CreateStudentRequest request) {
        Student student = mapper.toStudent(request);


        studentRepository.save(student);

        return mapper.toCreateStudentResponse(student);
    }


    public UpdateStudentResponse update(UpdateStudentRequest request, int id) {
        Student student= studentRepository.findById(id).get();
        mapper.update(student, request);


        studentRepository.save(student);

        return mapper.toUpdateStudentResponse(student);
    }

    public void delete(int id) {
       studentRepository.deleteById(id);
    }
}
