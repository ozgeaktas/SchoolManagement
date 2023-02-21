package com.ozgeakdas.schoolmanagement.controller;

import com.ozgeakdas.schoolmanagement.model.Student;
import com.ozgeakdas.schoolmanagement.requests.student.CreateStudentRequest;
import com.ozgeakdas.schoolmanagement.requests.student.UpdateStudentRequest;
import com.ozgeakdas.schoolmanagement.responses.student.CreateStudentResponse;
import com.ozgeakdas.schoolmanagement.responses.student.GetAllStudentResponse;
import com.ozgeakdas.schoolmanagement.responses.student.UpdateStudentResponse;
import com.ozgeakdas.schoolmanagement.service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/students")
public class StudentController {
    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    public List<GetAllStudentResponse> getAll() {
        return studentService.getAll();
    }

    @GetMapping("/{id}")
    public Student getById(@PathVariable int id) {
        return studentService.getById(id);
    }

    @PostMapping
    @ResponseStatus(code = org.springframework.http.HttpStatus.CREATED)
    public CreateStudentResponse create(@RequestBody CreateStudentRequest student) {
        return studentService.create(student);
    }

    @PutMapping("/{id}")
    public UpdateStudentResponse update(@RequestBody UpdateStudentRequest student, @PathVariable int id) {
        return studentService.update(student, id);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(code = org.springframework.http.HttpStatus.NO_CONTENT)
    public void delete(@PathVariable int id) {
        studentService.delete(id);
    }
}
