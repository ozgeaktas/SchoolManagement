package com.ozgeakdas.schoolmanagement.responses;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CreateCourseResponse {
    private int id;
    private int studentId;
    private String name;
}
