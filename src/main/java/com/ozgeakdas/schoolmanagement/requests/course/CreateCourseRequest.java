package com.ozgeakdas.schoolmanagement.requests.course;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CreateCourseRequest {
    private String name;
    private int studentId;
}
