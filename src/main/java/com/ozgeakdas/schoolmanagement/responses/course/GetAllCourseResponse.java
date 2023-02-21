package com.ozgeakdas.schoolmanagement.responses.course;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class GetAllCourseResponse {
    private int id;
    private String name;
    private String studentName;
}
