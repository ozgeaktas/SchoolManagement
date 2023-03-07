package com.ozgeakdas.schoolmanagement.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Student {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;
    @Size(min=2,message="Enter at least 2 character ")
    private String name;
    private int age;
    @JsonManagedReference
    @OneToMany(mappedBy = "student", cascade = CascadeType.DETACH)
    private List<Course> courses = new ArrayList<>();
}
